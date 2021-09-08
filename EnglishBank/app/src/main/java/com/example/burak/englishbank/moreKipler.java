package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreKipler extends AppCompatActivity {
        ListView listeKipler;
        String[] Kipler={"MODALS (KİPLER)'İN CÜMLE İÇİNDEKİ OLUMSUZ DÜZENİ:","Olumlu hali : Modal verb + fiil",
        "Olumsuz hali : Modal verb + not + fiil","Soru hali : Modal verb + özne + fiil","","'CAN' KİPİ KULLANIMLARI :",
                "1) Yetenek , Beceri(-e bilmek)","1) she can play football well.(O iyi futbol oynayabilir.)","2) Ricada bulunmak için",
        "2) Can you listen me? (Beni dinleyebilir misin?)","3) İzin istemek için.","3) Can I go out ? (Dışarı Çıkabilir miyim?)","4) Olasılık, Olabilirlik","4) I can go home after work.(İşten sonra eve gidebilirim)",
        "","'COULD' KİPİ KULLANIMLARI:","1) Geçmişteki Beceriler","1) He could run faster when he was younger.(O Daha gençken daha hızlı koşabilirdi",
        "2) Çok daha kibar rica","2) Could you listen me? (beni dinleyebilir misin?)","3) Çok daha kibar izin","3) Could I go out? (Dışarı çıkabilir miyim?)",
        "4) Öneride bulunmak","4) You could go to the cinema after work.(İşten sonra sinemaya gidebilirdin.)",
        "5) Olasılık, olabilirlik","5) I could gain weight if I didn't go to the gym.(Spora gitmeseydim, kilo alabilirdim.)",
        "","'WIIL' KİPİ KULLANIMLARI","1) Gelecekle ilgili o an alınan kararlar.","1) I will never forget you! (Seni asla unutmayacağım!)",
        "2) Gelecekte olacak olan bir şeyden bahsederken","2) I will be at the school at 8:00. (8'de okulda olacağım.)",
        "3) Söz verirken","3) I will take care of you, don't worry.(Sana ben bakacağım, endişelenme.)","",
        "'WOULD' KİPİ KULLANIMLARI","1) 'Will' kipinin geçmiş zaman hali","1) I would be an architect.(Bir mimar olucaktım.)","",
        "'MAY' KİPİ KULLANIMLARI","1) İzin isterken","1) May I go out ? (Dışarı çıkabilir miyim ?)","2) İzin verirken","2) You may go out (Dışarı Çıkabilirsin)",
        "3) Ricada bulunurken","3) May you take me to the theatre? (Beni tiyatroya bırakabilir misin?)","4) Olasılık, olabilirlik",
        "4) I may be at home that moment (O anda evde olabilirim)","","'MUST' KİPİ KULLANIMLARI","1) Kesinlik","1) This must be mine.(Bu benimki olmalı.)","2) Gereklilik, olması gereken",
                "2) Teachers must give homeworks.(Öğretmenler ev ödevi vermeliler)","3) Şiddetli tavsiye","3) You must take an asprin! (Bir asprin almalısın!)","",
        "'HAVE TO' KİPİ KULLANIMLARI","1) Kesinlik","1) This have to be yours.(Bu seninki olmalı.)","2) Gereklilik",
                "2) Students have to study for their exams.(Öğrenciler yazılılarına çalışmalılar.)","3) Zorunluluk","3) I have to go.(Gitmem gerek.)","",
        "'SHALL' KİPİ KULLANIMLARI","1) Önermek","1) Shall we go to the cinema? (Sinemaya gidelim mi?)","2) Söz vermek","2) I shall never forget you.(Seni asla unutmam.)","" +
                "3) Çaresizlik/Kaçınılmazlık","3) Unfortunately, he shall become my enemy.(Maalesef, o düşmanım oldu.)",
        "","'SHOULD' KİPİ KULLANIMI","1) Önermek","1) You Should visit Turkey. (Türkiye'yi ziyaret etmelisin.)","2) Zorunluluk",
                "2) I should be at the school at 8:00. (8'de okulda olmalıyım.)","",
        "'HAD BETTER' KİPİ KULLANIMLARI","1) Yapılması iyi olur anlamında kullanılır","1) You had better be there.(Orada olsan iyi olur.)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_kipler);
        listeKipler=findViewById(R.id.listeKipler);
        Intent intentKip=getIntent();
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Kipler);
        listeKipler.setAdapter(veriAdaptoruYer);
    }
}
