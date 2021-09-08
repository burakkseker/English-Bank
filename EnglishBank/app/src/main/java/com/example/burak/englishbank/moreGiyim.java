package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreGiyim extends AppCompatActivity {
    ListView listeGiyim;
    String [] Giyim={"Belt - Kemer","Coat - Kaban","Gloves - Eldiven","Hat - Şapka","Pajamas - Pijama","Shoes - Ayakkabı","Suit - Takım Elbise",
    "Tie - Kravat","Trousers - Pantalon","Underwear - İç Çamaşırı","","Bra - Sütyen","Bracelet - Bilezik","Dress - Elbise","Earring - küpe",
    "Necklase - Kolye","Scarf - Eşarp","Skirt - Etek","Stockings - Kilotlu Çorap","","Nylon - Naylon","Wool - Yün","Silk - İpek","Cotton - Pamuk",
    "Leather - Deri"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_giyim);
        Intent intentGiyim=getIntent();
        listeGiyim=findViewById(R.id.listeGiyim);
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Giyim);
        listeGiyim.setAdapter(veriAdaptoruYer);
    }
}
