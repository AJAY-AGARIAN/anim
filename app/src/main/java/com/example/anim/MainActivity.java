package com.example.anim;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp;
    Animation bgamin;
    TextView welcome;
    LinearLayout menu;
    ImageButton cbutton;
    ImageButton share;
    ImageButton about;
    int[] imageArray = { R.drawable.idea, R.drawable.black};
    Handler handler = new Handler();
    @Override
    protected void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        Runnable runnable = new Runnable() {
            int i = 0;

            public void run() {
                bgapp.setImageResource(imageArray[i]);
                i++;
                if (i > imageArray.length - 1) {
                    i = 0;
                }
                handler.postDelayed(this, 5000);
            }
        };
        handler.postDelayed(runnable, 2000);


        bgapp=(ImageView)findViewById(R.id.imagelogo);
        bgamin= AnimationUtils.loadAnimation(this,R.anim.splashanim);
        bgapp.animate().translationY(-700).setDuration(1000).setStartDelay(1200);
        bgapp.animate().translationX(-280).setDuration(1000).setStartDelay(1200);

        welcome=(TextView)findViewById(R.id.welcome);
        welcome.animate().translationY(-1050).setDuration(1000).setStartDelay(1200);
        welcome.animate().translationX(140).setDuration(1000).setStartDelay(1200);


        menu=(LinearLayout)findViewById(R.id.menu);
        menu.animate().translationX(0).setDuration(0).setStartDelay(2000);

        ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(bgapp, "scaleX", 0.5f);
        ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(bgapp, "scaleY", 0.5f);
        scaleDownX.setDuration(800);
        scaleDownY.setDuration(800);
        AnimatorSet scaleDown = new AnimatorSet();
        scaleDown.play(scaleDownX).with(scaleDownY);

        scaleDown.start();
    }

    public void addListenerOnButton()
    {
       cbutton = (ImageButton) findViewById(R.id.categories);
        cbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didTapButtonC(v);
                startActivity(new Intent(MainActivity.this,categories.class));
            }
        });
        share=(ImageButton)findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didTapButtonS(v);
                ClipboardManager clipboardManager=( ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip= ClipData.newPlainText("link","www.iloveu.com");
                clipboardManager.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this,"Link copied to clip board",Toast.LENGTH_SHORT).show();
            }
        });
        about=(ImageButton) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didTapButtonA(v);
                startActivity(new Intent(MainActivity.this,about.class));
            }
        });
    }

    public void didTapButtonC(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.categories);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }
    public void didTapButtonS(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.share);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }
    public void didTapButtonA(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.about);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.startAnimation(myAnim);
    }
}
