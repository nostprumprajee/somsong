package com.example.lenovo.somsong;

/**
 * Created by lenovo on 28/8/2559.
 */

import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.List;

public class Camw1 extends Activity implements SurfaceHolder.Callback {
    Camera mCamera;

    SurfaceView mPreview;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.camw1);
//ตั้งค่ากล้อง
        mPreview = (SurfaceView) findViewById(R.id.preview);
        mPreview.getHolder().addCallback(this);
        mPreview.getHolder().setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    }
    //โค้ดกดปุ่มเปลี่ยนทรงผม
    public void OnClickm6(View view) {
        ImageView mm = (ImageView) findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.w3));
    }
    public void OnClickm7(View view) {
        ImageView mm = (ImageView) findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.w4));
    }
    public void OnClickm8(View view) {
        ImageView mm = (ImageView) findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.w7));
    }
    public void OnClickm9(View view) {
        ImageView mm = (ImageView) findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.w6));
    }
    public void OnClickm10(View view) {
        ImageView mm = (ImageView) findViewById(R.id.myImageView);
        mm.setBackgroundDrawable(getResources().getDrawable(R.drawable.w9));
    }
//โค้ดหากล้องหน้า
    public int getFrontCameraId() {
        CameraInfo ci = new CameraInfo();
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            Camera.getCameraInfo(i, ci);
            if (ci.facing == CameraInfo.CAMERA_FACING_FRONT) return i;
        }
        return -1;
    }

    public void onResume() {
        Log.d("System", "onResume");
        //เปิดกล้อง
        super.onResume();
        mCamera = Camera.open(getFrontCameraId());
        mCamera.setDisplayOrientation(90);
    }

    public void onPause() {
        Log.d("System", "onPause");
        super.onPause();
        mCamera.release();
    }

//แสดงผลของกล้อง
    public void surfaceChanged(SurfaceHolder arg0
            , int arg1, int arg2, int arg3) {
        Log.d("CameraSystem", "surfaceChanged");
        Camera.Parameters params = mCamera.getParameters();
        List<Camera.Size> previewSize = params.getSupportedPreviewSizes();
        List<Camera.Size> pictureSize = params.getSupportedPictureSizes();
        params.setPictureSize(pictureSize.get(0).width, pictureSize.get(0).height);
        params.setPreviewSize(previewSize.get(0).width, previewSize.get(0).height);
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
        Log.d("CameraSystem", "surfaceCreated");
        try {
            mCamera.setPreviewDisplay(mPreview.getHolder());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void surfaceDestroyed(SurfaceHolder arg0) {
    }
}