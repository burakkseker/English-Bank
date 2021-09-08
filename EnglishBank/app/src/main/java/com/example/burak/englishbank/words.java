package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class words extends AppCompatActivity {
    ArrayAdapter arrayAdapter;
    ListView listView;
    String [] words={
            "A","Abandon - Terk Etmek (birini)","Abbreviate - Kısaltmak","Abolish - Ortadan Kaldırmak","Absorb - Emmek","Abstain From - (alkol,ilaç) -den sakınmak","Abundance - Bolluk-Bereket","Abundant - Bol, Bereketli","Accelerate - Hızlandırmak","Accept - Kabul Etmek","Access - Erişmek","Accessible to - Erişilebilir","Accommodate - (misafir) Ağırlamak",
            "Accompany - Eşlik etmek","Accomplish - başarmak","Accumulate - Birikmek","Accuracy - Doğruluk, Kesinlik","Accurate - Doğru, Hatasız","Accuse - Suçlamak","Achieve - Başarmak","Acknowledge as - Kabul Etmek","Acquainted with - Aşina Olmak","Acquire - (dil,miras,huy) Kazanmak, Edinmek","Acquisition - Edinim","Activity - Faaliyet","Adapt - Uyarlamak - Uydurmak",
            "Addict - Bağımlı, Tiryaki","Addiction to - Bağımlılık, Tiryakilik","Addition - İlave, Ek","Additionally - Ayrıca, Bunun Yanı Sıra","Adequately - Yeterli Bir Şekilde","Adjust - Uyarlamak","Adjustment - Düzeltme, İntibak","Administer - İdare etmek, Yönetmek","Admire - Hayran Kalmak","Admit - Kabullenmek","Adopt - Evlat Edinmek","Adore - Çok Sevmek, Tapmak","Adverse - Zıt, Kötü",
            "Advocate - Savunmak, Desteklemek","Affact - Etkilemek","Aggravate - Gittikçe Kötüye Gitmek","Aggressive - Saldırgan","Aid - Yardım Etmek","Alien - Yabancı","Alongside - Yanında, Bitişiğinde","Alter - Değiştirmek","Alteration - Değişiklik","Amazing - Şaşırtıcı, Hayran Bırakıcı","Amend - Değişiklik Yapmak","Amendment - Değişiklik (kanun gibi)","Amusing - Eğlenceli, Zevkli","Announce - Anons",
            "Anticipate - Ummak, Beklemek","Apologize - Özür Dilemek","Appalling - Korkunç","Appointment - Tayin, Atama","Appreciate - Takdir Etmek","Appropriately - Uygun Olarak","Approve of - Onaylamak, Uygun Bulmak","Arrange - Düzenlemek, Ayarlamak","Artefact - İnsan Eliyle Yapılmış(sanat)","Ascend - Yukarı Çıkmak, Yükselmek","Ask for - Ricada Bulunmak, Bir şey istemek",
            "Aspire - Şiddetle Arzu Etmek","Assemble - Bir Araya Getirmek, Toplamak","Assess - Değerlendirmek","Assign - Atamak, Görevlendirmek","Assist Somebody in Somethink - Birine Bir Konuda Yardım Etmek","Associate - Çağrışım Yapmak, Çağrıştırmak","Assume - Farz Etmek","Assure - Birine Teminat Vermek","Astonishment - Şaşırtmak, Şaşırmak","Attach - İliştirmek, Eklemek",
            "Attack - Saldırı, Saldırmak","Attain - Elde Etmek, Erişmek","Attainment - Ulaşmak, Erişmek","Attend - İştirak Etmek, Katılmak","Attribute - (bir sebebe) Dayandırmak","Available - Mevcut, Müsait","Avert - Olmasını Engellemek","Avoldable - Kaçınılabilir , Engellenebilir","Award - Ödül","",
            "B","Backward - Geri Kalmış, Geriye Doğru","Badly in Need of - Bir Şeye Çok Muhtaç Olmak","Barely - Neredeyse Hiç","Bargain - Pazarlık, Anlaşma","Barren - Kurak, Verimsiz","Basic - Temel","Bazaar - Pazar","Behave - Davranmak","Believe - İnanmak","Belongings - Birinin Kişisel Eşyaları","Beloved - Sevgili, Hazret","Bitingly Satirical - Aşırı Alaycı","Bizarre - Tuhaf, Acayip",
            "Blanket - Battaniye","Blaze - Ateş, Alev, Yangın","Bolt - Fırlayıp Kaçmak","Branch - Dal, Branş","Break off - (nişan, nikah)Bozmak, Ayrılmak","Breed - Doğurmak, Yavrulamak","Bribery - Rüşvet","Bride - Gelin","Brief - Kısa, Öz","In Brief - Kısaca","Bring up - Çocuk Büyütmek","Broadcast - (radyo,tv için) Yayın","Broadly Speaking - Açık Konuşmak Gerekirse","Broil - Izgara Yapmak","Bullfight - Boğa Güreşi",
            "Bully - Kabadayı, Zorbalık","Burial - Gömü, Gömme","Burn - Yakmak","Button - Düğme","",
            "C","Calculator - Hesap Makinesi","Call for - Talep Etmek","Calm - Sakin","Cancel - İptal Etmek","Captivating - Büyüleyici","Captive - Tutsak, Esir","Captivity - Tutsaklık, Esirlik","Capture - Yakalamak, Ele geçirmek","Careless - Dikkatsiz","Carry Out - İcre Etmek","Carve - Oymak, Kesmek","Casually - Günlük, Sıradan","Caution - Uyarı, Dikkat","Cease - Sona Erdirmek, Durdurmak","Ceaseless - Aralıksız, Durmadan",
            "Celebration - Kutlamak","Celebrity - Ünlü","Census - Nüfus Sayımı","Ceremony - Tören","Charge - ... ile Yargılamak(mahkemede)","Circulate - Dolaşmak, Dolaştırmak","Circulation - (1)Dolaşım (2)Günlük Satış Oranı","Cite - Örneklemek","Citizen - Vatandaş","Citizenship - Vatandaşlık","Clarify - Açıklamak","Claw - Pençe","Clearance - (1)Mağazayı Boşaltma (2)Yeşil ışık","Closed - Kapalı","Closure - Kapanış, İflas",
            "Collapse - (bina için)Çökmek, Bayılmak","Collabsible - Katlanabilir","Collar - Yaka, Tasma","Colleague - İş Arkadaşı","Collide With - Çarpışmak","Commence - Başlamak","Commencement Speech - Açılış Konuşması","Comment on - Yorum yapmak","","asda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        Intent intentword=getIntent();
        listView =findViewById(R.id.listView);
        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, words);
        listView.setAdapter(veriAdaptoru);


    }
}
