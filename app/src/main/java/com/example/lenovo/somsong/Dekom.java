package com.example.lenovo.somsong;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import android.widget.RelativeLayout;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.graphics.Bitmap;
import android.text.format.DateFormat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by lenovo on 27/8/2559.
 */

//หน้าที่เชื่อมกับหน้า dekom.xml
public class Dekom extends Activity {

    //แต่ละปุ่มแทนการเลือกทรงผมแต่ละทรง
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dekom);


        //code ที่ใช้ในการ save รูปภาพจากหน้าจอไปไว้ในอัลบั้ม MySomsong
        Button btnSaveAll = (Button)findViewById(R.id.savebot);
        btnSaveAll.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                View view = findViewById(android.R.id.content).getRootView();
                view.setDrawingCacheEnabled(true);
                Bitmap bm = Bitmap.createBitmap(view.getDrawingCache());
                view.setDrawingCacheEnabled(false);
//โค้ดเซฟไฟล์รูปภาพ
                try {
                    Date d = new Date();
                    String filename  = (String)DateFormat.format("kkmmss-MMddyyyy"
                            , d.getTime());

                    File mkdirr = new File(Environment.getExternalStorageDirectory()
                            , "/MySomsong/");
                    mkdirr.mkdirs();
                    File dir = new File(Environment.getExternalStorageDirectory()
                            , "/MySomsong/" + filename + ".jpg");
                    FileOutputStream out = new FileOutputStream(dir);
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    bm.compress(Bitmap.CompressFormat.JPEG, 100, bos);
                    out.write(bos.toByteArray());
                    Toast.makeText(getApplicationContext(), "Already Saved."
                            , Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }  catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        addListenerOnButton();





    }
    //กดเปลี่ยนทรงผมของการออกแบบ
    public void addListenerOnButton() {

        image = (ImageView) findViewById(R.id.imageView1);

//รับค่าว่าผู้ใช้กดทรงผมไหนมา และ แสดงผลตามทรงผมที่กดมา
        button1 = (Button) findViewById(R.id.m1);
        button1.setOnClickListener(new OnClickListener() {

                                       @Override
                                       public void onClick(View arg0) {
                                           image.setImageResource(R.drawable.mkom1);
                                       }

                                   }
        );
        button2 = (Button) findViewById(R.id.m2);
        button2.setOnClickListener(new OnClickListener() {
                                       @Override
                                       public void onClick(View arg0) {
                                           image.setImageResource(R.drawable.mkom2);
                                       }
                                   }
        );
        button3 = (Button) findViewById(R.id.m3);
        button3.setOnClickListener(new OnClickListener() {
                                       @Override
                                       public void onClick(View arg0) {
                                           image.setImageResource(R.drawable.mkom3);
                                       }
                                   }
        );
        button4 = (Button) findViewById(R.id.w1);
        button4.setOnClickListener(new OnClickListener() {
                                       @Override
                                       public void onClick(View arg0) {
                                           image.setImageResource(R.drawable.wkom1);
                                       }
                                   }
        );
        button5 = (Button) findViewById(R.id.w2);
        button5.setOnClickListener(new OnClickListener() {
                                       @Override
                                       public void onClick(View arg0) {
                                           image.setImageResource(R.drawable.wkom2);
                                       }
                                   }
        );
        button6 = (Button) findViewById(R.id.w3);
        button6.setOnClickListener(new OnClickListener() {
                                       @Override
                                       public void onClick(View arg0) {
                                           image.setImageResource(R.drawable.wkom3);
                                       }
                                   }
        );
    }


}



