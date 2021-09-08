package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);
        imageView4=findViewById(R.id.imageView4);
        imageView5=findViewById(R.id.imageView5);
        imageView6=findViewById(R.id.imageView6);
        imageView7=findViewById(R.id.imageView7);
    }
        public void sentences(View view){
            Intent intent= new Intent(getApplicationContext(),TensesandSentences.class);
            startActivity(intent);

        }

        public void words(View view){
            Intent intentword= new Intent(getApplicationContext(),words.class);
            startActivity(intentword);

        }

        public  void readtext(View view){
            Intent intentreadtext= new Intent(getApplicationContext(),readtext.class);
            startActivity(intentreadtext);

        }

        public void morethan(View view){
            Intent intentmorethan= new Intent(getApplicationContext(),moreThan.class);
            startActivity(intentmorethan);

        }

        public void podcast(View view){
            Intent intentpodcast= new Intent(getApplicationContext(),podcast.class);
            startActivity(intentpodcast);

        }
}
