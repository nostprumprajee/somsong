package com.example.lenovo.somsong;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 26/8/2559.
 */

//หน้าที่เชื่อมกับหน้า kom.xml
public class Kom extends Activity {
    @Override
    //แสดงหน้า kom.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kom);
    }

}