package com.example.lenovo.somsong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    //หน้าที่เชื่อมกับหน้า activity_home.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    //ถ้าเลือกเมนูสมทรงแนะนำจะไปเรียกหน้า Ssreccom.class ขึ้นมาแสดง
    public void OnClickrec(View view){
        Button ssrecbut = (Button)findViewById(R.id.ssrec);
        Intent intentt = new Intent(Home.this,Ssreccom.class);
        startActivity(intentt);
    }

    //ถ้าเลือกเมนูออกแบบสมทรงจะไปเรียกหน้า Ssdesign.class ขึ้นมาแสดง
    public void OnClickde(View view){
        Button ssdebut = (Button)findViewById(R.id.button4);
        Intent intenttt = new Intent(Home.this,Ssdesign.class);
        startActivity(intenttt);
    }

    //ถ้าเลือกเมนูทดลองสมทรงจะไปเรียกหน้า Tryss.class ขึ้นมาแสดง
    public void OnClicktryss(View view){
        Button ssdebut = (Button)findViewById(R.id.button3);
        Intent intenttt = new Intent(Home.this,Tryss.class);
        startActivity(intenttt);
    }

    //ถ้าเลือกเมนูสมทรงของฉันจะไปเรียกหน้า Myss.class ขึ้นมาแสดง
    public void OnClickmyss(View view){
        Button ssdebut = (Button)findViewById(R.id.button5);
        Intent intenttt = new Intent(Home.this,Myss.class);
        startActivity(intenttt);
    }

}
