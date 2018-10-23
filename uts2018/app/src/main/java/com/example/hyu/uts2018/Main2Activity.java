package com.example.hyu.uts2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button btnExit;
    RadioGroup radioGroupNb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodata);


        final  EditText editNama = (EditText) findViewById(R.id.edit_nama);
        final EditText editNim = (EditText) findViewById(R.id.edit_nim);
        final EditText editAlamat = (EditText) findViewById(R.id.edit_alamat);

        final RadioGroup rgKelamin = (RadioGroup) findViewById(R.id.edit_kelamin);



        Button cancel = findViewById(R.id.bt_cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });



        Button btSubmitIntent = (Button) findViewById(R.id.bt_save);
        btSubmitIntent.setOnClickListener(new View.OnClickListener() {


            RadioGroup rdG;
            RadioButton radioButton;
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                intent.putExtra("NAMA", editNama.getText().toString());
                intent.putExtra("NIM", editNim.getText().toString());
                intent.putExtra("ALAMAT", editAlamat.getText().toString());
                //intent.putExtra("KELAMIN", rgKelamin.getCheckedRadioButtonId());

                rdG = findViewById(R.id.edit_kelamin);
                int selectedId = rdG.getCheckedRadioButtonId();
                radioButton = findViewById(selectedId);
                String gr = radioButton.getText().toString();
                intent.putExtra("KELAMIN", gr);

                startActivity(intent);
            }
        });







    }
}





