package com.example.ders_21042022;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText sayi1=findViewById(R.id.birinciSayi);
        EditText sayi2=findViewById(R.id.ikinciSayi);
        Button toplam=findViewById(R.id.toplamBtn);
        Button carp=findViewById(R.id.carpBtn);
        Button cikar=findViewById(R.id.cikarBtn);
        Button bol=findViewById(R.id.bolBtn);
        TextView uyari=findViewById(R.id.uyari);
        TextView sonuc=findViewById(R.id.sonuc);
        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setVisibility(view.INVISIBLE);
                if (sayi1.getText().toString().equals("")&&sayi2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"Lütfen sayı alanlarını boş bırakmayınız!",Toast.LENGTH_LONG).show();

                } else if (sayi1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"Lütfen birinci sayı için geçerli bir değer giriniz!",Toast.LENGTH_LONG).show();
                }
                else if(!sayi1.getText().toString().equals("")&&!sayi2.getText().toString().equals("")){

                    Integer cikar=Integer.parseInt(sayi1.getText().toString())-Integer.parseInt(sayi2.getText().toString());
                    sonuc.setVisibility(view.VISIBLE);
                    sonuc.setText("Çıkarma Sonucu= "+cikar);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Lütfen ikinci alanlarını boş bırakmayınız!",Toast.LENGTH_LONG).show();
                }
            }
        });
        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setVisibility(view.INVISIBLE);
                if (sayi1.getText().toString().equals("")&&sayi2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"Lütfen sayı alanlarını boş bırakmayınız!",Toast.LENGTH_LONG).show();

                } else if (sayi1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"Lütfen birinci sayı için geçerli bir değer giriniz!",Toast.LENGTH_LONG).show();
                }
                else if(!sayi1.getText().toString().equals("")&&!sayi2.getText().toString().equals("")){


                    Float bol=Float.parseFloat(sayi1.getText().toString())/Float.parseFloat(sayi2.getText().toString());
                    sonuc.setVisibility(view.VISIBLE);
                    sonuc.setText("Bölme Sonucu= "+bol);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Lütfen ikinci alanlarını boş bırakmayınız!",Toast.LENGTH_LONG).show();
                }
            }
        });
        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setVisibility(view.INVISIBLE);
                if (sayi1.getText().toString().equals("")&&sayi2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"Lütfen sayı alanlarını boş bırakmayınız!",Toast.LENGTH_LONG).show();

                } else if (sayi1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"Lütfen birinci sayı için geçerli bir değer giriniz!",Toast.LENGTH_LONG).show();
                }
                else if(!sayi1.getText().toString().equals("")&&!sayi2.getText().toString().equals("")){


                    Integer carp=Integer.parseInt(sayi1.getText().toString())*Integer.parseInt(sayi2.getText().toString());
                    sonuc.setVisibility(view.VISIBLE);
                    sonuc.setText("Çapım Sonucu= "+carp);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Lütfen ikinci alanlarını boş bırakmayınız!",Toast.LENGTH_LONG).show();
                }

            }
        });
        toplam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setVisibility(view.INVISIBLE);
                if (sayi1.getText().toString().equals("")&&sayi2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"Lütfen sayı alanlarını boş bırakmayınız!",Toast.LENGTH_LONG).show();

                } else if (sayi1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"Lütfen birinci sayı için geçerli bir değer giriniz!",Toast.LENGTH_LONG).show();
                }
                else if(!sayi1.getText().toString().equals("")&&!sayi2.getText().toString().equals("")){

                    Integer toplam=Integer.parseInt(sayi1.getText().toString())+Integer.parseInt(sayi2.getText().toString());
                    sonuc.setVisibility(view.VISIBLE);
                    sonuc.setText("Toplam Sonucu= "+toplam);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Lütfen ikinci alanlarını boş bırakmayınız!",Toast.LENGTH_LONG).show();

                }

            }
        });



    }
}