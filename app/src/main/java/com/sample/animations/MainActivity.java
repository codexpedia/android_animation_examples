package com.sample.animations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSlideActivity(View v) {
        Intent i = new Intent(this, SlideActivity.class);
        startActivity(i);
    }

    public void startRotationActivity(View v) {
        Intent i = new Intent(this, RotationActivity.class);
        startActivity(i);
    }

    public void startScaleActivity(View v) {
        Intent i = new Intent(this, ScaleActivity.class);
        startActivity(i);
    }

    public void startScaleRotationActivity(View v) {
        Intent i = new Intent(this, ScaleRotationActivity.class);
        startActivity(i);
    }

    public void startInterpolatorActivity(View v) {
        Intent i = new Intent(this, InterpolatorActivity.class);
        startActivity(i);
    }
}
