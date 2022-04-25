package com.example.ders_07042022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tıklayınız butonuna basinca gazi web sitesine giden kod
        Button btnLink= (Button) findViewById(R.id.button);
        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gaziyeGit();
            }
        });
    }
    private void gaziyeGit() {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gazi.edu.tr"));
        startActivity(intent);
    }

}