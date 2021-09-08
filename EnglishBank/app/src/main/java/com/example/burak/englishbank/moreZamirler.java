package com.example.burak.englishbank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreZamirler extends AppCompatActivity {
    ListView listeZamirler;
    String [] Zamirler={"ÖZNE ZAMİRLERİ","I - Ben","You - Sen","We - Biz","They - Onlar","He - O","She - O","It - O","","NESNE ZAMİRLERİ",
    "Me - Bana","You - Seni,Sana","Us - Bizi,Bize","Them - Onları , Onlara","Him - Onu,Ona","Her - Onu,Ona","It - Onu,Ona","","İYELİK ZAMİRLERİ",
    "Mine - Benimki","Yours - Seninki","Ours - Bizimki","Theirs - Onlarınki","His - Onunki","Hers - Onunki","It's - Onunki","","DÖNÜŞÜMLÜ ZAMİRLER",
    "Myself - Kendim","Yourself - Kendin","Ourselves - Kendimiz","Yourselves - Kendiniz","Themselves - Kendileri","Himself - Kendisi","Herself - Kendisi",
    "Itself - Kendisi","","BELİRSİZ ZAMİRLER","Nobody - Hiçkimse","Everybody - Herkes","Everything - Her şey","Anybody - Hiçkimse","Anything - Hiçbir şey",
    "Something - Bir şey","Somebody - Birisi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_zamirler);
        listeZamirler=findViewById(R.id.listeZamirler);
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Zamirler);
        listeZamirler.setAdapter(veriAdaptoruYer);
    }
}
