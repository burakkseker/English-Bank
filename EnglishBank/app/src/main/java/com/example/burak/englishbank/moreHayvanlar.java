package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.GetChars;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreHayvanlar extends AppCompatActivity {
        ListView listeHayvanlar;
        String [] Hayvanlar={"Bat - Yarasa","Sheep - Koyun","Cat - Kedi","Dog - Köpek","Camel - Deve","Crocodile - Timsah","Pig - Domuz","Cow - İnek",
        "Elephant - Fil","Giraffe - Zürafa","Goose - Kaz","Duffy - Ördek","Cock - Horoz","Fox - Tilki","Frog - Kurbağa","Ant - Karınca",
        "Grasshopper - Çekirge","Owl - Baykuş","Deer - Geyik","Turtle - Kaplumbağa","Bee - Arı","Worm - Solucan","Hippo - Su Aygırı","Fly - Sinek",
        "Mosquito - Sivrisinek","Butterfly - Kelebek","Pigeon - Güvercin","Sparrow - Serçe","Spider - Örimcek","Lobster - Istakoz","Goat - Keçi",
        "Parrot - Papağan","Mouse - Fare","Rabbit - Tavşan","Crow - Karga"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_hayvanlar);
        listeHayvanlar=findViewById(R.id.listeHayvanlar);
        Intent intentHayvan=getIntent();
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Hayvanlar);
        listeHayvanlar.setAdapter(veriAdaptoruYer);
    }
}
