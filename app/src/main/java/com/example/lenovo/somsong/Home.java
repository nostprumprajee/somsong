package com.example.lenovo.somsong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void OnClickrec(View view){
        Button ssrecbut = (Button)findViewById(R.id.ssrec);
        Intent intentt = new Intent(Home.this,Ssreccom.class);
        startActivity(intentt);
    }

    public void OnClickde(View view){
        Button ssdebut = (Button)findViewById(R.id.button4);
        Intent intenttt = new Intent(Home.this,Ssdesign.class);
        startActivity(intenttt);
    }
    public void OnClicktryss(View view){
        Button ssdebut = (Button)findViewById(R.id.button3);
        Intent intenttt = new Intent(Home.this,Tryss.class);
        startActivity(intenttt);
    }

    public void OnClickmyss(View view){
        Button ssdebut = (Button)findViewById(R.id.button5);
        Intent intenttt = new Intent(Home.this,Myss.class);
        startActivity(intenttt);
    }

}
