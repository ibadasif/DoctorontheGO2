package com.example.doctoronthego2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static  int SPLASH_TIME_OUT =4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(a);
                finish();

            }
        },SPLASH_TIME_OUT);
    }
}
