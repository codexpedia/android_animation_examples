package com.sample.animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

/**
 * Created on 3/29/16.
 */
public class InterpolatorActivity extends AppCompatActivity {
    private LinearLayout vAnimationObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpolator);
        overridePendingTransition(R.anim.in_from_bottom_bounce, 0); // bottom to top

        vAnimationObj = (LinearLayout) findViewById(R.id.v_animation_obj);
    }

    public void accelerateInterpolator(View v) {
        Animation animAccelerateDecelerate = AnimationUtils.loadAnimation(this, R.anim.interpolator_accelerate);
        vAnimationObj.startAnimation(animAccelerateDecelerate);
    }

    public void decelerateInterpolator(View v) {
        Animation animAccelerateDecelerate = AnimationUtils.loadAnimation(this, R.anim.interpolator_decelerate);
        vAnimationObj.startAnimation(animAccelerateDecelerate);
    }

    public void accelerateDecelerateInterpolator(View v) {
        Animation animAccelerateDecelerate = AnimationUtils.loadAnimation(this, R.anim.interpolator_accelerate_decelerate);
        vAnimationObj.startAnimation(animAccelerateDecelerate);
    }

    public void linearInterpolator(View v) {
        Animation animAccelerateDecelerate = AnimationUtils.loadAnimation(this, R.anim.interpolator_linear);
        vAnimationObj.startAnimation(animAccelerateDecelerate);
    }

    public void anticipateInterpolator(View v) {
        Animation animAccelerateDecelerate = AnimationUtils.loadAnimation(this, R.anim.interpolator_anticipate);
        vAnimationObj.startAnimation(animAccelerateDecelerate);
    }

    public void overshootInterpolator(View v) {
        Animation animAccelerateDecelerate = AnimationUtils.loadAnimation(this, R.anim.interpolator_overshoot);
        vAnimationObj.startAnimation(animAccelerateDecelerate);
    }

    public void anticipateOverShootInterpolator(View v) {
        Animation animAccelerateDecelerate = AnimationUtils.loadAnimation(this, R.anim.interpolator_anticipate_overshoot);
        vAnimationObj.startAnimation(animAccelerateDecelerate);
    }

    public void cycleInterpolator(View v) {
        Animation animAccelerateDecelerate = AnimationUtils.loadAnimation(this, R.anim.interpolator_cycle);
        vAnimationObj.startAnimation(animAccelerateDecelerate);
    }

    public void bounceInterpolator(View v) {
        Animation animAccelerateDecelerate = AnimationUtils.loadAnimation(this, R.anim.interpolator_bounce);
        vAnimationObj.startAnimation(animAccelerateDecelerate);
    }
}
