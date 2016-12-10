package com.example.lenovo.somsong;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by lenovo on 27/8/2559.
 */

//หน้าที่เชื่อมกับหน้า re.xml
public class Re extends Activity {
    @Override
    //แสดงหน้า re.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.re);
    }}