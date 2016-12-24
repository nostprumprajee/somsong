package com.example.lenovo.somsong;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;

/**
 * Created by lenovo on 27/8/2559.
 */

//หน้าที่เชื่อมกับหน้า rec.xml
public class Rec extends Activity {
    //คำแนะนำทรงผม
    @Override
    //แสดงหน้า rec.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rec);
    }}