package com.example.navagiaginasta.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //MENAMPILKAN NAMA
    public void tombolonclick (View v) {
        EditText teksedit = (EditText) findViewById (R.id.editText1);
        TextView teks = (TextView) findViewById (R.id.textView1);
        teks.setText(teksedit.getText());
    }

    //MENAMPILKAN PHP DAN JAVA
    public void klikHasil (View V) {
        TextView tvHasil = (TextView) findViewById(R.id. tvHasil);
        CheckBox cbJava = (CheckBox) findViewById(R.id.cbJava);
        CheckBox cbPHP = (CheckBox) findViewById(R.id.cbPHP);
        String s="";
        if (cbJava.isChecked()) {
            s = s + " Java";
        }
        if (cbPHP.isChecked()) {
            s = s + " PHP";
        }

        tvHasil.setText(s);
    }

    //MENAMPILKAN JENIS KELAMIN
    public void klikHasil2 (View V) {
        TextView tvHasil = (TextView) findViewById(R.id. tvHasil);
        RadioGroup rgJenisKelamin = (RadioGroup) findViewById(R.id.rgJenisKelamin);
        int id = rgJenisKelamin.getCheckedRadioButtonId();

        if (id==R.id.rLaki2) {
            tvHasil.setText("Laki-laki");
        }
        else if (id==R.id.rPerempuan) {
            tvHasil.setText("Perempuan");
        }
        else {
            tvHasil.setText("Tidak diisi");
        }
    }

    public void hitungLuas (View a) {
        TextView edtPanjang = (TextView) findViewById(R.id. edtPanjang);
        TextView tvHasil = (TextView) findViewById(R.id. tvHasil);
        TextView hasilNama = (TextView) findViewById (R.id.hasilNama);
        double jari = Double.parseDouble(edtPanjang.getText().toString());

        double luas = 3.14*jari*jari;

        tvHasil.setText(luas+"");
    }


    public void tampilNama (View z) {
        EditText teksedit = (EditText) findViewByQId (R.id.editText1);
        TextView hasilNama = (TextView) findViewById (R.id.hasilNama);

        CheckBox cbJava = (CheckBox) findViewById(R.id.cbJava);
        CheckBox cbPHP = (CheckBox) findViewById(R.id.cbPHP);
        String s="";
        if (cbJava.isChecked()) {
            s = s + " Jalan-jalan";
        }
        if (cbPHP.isChecked()) {
            s = s + " Jogging";
        }

        RadioGroup rgJenisKelamin = (RadioGroup) findViewById(R.id.rgJenisKelamin);
        int id = rgJenisKelamin.getCheckedRadioButtonId();

        String d="";
        if (id==R.id.rLaki2) {
            d = d + " Laki-laki";
        }
        else if (id==R.id.rPerempuan) {
            d = d + " Perempuan";
        }
        else {
            d = d + " tidak diisi";
        }

        hasilNama.setText("hallo " +teksedit.getText()+  "\n Hobi"+s+"\n jenis kelamin:"+d);
    }

    public void exit (View c) {

        moveTaskToBack(true);
    }
}
