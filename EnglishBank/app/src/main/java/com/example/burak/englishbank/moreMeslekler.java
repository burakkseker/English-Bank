package com.example.burak.englishbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class moreMeslekler extends AppCompatActivity {
    ListView listeMeslek;
    String [] Meslekler={"Actor - Aktör","Artist - Sanatçı","Carpenter - Marangoz","Cook - Aşçı","Fire Fighter - İtfaiyeci","Gardener - Bahçivan",
    "Judge - Hakim","Lawyer - Avukat","Nurse - Hemşire","Soldier - Asker","Waiter - Garson","Waitress - Kız Garson","Tailor - Terzi",
    "Agent - Ajan","Announcer - Spiker","Architect - Mimar","Author - Yazar","Banker - Bankacı","Cashier - Kasiyer","Engineer - Mühendis",
    "Dentist - Dişçi","Executive - Yönetici","Farmer - Çiftçi","Hairdresser - Kuaför","Jeweller - Kuyumcu","Journalist - Gazeteci",
    "Locksmith - Çilingir","Photographer - Fotoğrafçı","Poet - Şair","Priest - Papaz","Prosecutor - Savcı","Psychologist - Psikolog","Singer - Şarkıcı",
    "Soldier - Asker","Surgeon - Cerrah","Teacher - Öğretmen","Technician - Teknisyen","Writer - Yazar","Worker - İşçi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_meslekler);
        listeMeslek=findViewById(R.id.listeMeslek);
        Intent intentMeslek=getIntent();
        ArrayAdapter<String> veriAdaptoruYer=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, Meslekler);
        listeMeslek.setAdapter(veriAdaptoruYer);
    }
}
