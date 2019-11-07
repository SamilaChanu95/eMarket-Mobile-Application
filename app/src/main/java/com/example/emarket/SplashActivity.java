package com.example.emarket;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(7000);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                finally {
                    Intent welcomeIntent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(welcomeIntent);
                }
            }
        };

        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}