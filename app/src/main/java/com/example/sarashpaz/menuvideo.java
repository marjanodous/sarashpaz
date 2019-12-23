package com.example.sarashpaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class menuvideo extends AppCompatActivity {
    VideoView videoView1,videoView2,videoView3;
    Boolean flag_play=false;
    Boolean flag_play1=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuvideo);
        videoView1=findViewById(R.id.video1);
        videoView2=findViewById(R.id.video2);
        videoView3=findViewById(R.id.video3);



        videoView1.setVideoPath("android.resource://"+ getPackageName()+"/"+ R.raw.video1);
        MediaController controller=new MediaController(this);
        controller.setAnchorView(videoView1);
        videoView1.setMediaController(controller);
//        videoView1.start();
        videoView1.requestFocus();
        videoView1.setKeepScreenOn(true);


        videoView2.setVideoPath("android.resource://"+ getPackageName()+"/"+ R.raw.video2);
        MediaController controller2=new MediaController(this);
        controller2.setAnchorView(videoView2);
        videoView2.setMediaController(controller2);
//        videoView2.start();
        videoView2.requestFocus();
        videoView2.setKeepScreenOn(true);

        videoView3.setVideoPath("android.resource://"+ getPackageName()+"/"+ R.raw.video3);
        MediaController controller3=new MediaController(this);
        controller3.setAnchorView(videoView3);
        videoView3.setMediaController(controller3);
//        videoView3.start();
        videoView3.requestFocus();
        videoView3.setKeepScreenOn(true);

    }
    //======================change font===============================
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

}
