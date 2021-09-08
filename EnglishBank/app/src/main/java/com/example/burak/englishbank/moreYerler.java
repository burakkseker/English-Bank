package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreYerler extends AppCompatActivity {
    ListView listeYer;
    String [] Yerler={"Bakery - Fırın","Book Store - Kitapçı","Church - Kilise","Gas Station - Benzinci","House - Ev","Prison - Hapihane",
    "Mall - Avm","Zoo - Hayvanat Bahçesi","Convenience Store - Bakkal","Fire Department - İtfaiye"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_yerler);
        listeYer=findViewById(R.id.listeYer);
        Intent intentYer=getIntent();
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Yerler);
        listeYer.setAdapter(veriAdaptoruYer);

    }
}
