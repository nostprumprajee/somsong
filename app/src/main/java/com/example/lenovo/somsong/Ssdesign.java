package com.example.lenovo.somsong;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 27/8/2559.
 */

//หน้าที่เชื่อมกับหน้า ssdesign.xml
public class Ssdesign extends Activity {
    @Override

    //แสดงผลหน้า ssdesign.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ssdesign);
    }

    //ถ้าเลือกรูปแบบใบหน้าเป็น เหลี่ยม จะไปเรียกหน้า Derectang.class ขึ้นมาแสดง
    public void OnClickderectang(View view){
        Button ssdebut = (Button)findViewById(R.id.button4);
        Intent intenttt = new Intent(Ssdesign.this,Derectang.class);
        startActivity(intenttt);
    }

    //ถ้าเลือกรูปแบบใบหน้าเป็น รี จะไปเรียกหน้า Dere.class ขึ้นมาแสดง
    public void OnClickdere(View view){
        Button ssdebut = (Button)findViewById(R.id.button8);
        Intent intenttt = new Intent(Ssdesign.this,Dere.class);
        startActivity(intenttt);
    }

    //ถ้าเลือกรูปแบบใบหน้าเป็น กลม จะไปเรียกหน้า Dekom.class ขึ้นมาแสดง
    public void OnClickdekom(View view){
        Button ssdebut = (Button)findViewById(R.id.kom);
        Intent intenttt = new Intent(Ssdesign.this,Dekom.class);
        startActivity(intenttt);
    }

    //ถ้าเลือกรูปแบบใบหน้าเป็น เพชร จะไปเรียกหน้า Dedai.class ขึ้นมาแสดง
    public void OnClickdedai(View view){
        Button ssdebut = (Button)findViewById(R.id.button7);
        Intent intenttt = new Intent(Ssdesign.this,Dedai.class);
        startActivity(intenttt);
    }

}