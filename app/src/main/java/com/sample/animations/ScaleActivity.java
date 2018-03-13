package com.sample.animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

/**
 * Created on 2/21/16.
 */
public class ScaleActivity extends AppCompatActivity {

    private ImageView ivWheel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        overridePendingTransition(R.anim.in_from_top, R.anim.out_to_bottom); // top to bottom
        ivWheel = (ImageView) findViewById(R.id.iv_wheel);
    }

    public void scale(View v) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1f, 3.0f, 1f, 3.0f, ivWheel.getWidth() / 2.0f, ivWheel.getHeight() / 2.0f);
        scaleAnimation.setDuration(3000); // scale to 3 times as big in 3 seconds
        scaleAnimation.setInterpolator(this, android.R.interpolator.accelerate_decelerate);
        ivWheel.startAnimation(scaleAnimation);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationStart(Animation animation) {
                Log.d("ScaleActivity", "Scale started...");
            }

            public void onAnimationEnd(Animation animation) {
                Log.d("ScaleActivity", "Scale ended...");
            }

            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    /**
     * Constructor to use when building a ScaleAnimation from code
     *
     * @param fromX Horizontal scaling factor to apply at the start of the
     *        animation
     * @param toX Horizontal scaling factor to apply at the end of the animation
     * @param fromY Vertical scaling factor to apply at the start of the
     *        animation
     * @param toY Vertical scaling factor to apply at the end of the animation
     * @param pivotX The X coordinate of the point about which the object is
     *        being scaled, specified as an absolute number where 0 is the left
     *        edge. (This point remains fixed while the object changes size.)
     * @param pivotY The Y coordinate of the point about which the object is
     *        being scaled, specified as an absolute number where 0 is the top
     *        edge. (This point remains fixed while the object changes size.)
     */
    //    public ScaleAnimation(float fromX, float toX, float fromY, float toY,
    //                          float pivotX, float pivotY)
}
