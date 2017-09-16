package com.example.android.munakoki;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by zharin on 8/24/2017.
 */

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button menuButton = (Button) findViewById(R.id.btn_kabuto);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Kabuto.class);
                startActivity(intent);
            }
        });

        Button menuButton2 = (Button) findViewById(R.id.btn_kambewe);
        menuButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Kambewe.class);
                startActivity(intent);
            }
        });

        Button menuButton3 = (Button) findViewById(R.id.btn_kambuse);
        menuButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Kambuse.class);
                startActivity(intent);
            }
        });

        Button menuButton4 = (Button) findViewById(R.id.btn_katumbu_gola);
        menuButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, KatumbuGola.class);
                startActivity(intent);
            }
        });

        Button menuButton5 = (Button) findViewById(R.id.btn_kasoami);
        menuButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Kasoami.class);
                startActivity(intent);
            }
        });

      }
}
