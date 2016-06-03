package com.example.navagiaginasta.myapplication;

/**
 * Created by Nava Gigs on 5/21/2016.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.sql.SQLException;

public class CreateDataMhs extends Activity implements OnClickListener {

    private Button buttonSubmitMhs;
    private EditText edNpm;
    private EditText edNama;
    private EditText edKelas;
    private DBDataSourceMhs dataSourceMhs;

    public void onCreate(Bundle savedInstancedState) {
        super.onCreate(savedInstancedState);
        setContentView(R.layout.create_datamh);

        buttonSubmitMhs = (Button) findViewById(R.id.button_mhs);
        buttonSubmitMhs.setOnClickListener(this);

        edNpm = (EditText) findViewById(R.id.mahasiswa_npm);
        edNama = (EditText) findViewById(R.id.mahasiswa_nama);
        edKelas = (EditText) findViewById(R.id.mahasiswa_kelas);

        dataSourceMhs = new DBDataSourceMhs(this);
        try {
            dataSourceMhs.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void onClick(View v) {

        String npm = null;
        String nama = null;
        String kelas = null;
        @SuppressWarnings("unused")

        Mahasiswa mahasiswa = null;
        if (edNama.getText() != null && edNpm.getText() != null && edKelas.getText() != null) {
            nama = edNama.getText().toString();
            npm = edNpm.getText().toString();
            kelas = edKelas.getText().toString();
        }

        switch (v.getId()) {
            case R.id.button_mhs:
                mahasiswa = dataSourceMhs.createMahasiswa(npm, nama, kelas);

                Toast.makeText(this, "Ditambahkan Mahasiswa baru\n"
                                + "NPM:" + mahasiswa.getMahasiswa_npm()
                                + "NAMA:" + mahasiswa.getMahasiswa_nama()
                                + "KELAS:" + mahasiswa.getMahasiswa_kelas(),
                        Toast.LENGTH_LONG).show();
                break;

        }
    }
}
