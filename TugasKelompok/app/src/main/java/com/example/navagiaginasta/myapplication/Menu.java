package com.example.navagiaginasta.myapplication;

/**
 * Created by Nava Gigs on 5/19/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import com.example.navagiaginasta.myapplication.CreateData;

public class Menu extends Activity implements OnClickListener {

    private Button bTambah;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        bTambah = (Button) findViewById(R.id.button_tambah);
        bTambah.setOnClickListener(this);

    }

    //Mahasiswa
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button_tambah :
                Intent i = new Intent(this, CreateData,class);
                startActivity(i);
                break;

        }
    }

}
