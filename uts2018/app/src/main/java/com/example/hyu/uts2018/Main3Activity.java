package com.example.hyu.uts2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {


    //Button btnCLose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil);

        Intent intent = getIntent();
        TextView nim = findViewById(R.id.view_nama);
        nim.setText(intent.getStringExtra("NIM"));

        TextView nama = findViewById(R.id.view_nim);
        nama.setText(intent.getStringExtra("NAMA"));

        TextView alamat = findViewById(R.id.view_alamat);
        alamat.setText(intent.getStringExtra("ALAMAT"));


        TextView kelamin = findViewById(R.id.view_kelamin);
        kelamin.setText(intent.getStringExtra("KELAMIN"));



        Button close = findViewById(R.id.bt_close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        Button kembali = findViewById(R.id.bt_back);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });


    }
}