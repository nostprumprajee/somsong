package com.example.lenovo.somsong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 27/8/2559.
 */
//ปุ่มเมนูเลือกโครงหน้าออกแบบทรงผม
public class Ssdesign extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ssdesign);
    }
    public void OnClickderectang(View view){
        Button ssdebut = (Button)findViewById(R.id.button4);
        Intent intenttt = new Intent(Ssdesign.this,Derectang.class);
        startActivity(intenttt);
    }
    public void OnClickdere(View view){
        Button ssdebut = (Button)findViewById(R.id.button8);
        Intent intenttt = new Intent(Ssdesign.this,Dere.class);
        startActivity(intenttt);
    }
    public void OnClickdekom(View view){
        Button ssdebut = (Button)findViewById(R.id.kom);
        Intent intenttt = new Intent(Ssdesign.this,Dekom.class);
        startActivity(intenttt);
    }
    public void OnClickdedai(View view){
        Button ssdebut = (Button)findViewById(R.id.button7);
        Intent intenttt = new Intent(Ssdesign.this,Dedai.class);
        startActivity(intenttt);
    }

}