package com.example.ders_16042022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //ctrl+alt+L= kodu düzenler(format shortcut)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t = findViewById(R.id.textView);
        TextView sum = findViewById(R.id.txt_toplam);
        String yazi = " ";
        Integer b = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Gazi Beltek");
        }
        for (int a = 1; a <= 4; a++) {
            yazi = (yazi + "\t" + String.valueOf(a));
            t.setText(yazi);
        }
        int i=0;
        for (i = 1; i <= 10; i++) {
            b += i;
        }
        int c=i-1;
        sum.setText("Birden "+c+"'a kadar olan sayıların toplamı: " +b);

    }
}