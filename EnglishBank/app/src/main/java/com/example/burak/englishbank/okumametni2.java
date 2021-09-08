package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class okumametni2 extends AppCompatActivity {
        TextView textViewokuma2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okumametni2);
        textViewokuma2=findViewById(R.id.textViewokuma2);
        Intent intentokuma2=getIntent();


    }
}
