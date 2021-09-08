package com.example.burak.englishbank;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class podcast extends AppCompatActivity {
    Button button1areuokey;Button believe;Button iyifikir;Button noldusana;Button seeyou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);
        Intent intent=getIntent();
        button1areuokey=findViewById(R.id.button1areuokey);
        final MediaPlayer mediaPlayeraro=MediaPlayer.create(this,R.raw.areuokey);
        button1areuokey.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mediaPlayeraro.start();
            }
        } );
        believe=findViewById(R.id.believe);
         final MediaPlayer mediaPlayerbelieve =MediaPlayer.create(this,R.raw.bnbunainanmiyorum);
         believe.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mediaPlayerbelieve.start();
             }
         });
         iyifikir=findViewById(R.id.iyifikir);
         final  MediaPlayer mediaPlayeriyifkr=MediaPlayer.create(this,R.raw.iyibirfikir);
         iyifikir.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mediaPlayeriyifkr.start();
             }
         });
         noldusana=findViewById(R.id.noldusana);
         final MediaPlayer mediaPlayernoldu=MediaPlayer.create(this,R.raw.noldusana);
         noldusana.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mediaPlayernoldu.start();
             }
         });
        seeyou=findViewById(R.id.seeyou);
        final MediaPlayer mediaPlayerseeyu =MediaPlayer.create(this,R.raw.seyoulate);
        seeyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerseeyu.start();
            }
        });

    }

}
