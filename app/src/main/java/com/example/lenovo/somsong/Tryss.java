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
public class Tryss extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tryss);
    }
    public void OnClickm1(View view){
        ImageButton ssdebut = (ImageButton)findViewById(R.id.imageButton3);
        Intent intenttt = new Intent(Tryss.this,Camm1.class);
        startActivity(intenttt);
    }
    public void OnClickm2(View view) {
        ImageButton ssdebut = (ImageButton)findViewById(R.id.imageButton);
        Intent intent2 = new Intent(Tryss.this, Camm2.class);
        startActivity(intent2);
    }
    public void OnClickm3(View view){
        ImageButton ssdebut = (ImageButton)findViewById(R.id.imageButton2);
        Intent intent3 = new Intent(Tryss.this,Camm3.class);
        startActivity(intent3);
    }
    public void OnClickw1(View view){
        ImageButton ssdebut = (ImageButton)findViewById(R.id.button6);
        Intent intent3 = new Intent(Tryss.this,Camw1.class);
        startActivity(intent3);
    }
    public void OnClickw2(View view){
        ImageButton ssdebut = (ImageButton)findViewById(R.id.button12);
        Intent intent3 = new Intent(Tryss.this,Camw2.class);
        startActivity(intent3);
    }
    public void OnClickw3(View view){
        ImageButton ssdebut = (ImageButton)findViewById(R.id.button13);
        Intent intent3 = new Intent(Tryss.this,Camw3.class);
        startActivity(intent3);
        int a=0;
    }


}

