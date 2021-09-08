package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class moreThan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_than);
        Intent intent=getIntent();

    }
    public void yerler (View view){
        Intent intentYer=new Intent(getApplicationContext(),moreYerler.class);
        startActivity(intentYer);

    }
    public void ebeveynler (View view){
        Intent intentYEbeveyn=new Intent(getApplicationContext(),moreEbevenyler.class);
        startActivity(intentYEbeveyn);

    }
    public void giyim (View view){
        Intent intentGiyim=new Intent(getApplicationContext(),moreGiyim.class);
        startActivity(intentGiyim);
    }
    public void mevsim (View view){
        Intent intentMevsim=new Intent(getApplicationContext(),moreMevsim.class);
        startActivity(intentMevsim);

    }
    public void organlar (View view){
        Intent intentOrganlar= new Intent(getApplicationContext(),moreOrganlar.class);
        startActivity(intentOrganlar);
    }
    public void ulasim (View view){
        Intent intentUlasim=new Intent(getApplicationContext(),moreUlasim.class);
        startActivity(intentUlasim);

    }
    public void meslekler (View view){
        Intent intentMeslek=new Intent(getApplicationContext(),moreMeslekler.class);
        startActivity(intentMeslek);
    }
    public void zarflar (View view){
        Intent intentZarf=new Intent(getApplicationContext(),moreZarflar.class);
        startActivity(intentZarf);
    }
    public void zamirler (View view){
        Intent intentZamir=new Intent(getApplicationContext(),moreZamirler.class);
        startActivity(intentZamir);
    }
    public void sifatlar (View view){
        Intent intentSifat=new Intent(getApplicationContext(),moreSifatlar.class);
        startActivity(intentSifat);
    }
    public void kipler (View view){
        Intent intentKip=new Intent(getApplicationContext(),moreKipler.class);
        startActivity(intentKip);
    }
    public void baglaclar (View view){
        Intent intentBaglac=new Intent(getApplicationContext(),moreBaglaclar.class);
        startActivity(intentBaglac);
    }
    public void edatlar (View view){
        Intent intentEdat=new Intent(getApplicationContext(),moreEdatlar.class);
        startActivity(intentEdat);
    }
    public void hayvanlar (View view){
        Intent intentHayvan=new Intent(getApplicationContext(),moreHayvanlar.class);
        startActivity(intentHayvan);

    }
    public void yönler (View view){
        Intent intentYönler= new Intent(getApplicationContext(),moreYonler.class);
        startActivity(intentYönler);

    }
    public void sayilar (View view){
        Intent intentSayi=new Intent(getApplicationContext(),moreSayilar.class);
        startActivity(intentSayi);
    }
}
