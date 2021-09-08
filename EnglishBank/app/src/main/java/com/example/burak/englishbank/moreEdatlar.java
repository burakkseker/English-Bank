package com.example.burak.englishbank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreEdatlar extends AppCompatActivity {
        ListView listeEdatlar;
        String [] Edatlar={"PREPOSITIONS – Edatlar","About : hakkında – den sonra – e İlgili olarak – e üzere – aşağı yukarı","We talked about market situation in our fax. / -Size faksımızda piyasa koşulları hakkında bahsetmiştik.",
        "","Above : -den yukarı -ötede -den fazla","All cargoes are above normal level of store. / Tüm yükler deponun normal seviyesinden yukarıdadır.","",
        "Across : -karşıdan karşıya -öbür tarafa -karşı","We have passed across by boat. / Karşıdan karşıya feribotla geçtik.","",
        "After : -den sonra (yer) -den sonra(zaman) -den sonra (sonuç)","We will ship the goods after İstanbul to İzmir.  / Malları İstanbul’dan sonra İzmir’e sevk edeceğiz.","",
        "Against : -karşısında -mukabili -için -a zıt olarak -e karşı","We have searched/examined your case against your claim. / -İddianız karşısında davanızı inceledik.","",
        "Along : -boyunca","Due to bad weather all the roads are closed along 20 km. / -20 km boyunca kötü hava koşulları nedeniyle tüm yollar kapalı.","",
        "Among : arasında","Among the addresses which we have received… / -Aldığımız adresler arasında…","",
        "At : -de “yer” -de “zaman” -e “yön” -de “iş,eylem”","There are two vessels waiting at the port./ -Limanda bekleyen 2 gemi var.","",
        "Because of : -nın yüzünden -e nedeniyle","Loading has stopped because of rain. / -All cargoes have heavy damaged because of humidity.","",
        "Before : -den önce “zaman” -den önce “yer” -önüne","We will sail before 24:00 today. / -Bu gün saat 24:00 den önce hareket edeceğiz.","",
        "Behind : -arkasında","Please load our cargoes behind of truck. / -Lütfen bizim yüklerimizi kamyonun arkasına yükleyiniz.","",
        "Below : -altına -altında","Please sign and write your name under your letter-head. / -Lütfen antetli kağıdınızın altına isminizi yazıp imzalayınız.","",
        "Beside : -yanına -yanında","We are storing your goods beside the other storage room. / -Mallarınızı diğer deponun yanında depoluyoruz.","",
        "Between : – arasında“iki nesne”, – arasında “zaman”","Between port and factory distance is about 10 km. / -Loading of  the goods will be completed between 15:00/18:00","",
        "Beyond : -ötesinde, -dışında","-Free zone is beyond the port, if you want we can discharge your goods to over there. / -Serbest bölge limanın dışındadır, isterseniz mallarınızı oraya boşaltabiliriz.","",
        "By : -ile, -tarafından, -vasıtasıyla, -yoluyla, -civarında, -ile “ölçü”, -önünden","We will load cargoes by railway cars to the vessel. / -Malları gemiye vagonlarla yükleyeceğiz.","",
        "Concerning : -e hakkında","Pls inform us concerning to your products. / -Lütfen bize ürünleriniz hakkında bilgi veriniz.","",
        "Down : -den aşağı","Please go down from the next street. / -Bir sonraki caddeden aşağı doğru devam edin.","",
        "During : -esnasında","Loading has not continue during holiday. / -Tatil boyunca yükleme  devam etmedi.","",
        "Except : -den hariç, -den başka","We have received all our cargoes except two cartons. / -İki koli haricinde tüm yükümüzü teslim aldık.","",
        "For : -için, -amacıyla, -den dolayı","All labourers are working for complete your orders. / -İşçilerin tümü siparişlerinizi tamamlamak için çalışıyorlar.","",
        "From : -den dan, -e göre","From what you say they must be a big importer company of… / -Söylediğinize göre onlar… nın ithalatçısı olan büyük bir firması olmalı.","",
        "In : -de, -içine, -içinde","As you know very well we had chartered your vessel in October. / -Geminizi bildiğiniz üzere Ekim ayında kiralamıştık.","",
        "In front of : -nin önünde, -nin önüne","In this port there are two vessels in front of ours. / -Bu limanda bizim geminin önünde iki gemi daha var.","",
        "In spite of : -e rağmen","In spite of their slack-manner we could not cancel our business relations -with them due to we have signed a contract and our investments. / -Yaptığımız bir anlaşma ve yatırımlarımız nedeniyle gevşek tavırlarına rağmen onlarla olan iş ilişkilerimizi bitiremedik","",
        "Inside : -içine","Please store all our goods inside the closed storage-rooms. / -Lütfen tüm mallarımızı kapalı depolara koyunuz.","",
        "Into : -içine","Your cargo has been loaded into our next truck. / -Sizin yükünüz diğer kamyonumuzun içine yüklendi.","",
        "Like : -gibi","We try to produce the best quality products like famous brands. / -Ünlü markalar gibi yüksek kaliteli mamuller üretmeye çalışıyoruz.","","Near : -yanına, -yakınında",
        "All dangerous cargoes are near other cargoes. / -Tüm diğer tehlikeli maddeler diğer yüklerin yanında.","",
        "Next to : -nın yanı başında","Our sales-store is next to our factory. / -Satış mağazamız fabrikamızın hemen yanındadır.","",
        "Of : -nın, -den “ yer”, -li, -hakkında, -nedeniyle, -ile içerik","All the goods are Source of Turkey. / -Malların hepsi Türk Menşe-ilidir.","",
        "On : -nın üstünde, -de “zaman”","Your shipment will be sent date on …/…/200..   / -Sevkıyatınız …./…/200.. tarihinde gönderilecek.","",
        "Opposite : -nın karşısında","Manager’s room is opposite to accounting department. / -Müdürün odası muhasebe departmanının karşısındadır.","",
        "Out : -dışarı","Due to a big fire all personals have left the building. / -Büyük bir yangın nedeniyle tüm personel binayı terk etti.","",
        "Outside : -nın dışında","Why our goods are waited outside the closed storage-room? / -Neden mallarımız kapalı alanın dışında bekletiliyor?","",
        "Over : -nın üzerinde","You have added 1000 USD as additional expenses over our first current account sheet why? / -Bize verdiğiniz ilk cari hesap extresinin üzerine ek masraflar adı altında 1000 USD  eklemişsiniz niçin?.","",
        "past : -den daha öteye, -geçe “saat”","We have remitted 10.000 USD to your account half past nine today. / -Bu gün saat dokuz buçukta hesabınıza 10000 dolar yatırdık.","",
        "Round : -etrafında","All investors have become focused round the European Countries this year. / -Tüm yatırımcılar bu yıl Avrupa Ülkeleri etrafında odaklaştılar.","",
        "Since : -den beri, -e boyunca","We’ve lost a lot of time and money since strike. / -Grevden beri çok büyük para ve zaman kaybettik.","",
        "Through : -içinden, -yardımıyla, -her tarafına","We can carry your cargoes through railway cars. / -Yüklerinizi ancak vagonlar yardımıyla taşıyabiliriz.","",
        "To : -e, -kala “saat”, -e göre/nazaran, -mek için","Your order has been produced to international quality standards. / -Siparişleriniz uluslar arası kalite standartlarına göre üretilmiştir","",
        "Towards : -e doğru","We are going towards port . / -Limana doğru ilerliyoruz.","",
        "Under : -nın altında, -den aşağı","Quality of this product under our expected. / -Bu malın kalitesi umduğumuzun altında.","",
        "Until : -e kadar","Please close all your balance until at the end of this month. / -Lütfen bu ayın sonuna kadar kalan tüm bakiyenizi kapatın.","",
        "Up : -den yukarı, -yukarı doğru","Please lift up containers. / -Lütfen konteynırları yukarı doğru kaldırın.","",
        "With : -ile, -üzerine, -yanısıra, -li","Please send us bills of lading with original copies. / -Lütfen  orijinalleri ile birlikte tüm konşimentoları gönderiniz.","",
        "With in : – içinde “zaman”","We will dispatch all your goods within today. / -Tüm mallarınızı bu gün içerisinde göndereceğiz.","",
        "Without : -meden, -meksizin, -siz","Please do not release original bills of lading to the third parties and consignee without our written instruction. / -Lütfen bizden yazılı talimat almadan orijinal konşimentoları yükün alıcısına ve üçüncü şahıslara vermeyiniz"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_edatlar);
        listeEdatlar=findViewById(R.id.listeEdatlar);
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Edatlar);
        listeEdatlar.setAdapter(veriAdaptoruYer);
    }
}
