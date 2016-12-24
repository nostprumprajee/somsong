package com.example.lenovo.somsong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * Created by lenovo on 25/8/2559.
 */

//หน้าที่เชื่อมกับหน้า face.xml
public class Face extends Activity {
    @Override
    //แสดงหน้า diamond.xml
        protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.face);
    }
    //ถ้าเลือกรูปแบบหน้ากลมจะไปเรียกหน้า Kom.class ขึ้นมาแสดง
    public void OnClickKom(View view) {
        Button kombut = (Button) findViewById(R.id.kom);
        Intent intentkom = new Intent(Face.this, Kom.class);
        startActivity(intentkom);
    }
    //ถ้าเลือกรูปแบบหน้าเพชรจะไปเรียกหน้า Diamond.class ขึ้นมาแสดง
    public void OnClickdia(View view) {
        Button kombut = (Button) findViewById(R.id.button7);
        Intent intentkom = new Intent(Face.this, Diamond.class);
        startActivity(intentkom);
    }
    //ถ้าเลือกรูปแบบหน้ารีจะไปเรียกหน้า Re.class ขึ้นมาแสดง
    public void OnClickre(View view) {
        Button kombut = (Button) findViewById(R.id.button8);
        Intent intentkom = new Intent(Face.this, Re.class);
        startActivity(intentkom);
    }
    //ถ้าเลือกรูปแบบหน้าเหลี่ยมจะไปเรียกหน้า Rec.class ขึ้นมาแสดง
    public void OnClickrec(View view) {
        Button kombut = (Button) findViewById(R.id.button10);
        Intent intentkom = new Intent(Face.this, Rec.class);
        startActivity(intentkom);
    }

}
