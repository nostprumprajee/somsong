package com.example.lenovo.somsong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 25/8/2559.
 */

//หน้าที่เชื่อมกับหน้า pop.xml
public class Pop extends Activity {
    @Override

    //แสดงผลหน้า pop.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop);
    }

    //ถ้าเลือกยอดนิยม ชาย จะไปเรียกหน้า Popman.class ขึ้นมาแสดง
    public void OnClickpopm(View view){
        Button kombut = (Button)findViewById(R.id.button9);
        Intent intentkom = new Intent(Pop.this,Popman.class);
        startActivity(intentkom);
    }

    //ถ้าเลือกยอดนิยม หญิง จะไปเรียกหน้า Popwo.class ขึ้นมาแสดง
    public void OnClickpopw(View view){
        Button kombut = (Button)findViewById(R.id.button11);
        Intent intentkom = new Intent(Pop.this,Popwo.class);
        startActivity(intentkom);
    }
}
