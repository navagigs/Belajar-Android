package com.example.navagiaginasta.latihan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // variabel
    EditText inputNama;
    EditText inputEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputNama = (EditText) findViewById(R.id.nama);
        inputEmail = (EditText) findViewById(R.id.email);
        Button btnNextScreen = (Button) findViewById(R.id.btnNextScreen);
//Menangkap tombol event
        btnNextScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
//Memulai Intent Baru
                Intent nextScreen = new Intent(getApplicationContext(),ScreenDuaActivity.class);
//Sending data to another Activity
                nextScreen.putExtra("nama", inputNama.getText().toString());
                nextScreen.putExtra("email",
                        inputEmail.getText().toString());
                Log.e("n", inputNama.getText() + "." + inputEmail.getText());
                startActivity(nextScreen);
            }
        });
    @Override

}
