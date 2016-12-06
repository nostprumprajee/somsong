package com.example.lenovo.somsong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 25/8/2559.
 */
public class Pop extends Activity {
    @Override
    //เลือกทรงผมยอดนิยมชายหญิง
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop);
    }
    public void OnClickpopm(View view){
        Button kombut = (Button)findViewById(R.id.button9);
        Intent intentkom = new Intent(Pop.this,Popman.class);
        startActivity(intentkom);
    }
    public void OnClickpopw(View view){
        Button kombut = (Button)findViewById(R.id.button11);
        Intent intentkom = new Intent(Pop.this,Popwo.class);
        startActivity(intentkom);
    }
}
