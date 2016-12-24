package com.example.lenovo.somsong;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 27/8/2559.
 */
//หน้าที่เชื่อมกับหน้า popman.xml
public class Popman extends Activity {
    @Override
    //แสดงผลหน้า popman.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popman);
    }
}