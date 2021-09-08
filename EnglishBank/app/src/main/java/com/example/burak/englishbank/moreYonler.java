package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreYonler extends AppCompatActivity {
    ListView listeYön;
    String [] Yönler ={"Left - Sol","Right - Sağ","Turn Left - Sola Dön","Turn Right - Sağa Dön","Straight on - Dümdüz","Go Straight On - Dümdüz Git",
            "Go Post the Shop - Mağazayı Geçin"," It's Nearby - O yanındadır","It's For Away - O uzaktadır" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_yonler);
        listeYön=findViewById(R.id.listeYön);
        Intent intentYönler=getIntent();
        ArrayAdapter<String> veriAdaptoruYon=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Yönler);
        listeYön.setAdapter(veriAdaptoruYon);

    }
}
