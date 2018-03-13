package com.sample.animations;

import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

/**
 * Created on 2/21/16.
 */
public class ScaleRotationActivity extends AppCompatActivity {

    private ImageView ivWheel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_rotation);
        overridePendingTransition(R.anim.in_from_bottom, 0); // bottom to top
        ivWheel = (ImageView) findViewById(R.id.iv_wheel);
    }

    public void scaleRotate(View v) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1f, 3.0f, 1f, 3.0f, ivWheel.getWidth() / 2.0f, ivWheel.getHeight() / 2.0f);
        scaleAnimation.setDuration(3000); // scale to 3 times as big in 3 seconds
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationStart(Animation animation) {
                Log.d("ScaleRotationActivity", "Scale started...");
            }
            public void onAnimationEnd(Animation animation) {
                Log.d("ScaleRotationActivity", "Scale ended...");
            }
            public void onAnimationRepeat(Animation animation) {

            }
        });

        float mAngleToRotate = 360f * 12; // rotate 12 rounds
        RotateAnimation wheelRotation = new RotateAnimation(0.0f, mAngleToRotate, ivWheel.getWidth()/2.0f, ivWheel.getHeight()/2.0f);
        wheelRotation.setDuration(5000); // rotate 12 rounds in 5 seconds
        wheelRotation.setInterpolator(this, android.R.interpolator.accelerate_decelerate);
        wheelRotation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationStart(Animation animation) {
                Log.d("ScaleRotationActivity", "Rotation started...");
            }
            public void onAnimationEnd(Animation animation) {
                Log.d("ScaleRotationActivity", "Rotation ended...");
            }
            public void onAnimationRepeat(Animation animation) {

            }
        });

        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(wheelRotation);
        animationSet.addAnimation(scaleAnimation);
        ivWheel.startAnimation(animationSet);
    }
}