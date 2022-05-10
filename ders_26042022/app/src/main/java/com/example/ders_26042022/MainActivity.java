package com.example.ders_26042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextPageBtn=findViewById(R.id.nextPage);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yeniSayfa= new Intent(MainActivity.this,girisEkrani.class);
                //Intent yeniSayfa= new Intent(getApplicationContext(),girisEkrani.class);
                startActivity(yeniSayfa);
            }
        });

    }
}