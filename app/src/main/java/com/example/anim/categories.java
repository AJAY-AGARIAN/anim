package com.example.anim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;


public class categories extends Activity {

    ImageButton all, study, picture, video, special, voice, font, life, other;
    static String  butn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);
        //number 1
        all = (ImageButton) findViewById(R.id.all);
        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didTapButtonAll(v);
                butn="all";
                startActivity(new Intent(categories.this, showlist.class));
            }
        });
        //number 2
        study = (ImageButton) findViewById(R.id.study);
        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didTapButtonStudy(v);
                butn="study";
                startActivity(new Intent(categories.this, studyShowlist.class));
            }
        });
        //number 3
        picture = (ImageButton) findViewById(R.id.photo);
        picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didTapButtonPic(v);
                butn="picture";
                startActivity(new Intent(categories.this, picShowlist.class));
            }
        });
        //number 4
        video = (ImageButton) findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didTapButtonVideo(v);
                butn="video";
                startActivity(new Intent(categories.this, videoShowlist.class));
            }
        });
        //number 5
        special = (ImageButton) findViewById(R.id.special);
        special.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didTapButtonSpl(v);
                butn="special";
                startActivity(new Intent(categories.this, splShowlist.class));
            }
        });
        //number 6
        voice = (ImageButton) findViewById(R.id.voice);
        voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didTapButtonVoice(v);
                butn="voice";
                startActivity(new Intent(categories.this, voiceShowlist.class));
            }
        });
        //number 7
        font = (ImageButton) findViewById(R.id.font);
        font.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didTapButtonFont(v);
                butn="font";
                startActivity(new Intent(categories.this, fontShowlist.class));
            }
        });
        //number 8
        life = (ImageButton) findViewById(R.id.life);
        life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didTapButtonLife(v);
                butn="life";
                startActivity(new Intent(categories.this, lifeShowlist.class));
            }
        });
        //number 9
        other = (ImageButton) findViewById(R.id.other);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didTapButtonOthr(v);
                butn="other";
                startActivity(new Intent(categories.this, othrShowlist.class));
            }
        });



    }
    public void didTapButtonAll(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.all);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }
    public void didTapButtonStudy(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.study);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }
    public void didTapButtonPic(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.photo);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }
    public void didTapButtonVideo(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.video);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }
    public void didTapButtonSpl(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.special);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }
    public void didTapButtonLife(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.life);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }
    public void didTapButtonVoice(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.voice);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }
    public void didTapButtonFont(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.font);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }
    public void didTapButtonOthr(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.other);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }

}