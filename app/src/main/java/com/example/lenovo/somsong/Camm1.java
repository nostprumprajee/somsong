package com.example.lenovo.somsong;

/**
 * Created by lenovo on 28/8/2559.
 */
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Environment;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.app.Activity;
import android.hardware.Camera.CameraInfo;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Camm1 extends Activity implements SurfaceHolder.Callback {
    Camera mCamera;
    private static final String TAG = "CAMERA";
    static final int  REQUEST_CAMERA_PERMISSION = 1;
    SurfaceView mPreview;

    private boolean checkPermission(){
        if (android.os.Build.VERSION.SDK_INT >= 23 &&
                ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)==
                        PackageManager.PERMISSION_DENIED) {
            requestPermissions(new String[]{Manifest.permission.CAMERA}, REQUEST_CAMERA_PERMISSION);
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[]   permissions, int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CAMERA_PERMISSION:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Log.d(TAG,"Premission granted");
                }else {
                    Log.d(TAG,"Premission denied");
                }
                break;
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.camm1);
// ตั้งค่าการใช้งานของกล้องต่างๆ
        mPreview = (SurfaceView)findViewById(R.id.preview);
        mPreview.getHolder().addCallback(this);
        mPreview.getHolder().setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
//   *** end old ****

        // facedetect ** //ยังไม่สามารถทำได้



        // *** end face




    }

    
// ฟังก์ชั่นเมื่อกดเลือกทรงผมไหนให้แสดงทรงผมนั้นๆตามที่กด
    public void OnClickm1(View view){
        ImageView mm = (ImageView)findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.m1));

    }
    public void OnClickm2(View view) {
        ImageView mm = (ImageView)findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.m2));
    }
    public void OnClickm3(View view){
        ImageView mm = (ImageView)findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.m7));
    }
    public void OnClickm4(View view) {
        ImageView mm = (ImageView) findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.m5));
    }
    public void OnClickm5(View view) {
        ImageView mm = (ImageView) findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.m9));
    }
    //ฟังก์ชั่นใช้หากล้องหน้าของเครื่อง
    public int getFrontCameraId() {
        CameraInfo ci = new CameraInfo();
        for (int i = 0 ; i < Camera.getNumberOfCameras(); i++) {
            Camera.getCameraInfo(i, ci);
            if (ci.facing == CameraInfo.CAMERA_FACING_FRONT) return i;
        }
        return -1;
    }

    public void onResume() {
        Log.d("System","onResume");
        super.onResume();
        //เปิดกล้อง

        if(checkPermission()) {
            mCamera = Camera.open(getFrontCameraId());
            mCamera.setDisplayOrientation(90);
        }
    }

    public void onPause() {
        Log.d("System","onPause");
        super.onPause();
        mCamera.release();
    }

//โค้ดแสดงภาพของกล้อง
    public void surfaceChanged(SurfaceHolder arg0
            , int arg1, int arg2, int arg3) {
        Log.d("CameraSystem","surfaceChanged");
        Camera.Parameters params = mCamera.getParameters();
        List<Camera.Size> previewSize = params.getSupportedPreviewSizes();
        List<Camera.Size> pictureSize = params.getSupportedPictureSizes();
        params.setPictureSize(pictureSize.get(0).width,pictureSize.get(0).height);
        params.setPreviewSize(previewSize.get(0).width,previewSize.get(0).height);
        params.setJpegQuality(100);
        mCamera.setParameters(params);

        try {
            mCamera.setPreviewDisplay(mPreview.getHolder());
            mCamera.startPreview();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void surfaceCreated(SurfaceHolder arg0) {
        Log.d("CameraSystem","surfaceCreated");
        try {
            mCamera.setPreviewDisplay(mPreview.getHolder());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void surfaceDestroyed(SurfaceHolder arg0) { }
}