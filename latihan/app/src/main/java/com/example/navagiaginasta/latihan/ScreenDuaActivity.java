package com.example.navagiaginasta.latihan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Owner on 5/10/2016.
 */
public class ScreenDuaActivity extends Activity{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_dua);
        TextView txtNama = (TextView) findViewById(R.id.txtNama);
        TextView txtEmail = (TextView) findViewById(R.id.txtEmail);
        Button btnClose = (Button) findViewById(R.id.btnClose);
        Intent i = getIntent();
// Menerima the Data
        String nama = i.getStringExtra("nama");
        String email = i.getStringExtra("email");
        Log.e("Screen Kedua", nama + "." + email);
// Menampilkan data yang diterima
        txtNama.setText(nama);
        txtEmail.setText(email);
// Klik event pada tombol
        btnClose.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
//Menutup ScreenDua Activity
                finish();
            }
        });
    }



}

