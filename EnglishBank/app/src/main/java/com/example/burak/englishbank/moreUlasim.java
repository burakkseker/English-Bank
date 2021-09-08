package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreUlasim extends AppCompatActivity {
    ListView listeUlasim;
    String [] Ulasim={"Cab - Taksi","Canoe - Kano","Public Transportation - Metro vs.(herkes tarafından kullanılan)","Subway - Metro",
    "Train - Tren","Van - Kamyonet","Bus - Otobüs","Ferry - Feribot","Lorry - Kamyon","Truck - Tır-Kamyon","Ship - Gemi","Plane - Uçak"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_ulasim);
        listeUlasim=findViewById(R.id.listeUlasim);
        Intent intentUlasim=getIntent();
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Ulasim);
        listeUlasim.setAdapter(veriAdaptoruYer);
    }
}
