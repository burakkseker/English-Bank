package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreEbevenyler extends AppCompatActivity {
    ListView listeEbeveyn;
    String [] Ebeveynler={"Family - Aile","Relatives - Akraba","Member - Üye","Child - Çocuk","Children - Çocuklar","Kids - Çocuklar",
    "Single - Bekar","Married - Evli","Engaged - Nişanlı","Divorced - Boşanmış","Couple - Karı-Koca","Husband - Erkek Eş","Wife - Kadın Eş"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_ebevenyler);
        Intent intentEbeveyn=getIntent();
        listeEbeveyn=findViewById(R.id.listeEbeveyn);
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Ebeveynler);
        listeEbeveyn.setAdapter(veriAdaptoruYer);

    }
}
