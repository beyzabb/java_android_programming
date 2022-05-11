package com.example.ders_28042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class secondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        Button btn_image=findViewById(R.id.btn_image);
        ImageView penguin_image=findViewById(R.id.imageView);
        Button btn_thirdPage=findViewById(R.id.btn_thirdPage);

        btn_thirdPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goThirdPage=new Intent(secondPage.this,third_page.class);
                startActivity(goThirdPage);
            }
        });
        btn_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                penguin_image.setVisibility(view.VISIBLE);
            }
        });
    }
}