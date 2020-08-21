package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.iv_start);
        imageView.setBackgroundResource(R.drawable.sprite);

        animationDrawable = (AnimationDrawable)imageView.getBackground();
        if (animationDrawable instanceof Animatable) {
            ((Animatable)animationDrawable).start();
        }
    }

    public void Next_Activity(View view){
        Intent next_act = new Intent(this, BaseActivity.class);
        startActivity(next_act);
    }
}