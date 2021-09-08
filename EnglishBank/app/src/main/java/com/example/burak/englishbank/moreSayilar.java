package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreSayilar extends AppCompatActivity {
        ListView listeSayilar;
        String [] Sayilar={"0 - Zero","1 - One","2 - Two","3 - Three","4 - Four","5 - Five","6 - Six","7 - Seven","8 - Eight","9 - Nine","10 - Ten",
        "11 - Eleven","12 - Twelve","13 - Thirteen","14 - Fourteen","15 - Fifteen","16 - Sixteen","17 - Seventeen","18 - Eighteen","19 - Nineteen",
        "20 - Twenty","21 - Twenty-one","22 - Twenty-two","23 - Twenty-three","24 - Twenty-four","25 - Twenty-five","26 - Twenty-six","27 - Twenty-seven",
        "28 - Twenty-eight","29 - Twenty-nine","30 - Thirty","31 - Thirty-one","40 - Forty","50 - Fifty","60 - Sixty","70 - Seventy","80 - Eighty",
        "90 - Ninety","100 - One Hundred","500 - Five Hundred","1000 - One Thousand","1500 - One Thousand Five Hundred","100.000 - One Hundred Thousand",
        "1.000.000 - One Million"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_sayilar);
        listeSayilar=findViewById(R.id.listeSayilar);
        Intent intentSayi=getIntent();
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Sayilar);
        listeSayilar.setAdapter(veriAdaptoruYer);
    }
}
