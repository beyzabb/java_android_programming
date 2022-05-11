package com.example.ders_28042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img_cat=findViewById(R.id.imageView_cat);
        Button btn_change=findViewById(R.id.btn_change);
        TextView txt_hello=findViewById(R.id.txt_hello);
        Button nextPage=findViewById(R.id.btn_nextPage);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go=new Intent(MainActivity.this,secondPage.class);
                startActivity(go);
            }
        });

        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_hello.setText("Hello Dog!");
                img_cat.setImageResource(R.drawable.dog);
            }
        });
    }
}