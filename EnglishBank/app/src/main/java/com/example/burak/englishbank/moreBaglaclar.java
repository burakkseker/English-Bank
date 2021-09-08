package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreBaglaclar extends AppCompatActivity {

    ListView listeBaglac;
    String [] Baglac={"Iki cümlecik arasındaki bağlantıyı sağlarlar.","","And (ve) : paralellik arzeder. .","The trade union asked for a twenty percent increase in wages and salaries and the company management accepted it. \n" +
            "  (Sendika, ücret ve maaşlarda yüzde yirmilik bir zam istedi ve şirket yönetimi bunu kabul etti.)","","But (ama, ancak, fakat) : zıtlık ifade eder.","He ran as fast as he could but he couldn't win the race. (Olabildiğince hızlı koştu ama yarışı kazanamadı)","","Or (veya, yahut, ya da) : alternatifteri gösterir.","You must love family life or never get married. (Aile hayatını sevmek zorundasın ya da hiç evlenmemelisin.)",
    "","Nor (ne de) : or'un olumsuzu olup iki alternatiften hiç biri anlamındadır.","He didn't contact his doctor nor did he call his family. (Doktoruyla temasa geçmedi. Ne de ailesini aradı.)","","So (bundan dolayı, böylece) : sonuca götüren bağlaçtır.","It was snowing heavily so we cancelled the match.  (Çok kar yağıyordu, bu nedenle (bundan dolayı) maçı iptal ettik.)","","For (edat olarak,“için”) : bağlaç olarak iki cümlecik arasında “zira” anlamındadır.",
    "","Yet (halbuki)","I was expecting him to be a great man, yet he amounted to nothing. (Onun büyük bir adam olmasını bekliyordum halbuki o hiçbirşey olmadı.)","",
    "Time Conjunction = Zaman bağlaçları.","(Eylemin ne zaman yapıldığını belirlerler.)","","As soon as: ( ..........ir, ..........imez)","As long as: (..........dığı sürece)","Hardly / Scarcely (....when: tam ....mıştı ki ....oldu)","When: (..........dığı zaman)",
    "After: (..........den sonra)","Before: (..........den önce)","As: (..........iken)","While: (..........iken)","Until / Till: (..........ceye kadar)","By the time: (..........ceye kadar)","Once: (...........ce / ca)","No sooner (...than: ...mesi ile ...mesi bir oldu)","Since: (...dığından beri)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_baglaclar);
        listeBaglac=findViewById(R.id.listeBaglac);
        Intent intentBaglac=getIntent();
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1,Baglac);
        listeBaglac.setAdapter(veriAdaptoruYer);

    }
}
