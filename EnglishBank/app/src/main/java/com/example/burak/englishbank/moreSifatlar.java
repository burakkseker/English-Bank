package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreSifatlar extends AppCompatActivity {
        ListView listeSifat;
        String[]Sifatlar={"İsimleri niteleyen kelimelere sıfat ( adjective ) denir.","- a beautiful house -  güzel bir ev","- the fast car - hızlı araba",
        "Bu cümlelerde picture ( resim ) ve horse ( at ) kelimeleri isimdir. Beautiful ( güzel ) ve fast ( hızlı ) kelimeleri ise sıfattır. Yani beautiful kelimesi house kelimesini, fast kelimesi ise car kelimesini nitelemektedir.",
        "","► Zamirler ismin yerine kullanılan kelimeler oldukları için sıfatlar tarafından nitelenebilirler."," He is strong, handsome, rich and humble. (Güçlü, yakışıklı, zengin ve alçak gönüllüdür.)",
        "They are old but excellent. (Eski fakat ve mükemmeldirler.)","Bu cümlelerde sıfatlar zamirleri nitelemektedirler.","",
        "► Türkçede olduğu gibi İngilizcede de sıfatlar, niteledikleri isimlerden önce gelirler. Tekil, çoğul farketmez.","a good man - iyi bir adam","good men - iyi adamlar"," a beautiful rose - güzel bir gül",
        "","► Bir isimden önce birden fazla sıfat gelebilir. Sıfatların araları virgül ile ayrılabilir veya virgülsüz de yazılabilir."," a big fat man - büyük şişman bir adam","he thin, tall woman - uzun, ince kadın",
        "","► Renk bildiren iki sıfat arka arkaya geldiği zaman aralarına “and” konur. İkiden fazla renk arka arkaya gelince son iki rengin arasına and konur.","the yellow and red uniform - Sarı kırmızı üniforma","a white, blue and green tent. - beyaz, mavi ve yeşil ( karışımı ) çadır",
        "","► Bir isimden önce birden fazla nitelik sıfatı gelmesi icab ettiği zaman, her zaman olmasa da çoğunlukla dikkat edilen bir sıra vardır. Genel nitelikler özel niteliklerden önce gelir. Aşağıda belirtilen sıra takip edilir, ama bu istisnası olmayan kesin bir kural değildir. Bazen sıralama değişebilir.",
        "Genel mana + büyüklük, küçüklük + yaş, eskilik, yenilik + renk + ait olduğu belde + neden yapıldığı","an old Turkish woman - Yaşlı bir Türk kadını","a nice woolen sweater - Güzel bir yün kazak",
        "","► Sıfatlar genel olarak isimleri nitelemekle beraber bazen fiilleri de nitelerler. Bu fiiller sınırlıdır","be / get / become / seem / appear / look / smell / sound / taste / feel.","Be quiet. Don't be noisy. (Sessiz ol. Gürültücü olma.)","The cat is getting wet in the rain. (Kedi yağmurda ıslanıyor.)",
        "Last night he became ill. (Dün gece hasta oldu.)","Your coffee tastes wonderful. (Kahveniz mükemmel ( lezzeti var ).","The fish smells bad. (Bu  balık kötü kokuyor.)","You look happy today. (Bugün mutlu görünüyorsun.)",
        "","► İngilizcede sıfatların çoğu hem isimlerden önce gelip sıfat tamlaması yaparlar hem de be, seem, look gibi fiillerden sonra yüklem olarak gelirler.","a fat man - şişman bir adam","The man is fat. - Adam şişmandır.","easy questions - kolay sorular","The questions are easy. - Sorular kolaydır.","a sad boy. - üzgün bir çocuk",
        "The boy looks sad. - Çocuk üzgün görünüyor.","","Predicative adjectives","► Bazı sıfatlar ise sadece predicative ( yüklem ) olarak kullanılırlar. Bu sıfatları isimlerin önüne getiremeyiz. Bu sıfatlardan en çok kullanılanları şunlardır.","asleep, awake, alike, afraid, alive, alone, ashamed, glad, pleased, sorry, upset, elder.",
        "The man is asleep. ( Adam uykuda ) diyebiliriz. Ama asleep man diyemeyiz.","","Attributive adjectives","► Bir de bunların tam tersi olarak yani attributive ( niteleyici ) olarak kullanılan ancak predicative ( yüklem ) olarak kullanılamayan sıfatlar vardır. Bunlar şu sıfatlardır.",
        "chief, main, principal, sheer, utter, mere, only, sole, total","His shoop is on the main street. ( Onun dükkanı ana caddededir ) diyebiliriz. Ama “The street is main” diyemeyiz."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_sifatlar);
        listeSifat=findViewById(R.id.listeSifat);
        Intent intentSifatlar=getIntent();
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Sifatlar);
        listeSifat.setAdapter(veriAdaptoruYer);
    }
}
