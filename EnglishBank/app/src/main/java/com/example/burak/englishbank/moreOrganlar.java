package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.GetChars;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreOrganlar extends AppCompatActivity {
        ListView listeOrganlar;
        String [] Organlar={"Head - Baş","Arm - Kol","Hand - El","Leg - Bacak","Foot - Ayak","Eye - Göz","Nose - Burun","Cheek - Yanak","Mouth - Ağız",
        "Tooth - Diş","Tongue - Dil","Ear - Kulak","Wrisdt - Bilek","Heel - Topuk","Stomach - Mide","Throat - Boğaz","Elbow - Dirsek","EyeBrow - Kaş",
        "Nail - Tırnak","Abdomen - Karın","Belly - Göbek","Beard - Sakal","Intestine - Bağırsak","Vein - Damar","Skeleton - İskelet","Spine - Omurga",
        "Bone - Kemik"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_organlar);
        Intent intentOrganlar=getIntent();
        listeOrganlar=findViewById(R.id.listeOrganlar);
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Organlar);
        listeOrganlar.setAdapter(veriAdaptoruYer);
    }
}
