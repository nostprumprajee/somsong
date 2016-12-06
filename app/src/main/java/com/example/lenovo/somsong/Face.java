package com.example.lenovo.somsong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 25/8/2559.
 */
public class Face extends Activity {
    @Override
        protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.face);
    }
    //กดไปยังโครงหน้าต่างๆตามที่เลือก
    public void OnClickKom(View view) {
        Button kombut = (Button) findViewById(R.id.kom);
        Intent intentkom = new Intent(Face.this, Kom.class);
        startActivity(intentkom);
    }
    public void OnClickdia(View view) {
        Button kombut = (Button) findViewById(R.id.button7);
        Intent intentkom = new Intent(Face.this, Diamond.class);
        startActivity(intentkom);
    }
    public void OnClickre(View view) {
        Button kombut = (Button) findViewById(R.id.button8);
        Intent intentkom = new Intent(Face.this, Re.class);
        startActivity(intentkom);
    }
    public void OnClickrec(View view) {
        Button kombut = (Button) findViewById(R.id.button10);
        Intent intentkom = new Intent(Face.this, Rec.class);
        startActivity(intentkom);
    }

}
