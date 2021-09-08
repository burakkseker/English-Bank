package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TensesandSentences extends AppCompatActivity {
        TextView textView;
        TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tensesand_sentences);
        Intent intent=getIntent();
    }
}
