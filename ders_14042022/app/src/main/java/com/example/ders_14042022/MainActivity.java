package com.example.ders_14042022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText secim=findViewById(R.id.editTextTextPersonName);
        TextView odediniz_yazisi= findViewById(R.id.txt_odediniz);
        Button btn_ode=findViewById(R.id.button);


        secim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                byte i = Byte.valueOf(String.valueOf(secim.getText()));
                switch (i) {
                    case 1:
                        odediniz_yazisi.setVisibility(view.VISIBLE);
                        odediniz_yazisi.setText("Elektronik kategorisi: 150TL");
                        break;
                    case 2:
                        odediniz_yazisi.setVisibility(view.VISIBLE);
                        odediniz_yazisi.setText("Giyim kategorisi: 250TL");
                        break;
                    case 3:
                        odediniz_yazisi.setVisibility(view.VISIBLE);
                        odediniz_yazisi.setText("Yemek kategorisi: 100TL");
                        break;
                    default:
                        odediniz_yazisi.setVisibility(view.VISIBLE);
                        odediniz_yazisi.setText("Lütfen geçerli bir numara giriniz!");
                        break;
                }
            }
        });
        btn_ode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byte i = Byte.valueOf(String.valueOf(secim.getText()));
                switch (i) {
                    case 1:
                        odediniz_yazisi.setVisibility(view.VISIBLE);
                        odediniz_yazisi.setText("Elektronik ödendi");
                        break;
                    case 2:
                        odediniz_yazisi.setVisibility(view.VISIBLE);
                        odediniz_yazisi.setText("Giyim ödendi");
                        break;
                    case 3:
                        odediniz_yazisi.setVisibility(view.VISIBLE);
                        odediniz_yazisi.setText("Yemek ödendi");
                        break;
                    default:
                        odediniz_yazisi.setVisibility(view.VISIBLE);
                        odediniz_yazisi.setText("Lütfen geçerli bir numara giriniz!");
                        break;
                }
            }
        });


    }
}