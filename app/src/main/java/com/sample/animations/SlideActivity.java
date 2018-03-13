package com.sample.animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

/**
 * Created on 2/4/16.
 */
public class SlideActivity extends AppCompatActivity {
    Button btnSlide;
    ViewFlipper viewFlipper;
    LinearLayout llOne;
    LinearLayout llTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left); // right to left

        btnSlide = (Button) findViewById(R.id.btn_slide_from_right_to_left);
        viewFlipper = (ViewFlipper) findViewById(R.id.view_flipper);
        llOne = (LinearLayout) findViewById(R.id.ll_view1);
        llTwo = (LinearLayout) findViewById(R.id.ll_view2);
    }

    public void slideRightToLeft(View v) {
        viewFlipper.setInAnimation(this, R.anim.in_from_right);
        viewFlipper.setOutAnimation(this, R.anim.out_to_left);
        viewFlipper.showNext();
    }

    public void slideLeftToRight(View v) {
        viewFlipper.setInAnimation(this, R.anim.in_from_left);
        viewFlipper.setOutAnimation(this, R.anim.out_to_right);
        viewFlipper.showNext();
    }

    public void slideTopToBottom(View v) {
        viewFlipper.setInAnimation(AnimationFactory.inFromTopAnimation(1000));
        viewFlipper.setOutAnimation(AnimationFactory.outToBottomAnimation(1000));
        viewFlipper.showNext();
    }

    public void slideBottomToTop(View v) {
        viewFlipper.setInAnimation(this, R.anim.in_from_bottom);
        viewFlipper.setOutAnimation(this, R.anim.out_to_top);
        viewFlipper.showNext();
    }

}
