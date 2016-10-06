package com.debugandroid.videothubnail;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    Glide glide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView thumbnail1= (ImageView) findViewById(R.id.video1);
        glide.with(this)
                .load("file:///storage/emulated/0/shareThis/VID-20160825-WA0002.mp4")
                .centerCrop()
                .placeholder(Color.BLUE)
                .crossFade()
                .into(thumbnail1);
    }
}
