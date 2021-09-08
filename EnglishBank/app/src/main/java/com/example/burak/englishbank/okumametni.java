package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class okumametni extends AppCompatActivity {
    TextView textViewokuma;
    ImageView imageView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okumametni);
        textViewokuma=findViewById(R.id.textViewokuma);
        imageView9=findViewById(R.id.imageView9);
        Intent intentokuma=getIntent();

    }
}
