package com.example.lenovo.somsong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by lenovo on 28/8/2559.
 */

//หน้าที่เชื่อมกับหน้า tryss.xml
public class Tryss extends Activity {
    @Override

    //แสดงหน้า tryss.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tryss);
    }

    //ถ้าเลือก ชาย จะไปเรียกหน้า Camm1.class ขึ้นมาแสดง
    public void OnClickman(View view){
        Intent intent3 = new Intent(Tryss.this,Camm1.class);
        startActivity(intent3);
    }

    //ถ้าเลือก หญิง จะไปเรียกหน้า Camw1.class ขึ้นมาแสดง
    public void onClickwoman(View view){
        Intent intent3 = new Intent(Tryss.this,Camw1.class);
        startActivity(intent3);


    }


}

