package com.example.godara01.rakshak;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 1000;
    private TextView textView2;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);

        textView2 = (TextView) findViewById(R.id.textView2);

        new Handler().postDelayed(new Runnable() {
            public void run() {

                Intent launchNextActivity;
                launchNextActivity = new Intent(Splash.this, LoginActivity.class);
                startActivity(launchNextActivity);
                finish();

            }
        },  SPLASH_DISPLAY_LENGTH);
    }



}