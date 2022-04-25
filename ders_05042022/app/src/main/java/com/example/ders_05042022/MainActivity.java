package com.example.ders_05042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Degistir butonuna basinca buton yazisini degistiren kod
        Button degistir = (Button) findViewById(R.id.btn_renk);
        Resources res = getResources();
        degistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                degistir.setText(res.getString(R.string.degismis_yazi));
                degistir.setText("Yazınız değişti bile");
                degistir.setBackgroundColor(Color.CYAN);
                //degistir.setBackgroundColor(res.getColor(R.color.red));
            }
        });


        //degisken toplamini ekrana yazdiran kod
        Integer a, b, c;
        a = 15;
        b = 20;
        c = 45;
        Integer toplam = a + b + c;
        TextView txt_ilk = (TextView) findViewById(R.id.txt_toplam);
        txt_ilk.setText("Toplam sonucu= " + Integer.toString(toplam));


    }
}
