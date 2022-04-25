package com.example.hesapmakinesi;

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
                    uyari.setVisibility(view.INVISIBLE);
                    sonuc.setVisibility(view.INVISIBLE);
                    if (sayi1.getText().toString().equals("")&&sayi2.getText().toString().equals("")) {
                        uyari.setVisibility(view.VISIBLE);
                        uyari.setText("Lütfen sayı alanlarını boş bırakmayınız!");

                    } else if (sayi1.getText().toString().equals("")) {
                        uyari.setVisibility(view.VISIBLE);
                        uyari.setText("Lütfen birinci sayı için geçerli bir değer giriniz!");
                    }
                    else if(!sayi1.getText().toString().equals("")&&!sayi2.getText().toString().equals("")){

                        Integer cikar=Integer.parseInt(sayi1.getText().toString())-Integer.parseInt(sayi2.getText().toString());
                        sonuc.setVisibility(view.VISIBLE);
                        sonuc.setText("Çıkarma Sonucu= "+cikar);
                    }
                    else{
                        uyari.setVisibility(view.VISIBLE);
                        uyari.setText("Lütfen ikinci alanlarını boş bırakmayınız!");
                    }
                }
            });
            bol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    uyari.setVisibility(view.INVISIBLE);
                    sonuc.setVisibility(view.INVISIBLE);
                    if (sayi1.getText().toString().equals("")&&sayi2.getText().toString().equals("")) {
                        uyari.setVisibility(view.VISIBLE);
                        uyari.setText("Lütfen sayı alanlarını boş bırakmayınız!");

                    } else if (sayi1.getText().toString().equals("")) {
                        uyari.setVisibility(view.VISIBLE);
                        uyari.setText("Lütfen birinci sayı için geçerli bir değer giriniz!");
                    }
                    else if(!sayi1.getText().toString().equals("")&&!sayi2.getText().toString().equals("")){


                        Float bol=Float.parseFloat(sayi1.getText().toString())/Float.parseFloat(sayi2.getText().toString());
                        sonuc.setVisibility(view.VISIBLE);
                        sonuc.setText("Bölme Sonucu= "+bol);
                    }
                    else{
                        uyari.setVisibility(view.VISIBLE);
                        uyari.setText("Lütfen ikinci alanlarını boş bırakmayınız!");
                    }
                }
            });
            carp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    uyari.setVisibility(view.INVISIBLE);
                    sonuc.setVisibility(view.INVISIBLE);
                    if (sayi1.getText().toString().equals("")&&sayi2.getText().toString().equals("")) {
                        uyari.setVisibility(view.VISIBLE);
                        uyari.setText("Lütfen sayı alanlarını boş bırakmayınız!");

                    } else if (sayi1.getText().toString().equals("")) {
                        uyari.setVisibility(view.VISIBLE);
                        uyari.setText("Lütfen birinci sayı için geçerli bir değer giriniz!");
                    }
                    else if(!sayi1.getText().toString().equals("")&&!sayi2.getText().toString().equals("")){


                        Integer carp=Integer.parseInt(sayi1.getText().toString())*Integer.parseInt(sayi2.getText().toString());
                        sonuc.setVisibility(view.VISIBLE);
                        sonuc.setText("Çapım Sonucu= "+carp);
                    }
                    else{
                        uyari.setVisibility(view.VISIBLE);
                        uyari.setText("Lütfen ikinci alanlarını boş bırakmayınız!");
                    }

                }
            });
            toplam.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    uyari.setVisibility(view.INVISIBLE);
                    sonuc.setVisibility(view.INVISIBLE);
                        if (sayi1.getText().toString().equals("")&&sayi2.getText().toString().equals("")) {
                            uyari.setVisibility(view.VISIBLE);
                            uyari.setText("Lütfen sayı alanlarını boş bırakmayınız!");

                        } else if (sayi1.getText().toString().equals("")) {
                            uyari.setVisibility(view.VISIBLE);
                            uyari.setText("Lütfen birinci sayı için geçerli bir değer giriniz!");
                        }
                        else if(!sayi1.getText().toString().equals("")&&!sayi2.getText().toString().equals("")){

                            Integer toplam=Integer.parseInt(sayi1.getText().toString())+Integer.parseInt(sayi2.getText().toString());
                            sonuc.setVisibility(view.VISIBLE);
                            sonuc.setText("Toplam Sonucu= "+toplam);
                        }
                        else{
                            uyari.setVisibility(view.VISIBLE);
                            uyari.setText("Lütfen ikinci alanlarını boş bırakmayınız!");

                        }

                }
            });


    }

}