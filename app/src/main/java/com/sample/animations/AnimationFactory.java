package com.sample.animations;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/**
 * Created on 3/27/16.
 */
public class AnimationFactory {
    public static Animation inFromRightAnimation(long durationMillis) {
        Animation inFromRight = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT,  +1.0f, Animation.RELATIVE_TO_PARENT,  0.0f,
                Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,   0.0f
        );
        inFromRight.setDuration(durationMillis);
        return inFromRight;
    }

    public static Animation outToLeftAnimation(long durationMillis) {
        Animation outtoLeft = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,  -1.0f,
                Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,   0.0f
        );
        outtoLeft.setDuration(durationMillis);
        return outtoLeft;
    }

    public static Animation inFromLeftAnimation(long durationMillis) {
        Animation inFromLeft = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT,  -1.0f, Animation.RELATIVE_TO_PARENT,  0.0f,
                Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,   0.0f
        );
        inFromLeft.setDuration(durationMillis);
        return inFromLeft;
    }

    public static Animation outToRightAnimation(long durationMillis) {
        Animation outtoRight = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,  +1.0f,
                Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,   0.0f
        );
        outtoRight.setDuration(durationMillis);
        return outtoRight;
    }

    public static Animation inFromBottomAnimation(long durationMillis) {

        Animation inFromBottom = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,  0.0f,
                Animation.RELATIVE_TO_PARENT,  +1.0f, Animation.RELATIVE_TO_PARENT,   0.0f
        );
        inFromBottom.setDuration(durationMillis);
        return inFromBottom;
    }

    public static Animation outToTopAnimation(long durationMillis) {
        Animation outToTop = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,  0.0f,
                Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,   -1.0f
        );
        outToTop.setDuration(durationMillis);
        return outToTop;
    }

    public static Animation inFromTopAnimation(long durationMillis) {
        Animation inFromTop = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,  0.0f,
                Animation.RELATIVE_TO_PARENT,  -1.0f, Animation.RELATIVE_TO_PARENT,   0.0f
        );
        inFromTop.setDuration(durationMillis);
        return inFromTop;
    }

    public static Animation outToBottomAnimation(long durationMillis) {
        Animation outToBottom = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,  0.0f,
                Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,   +1.0f
        );
        outToBottom.setDuration(durationMillis);
        return outToBottom;
    }
}
