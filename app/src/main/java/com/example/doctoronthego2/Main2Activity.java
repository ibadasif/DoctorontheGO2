package com.example.doctoronthego2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    ImageView diagnose;
    ImageView pedometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        diagnose= findViewById(R.id.dig);
        diagnose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Main2Activity.this,Diagnose.class);
                startActivity(a);
            }
        });
        pedometer= findViewById(R.id.pedo);
        pedometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b =new Intent(Main2Activity.this,Pedometer.class);
                startActivity(b);
            }
        });

    }
}
