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
    }


}

