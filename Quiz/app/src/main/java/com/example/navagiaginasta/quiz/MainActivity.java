package com.example.navagiaginasta.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // menggunakan listener

        Button button = (button) findViewById(R.id.button);
        button.setOnclickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView edit1 = (TextView) findViewById(R.id.edit1);
                TextView edit2 = (TextView) findViewById(R.id.edit2);
                TextView tvHasil = (TextView) findViewById(R.id.tvHasil);
                TextView tvHasiledit1 = (TextView) findViewById(R.id.tvHasiledit1);
                int harga = Integer.parseInt(edit1.getText().toString());
                int nominal = Integer.parseInt(edit2.getText().toString());

                int luas = harga * nominal;
                tvHasiledit1.setText(edit1.getText());
                tvHasil.setText(luas + "");
            }
        });
    }


