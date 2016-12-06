package com.example.lenovo.somsong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 25/8/2559.
 */
//เมนูคำแนะนำทรงผมที่เหมาะกับใบหน้า
public class Ssreccom extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ssreccom);
    }
    public void OnClickpop(View view){
        Button sspopbut = (Button)findViewById(R.id.pop);
        Intent intentp = new Intent(Ssreccom.this,Pop.class);
        startActivity(intentp);
    }
    public void OnClickface(View view){
        Button ssfacebut = (Button)findViewById(R.id.face);
        Intent intentf = new Intent(Ssreccom.this,Face.class);
        startActivity(intentf);
    }
}
