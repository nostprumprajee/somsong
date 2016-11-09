package com.example.lenovo.somsong;

import android.app.Activity;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.IOException;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


/**
 * Created by lenovo on 28/8/2559.
 */
public class Myss extends Activity {
    public static final int REQUEST_GALLERY = 1;

    Bitmap bitmap;

    ImageView imageView1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myss);

        imageView1 = (ImageView)findViewById(R.id.imageView);

        Button buttonIntent = (Button)findViewById(R.id.buttonIntent);
        buttonIntent.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(Intent.createChooser(intent
                        , "Select Picture"), REQUEST_GALLERY);
            }
        });

    }

    public void onActivityResult(int requestCode, int resultCode
            , Intent data) {
        if (requestCode == REQUEST_GALLERY && resultCode == RESULT_OK) {
            Uri uri = data.getData();
            try {
                bitmap = Media.getBitmap(this.getContentResolver(), uri);
                imageView1.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}