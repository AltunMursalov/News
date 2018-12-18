package com.example.altunmursalov.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        welcome = (TextView)findViewById(R.id.welcome_text);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        welcome.startAnimation(myanim);
        final Intent i = new Intent(this, WelcomeActivity.class);
        Thread timer = new Thread(){
            public void run (){
                try{
                    sleep(3000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
