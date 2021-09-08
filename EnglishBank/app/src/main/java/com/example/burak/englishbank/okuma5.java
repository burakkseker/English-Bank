package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class okuma5 extends AppCompatActivity {
        TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okuma5);
        textView4=findViewById(R.id.textView4);
        Intent intentokuma5=getIntent();
    }
}
