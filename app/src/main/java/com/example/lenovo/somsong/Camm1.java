package com.example.lenovo.somsong;

/**
 * Created by lenovo on 28/8/2559.
 */
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

public class Camm1 extends Activity implements SurfaceHolder.Callback {
    Camera mCamera;

    SurfaceView mPreview;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.camm1);

        mPreview = (SurfaceView)findViewById(R.id.preview);
        mPreview.getHolder().addCallback(this);
        mPreview.getHolder().setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);


    }
    public void OnClickm1(View view){
       // ImageButton ssdebut = (ImageButton)findViewById(R.id.imageButton3);
        ImageView mm = (ImageView)findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.m1));
       // Intent intenttt = new Intent(Camm1.this,Camm1.class);
       // startActivity(intenttt);
    }
    public void OnClickm2(View view) {
        ImageView mm = (ImageView)findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.m2));
        //ImageButton ssdebut = (ImageButton)findViewById(R.id.imageButton);
        //Intent intent2 = new Intent(Camm1.this, Camm2.class);
       // startActivity(intent2);
    }
    public void OnClickm3(View view){
        ImageView mm = (ImageView)findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.m7));
        //ImageButton ssdebut = (ImageButton)findViewById(R.id.imageButton2);
        //Intent intent3 = new Intent(Camm1.this,Camm1.class);
        //startActivity(intent3);
    }
    public void OnClickm4(View view) {
        ImageView mm = (ImageView) findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.m5));
    }
    public void OnClickm5(View view) {
        ImageView mm = (ImageView) findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.m9));
    }
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
        mCamera = Camera.open(getFrontCameraId());
        mCamera.setDisplayOrientation(90);
    }

    public void onPause() {
        Log.d("System","onPause");
        super.onPause();
        mCamera.release();
    }


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