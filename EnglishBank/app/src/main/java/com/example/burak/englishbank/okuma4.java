package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class okuma4 extends AppCompatActivity {
        TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okuma4);
        textView3=findViewById(R.id.textView3);
        Intent intentokuma4=getIntent();
    }
}
