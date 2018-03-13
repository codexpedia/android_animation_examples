package com.sample.animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/**
 * Created on 2/21/16.
 */
public class RotationActivity extends AppCompatActivity {

    private ImageView ivWheel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right); // left to right

        ivWheel = (ImageView) findViewById(R.id.iv_wheel);
    }

    /**
     * Roate the wheel image in 360 * 12 degree around the center of the wheel image in 3 seconds
     * The center of the wheel image is ivWheel.getWidth()/2.0f, ivWheel.getHeight()/2.0f
     * @param v
     */
    public void rotate(View v) {
        float mAngleToRotate = 360f * 12; // rotate 12 rounds
        RotateAnimation wheelRotation = new RotateAnimation(0.0f, mAngleToRotate, ivWheel.getWidth()/2.0f, ivWheel.getHeight()/2.0f);
        wheelRotation.setDuration(3000); // rotate 12 rounds in 3 seconds
        wheelRotation.setInterpolator(this, android.R.interpolator.accelerate_decelerate);
        ivWheel.startAnimation(wheelRotation);

        wheelRotation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationStart(Animation animation) {
                Log.d("RotationActivity", "Roation started...");
            }

            public void onAnimationEnd(Animation animation) {
                Log.d("RotationActivity", "Roation ended...");
            }

            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

}
