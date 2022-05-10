package com.example.ders_26042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class girisEkrani extends AppCompatActivity {
//    String kullanici;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giris_ekrani);
        EditText kullaniciAdi=findViewById(R.id.edit_kullaniciAdi);
        EditText sifre=findViewById(R.id.edit_sifre);
        Button girisYap=findViewById(R.id.btn_girisYap);
        girisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kullaniciAdi.getText().toString().equals("username") && sifre.getText().toString().equals("1234")){
//                    kullanici=kullaniciAdi.getText().toString();
                    Toast.makeText(getApplicationContext(),"Giriş Yapılıyor...",Toast.LENGTH_SHORT).show();
                    Intent girisYapildi=new Intent(girisEkrani.this,kullaniciEkrani.class);
                    startActivity(girisYapildi);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Hata! Bilgilerinizi Kontrol Ediniz!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
//    public String username(){
//        return kullanici;
//    }
}