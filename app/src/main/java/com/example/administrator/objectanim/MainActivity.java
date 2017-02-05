package com.example.administrator.objectanim;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textview;
    private ObjectAnimator animator;
    private ObjectAnimator animatorone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.tv);
        animator = ObjectAnimator.ofFloat(textview, "alpha", 0f, 1.0f, 0f, 1f);
        animator.setDuration(10000);
        animatorone = ObjectAnimator.ofFloat(textview, "rotation", 0f, 360f);
        animatorone.setDuration(3000);
    }

    public void he(View view) {
        AnimatorSet a = new AnimatorSet();
        a.play(animator);
        a.play(animatorone);
        a.start();
    }

    /*
     * 渐变动画
     */
    public void jianbian(View view) {
        animator.start();
    }

    /*
     * 旋转动画
     */
    public void xuanzhuan(View view) {
        animatorone.start();
    }
}
