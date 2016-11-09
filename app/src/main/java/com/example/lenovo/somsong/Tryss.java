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
    public void OnClickman(View view){
        Button  ssdebut = (Button)findViewById(R.id.button6);
        Intent intent3 = new Intent(Tryss.this,Camm1.class);
        startActivity(intent3);
    }

    public void onClickwoman(View view){
        Button  ssdebut = (Button)findViewById(R.id.button12);
        Intent intent3 = new Intent(Tryss.this,Camw1.class);
        startActivity(intent3);
        int ii ;
        int jj;


    }


}

