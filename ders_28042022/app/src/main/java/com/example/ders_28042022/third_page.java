package com.example.ders_28042022;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class third_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_page);
        ImageView chamaleon=findViewById(R.id.iv_chamaleon);
        Button visible=findViewById(R.id.btn_visible);
        Button invisible=findViewById(R.id.btn_invisible);
        Button cat=findViewById(R.id.btn_cat);
        Button dog=findViewById(R.id.btn_dog);
        Button penguin=findViewById(R.id.btn_penguin);
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chamaleon.setImageResource(R.drawable.cat);
            }
        });
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chamaleon.setImageResource(R.drawable.dog);
            }
        });
        penguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chamaleon.setImageResource(R.drawable.penguin);
            }
        });
        visible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chamaleon.setVisibility(view.INVISIBLE);
            }
        });
        invisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chamaleon.setVisibility(view.VISIBLE);
            }
        });
    }
}