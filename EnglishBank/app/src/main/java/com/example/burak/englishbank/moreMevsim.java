package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreMevsim extends AppCompatActivity {
    ListView listeMevsim;
    String [] Mevsim={"January - Ocak","February - Şubat","March - Mart","April - Nisan","May - Mayıs","June - Haziran","July - Temmuz","August - Ağustos",
    "September - Eylül","October - Ekim","November - Kasım","December - Aralık","","Spring - İlkbahar","Summer - Yaz",
    "Autumn - Sonbahar","Winter - Kış","","Weekend - Haftasonu","Weekdays - Haftaiçi","Tonight - Bu Akşam"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_mevsim);
        listeMevsim=findViewById(R.id.listeMevsim);
        Intent intentMevsim=getIntent();
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Mevsim);
        listeMevsim.setAdapter(veriAdaptoruYer);
    }
}
