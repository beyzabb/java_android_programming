package com.example.ders_26042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class kullaniciEkrani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kullanici_ekrani);
        Button cikis=findViewById(R.id.btn_cikis);
        TextView merhaba=findViewById(R.id.txt_avatar);
        ImageView user=findViewById(R.id.image_user);
        Button kadin =findViewById(R.id.btn_kadin);
        Button erkek=findViewById(R.id.btn_erkek);
        Button gizli=findViewById(R.id.btn_maske);

        erkek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user.setImageResource(R.drawable.man);
            }
        });

        kadin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setImageResource(R.drawable.woman);
            }
        });

        gizli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setImageResource(R.drawable.anonymous);
            }
        });
//        girisEkrani a=new girisEkrani();
//        String b=a.username();
//        merhaba.setText("Merhaba "+ b);
        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cikisYap=new Intent(kullaniciEkrani.this,girisEkrani.class);
                startActivity(cikisYap);
                Toast.makeText(getApplicationContext(),"Çıkış Yapılıyor...",Toast.LENGTH_SHORT).show();
            }
        });
    }
}