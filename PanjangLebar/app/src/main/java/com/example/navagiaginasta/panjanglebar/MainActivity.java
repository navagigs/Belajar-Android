package com.example.navagiaginasta.panjanglebar;

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

    public void btnhitung (View a) {
        TextView inputPanjang = (TextView) findViewById(R.id. inputPanjang);
        TextView inputLebar = (TextView) findViewById(R.id. inputLebar);
        TextView tvHasil = (TextView) findViewById(R.id. tvHasil);
        double panjang = Double.parseDouble(inputPanjang.getText().toString());
        double lebar = Double.parseDouble(inputLebar.getText().toString());

        double luas = panjang * lebar;

        tvHasil.setText(luas+"");
    }
}
