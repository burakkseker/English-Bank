package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreZarflar extends AppCompatActivity {
    ListView listeZarflar;
    String [] Zarflar={"En Sık Kullanılan Zarflar","A","about - yaklaşık","accidenttaly - kazara","actually - aslında","again - aslında","ago - önce","ahead - önde","all - hepsi, tamamı","almost - neredeyse","alone - yalnız","also - de, da","around - etrafında","as - olarak",
            "B","back - geri","before - önce","best - en iyi","better - daha iyi","boldly - cesurca","both - her ikisi de",
            "C","certainly - kesinlikle","cheerfully - neşeyle","clearly - neşeyle","coyly - nazlanır gibi","crazily - delice",
    "D","defiantly - meydan okurcasına","deftly - ustalıkla","deliberately - kasten","devotedly - özveriyle","directly - doğrudan doğruya","down - aşağı","dutifully - itaatkar bir şekilde",
    "E","eagerly - hevesle","early - erkenden","either - ya","else - başka","enough - yeterli","enormously - son derece","even - hatta","evenly - eşit olarak","ever - hiç","axactly - tam",
    "F","far - uzak","fast - hızlı","finally - nihayet","foolishly - aptalca","fortunately - neyse ki","forward - ileri","frequently - sık sık",
    "G","gleefully - neşeyle","gracefully - nazik",
    "H","happily - mutlulukla","hard - sert","hastily - alelacele","here - burada","honestly - dürüstçe","hourly - saatlik","how - nasıl","howewer - ancak","hungrily - iştahla",
    "I","in - içinde","indeed - aslında","innocently - saf saf","instead - yerine","irritably - sinirle",
    "J","jealously - kıskançlıkla","just - sadece","justly - haklı olarak",
    "K","kindly - nazikçe",
    "L","later - sonra","lazily - tembelce","least - en az","less - daha az","little - küçük","long - uzun",
    "M","madly - delice","maybe - belki","merrily - keyifli bir şekilde","more - daha fazla","mortally - ölümlü olan","much - çok","most - her şeyden çok",
    "N","nearly - neredeyse","nervously - sinirli olarak","never - asla","now - şimdi",
    "O","obediently - itaatkar bir şekilde","occasionally - bazen","once - bir kere","often - sık sık","only - sadece",
    "P","particularly - özellikle","perfectly - kusursuzca","perhaps - belki","politely - kibarca","poorly - yetersizce","powerfully - güçlü bir şekilde","pretty - oldukça, epey","promptly - acilen",
    "Q","quickly - hızla","quite - oldukça",
    "R","rapidly - hızla","rarely - nadiren","rather - biraz","really - gerçekten","recently - geçenlerde","regularly - düzenli olarak","rudely - terbiyesizce",
    "S","Safely - güvenli bir şekilde","seldom - nadiren","selfisly - bencilce","seriously - cidden","shakily - titreyerek","silently - sessizce","slowly - yavaş yavaş","so - öyle","sometimes - bazen","soon - yakında","sppedily - hızla","still - hala","suddenly - aniden",
    "T","tediously - sıkıcı bir şekilde","then - o zaman","thus - öylece","today - bugün","together - birlikte","tonight - bu gece",
    "U","unecpectedly - beklenmedik bir şekilde","usually - genellike",
    "V","very - çok","victoriously - galp olarak","vivaciously - hayat dolu bir şekilde",
    "W","warmly - samimiyetle","wearily - yorgun","weekly - haftalık","when - ne zaman","where - nerede","why - neden","wildly - çılgınca",
    "Y","yearly - yıllık","yet - henüz"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_zarflar);
        listeZarflar=findViewById(R.id.listeZarflar);
        Intent intentZarf=getIntent();
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1,Zarflar);
        listeZarflar.setAdapter(veriAdaptoruYer);

    }
}
