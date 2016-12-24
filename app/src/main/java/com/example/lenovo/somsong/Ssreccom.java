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
 * Created by lenovo on 25/8/2559.
 */

//หน้าที่เชื่อมกับหน้า ssreccom.xml
public class Ssreccom extends Activity {
    @Override

    //แสดงหน้า ssreccom.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ssreccom);
    }

    //ถ้าเลือก ยอดนิยม จะไปเรียกหน้า Pop.class ขึ้นมาแสดง
    public void OnClickpop(View view){
        Button sspopbut = (Button)findViewById(R.id.pop);
        Intent intentp = new Intent(Ssreccom.this,Pop.class);
        startActivity(intentp);
    }

    //ถ้าเลือก รูปแบบใบหน้า จะไปเรียกหน้า Face.class ขึ้นมาแสดง
    public void OnClickface(View view){
        Button ssfacebut = (Button)findViewById(R.id.face);
        Intent intentf = new Intent(Ssreccom.this,Face.class);
        startActivity(intentf);
    }
}
