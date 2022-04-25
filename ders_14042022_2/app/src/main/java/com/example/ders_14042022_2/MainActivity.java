package com.example.ders_14042022_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText secim= findViewById(R.id.edit_txt_secim);
        TextView sonuc= findViewById(R.id.txt_sonuc);
        Button satinAl= findViewById(R.id.btn_satinAl);
        secim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer i=Integer.valueOf(String.valueOf(secim.getText()));
                if(i==1){
                    sonuc.setVisibility(view.VISIBLE);
                    sonuc.setText("Elektronik kategorisi: 150TL");

                }
                else if(i==2){
                    sonuc.setVisibility(view.VISIBLE);
                    sonuc.setText("Giyim kategorisi: 120TL");
                }
                else if(i==3){
                    sonuc.setVisibility(view.VISIBLE);
                    sonuc.setText("Gıda kategorisi: 100TL");
                }
                else{
                    sonuc.setVisibility(view.VISIBLE);
                    sonuc.setText("Lütfen geçerli bir kod giriniz!");
                }
            }
        });
        satinAl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(String.valueOf(secim.getText()).equals("1")){
                    sonuc.setVisibility(view.VISIBLE);
                    sonuc.setText("Elektronik kategorisi ödendi");
                }
                else if(String.valueOf(secim.getText()).equals("2")){
                    sonuc.setVisibility(view.VISIBLE);
                    sonuc.setText("Giyim kategorisi ödendi");
                }
                else if (String.valueOf(secim.getText()).equals("3")){
                    sonuc.setVisibility(view.VISIBLE);
                    sonuc.setText("Gıda kategorisi ödendi");
                }
                else{
                    sonuc.setVisibility(view.VISIBLE);
                    sonuc.setText("Lütfen geçerli bir kod giriniz!");
                }
            }
        });

    }
}