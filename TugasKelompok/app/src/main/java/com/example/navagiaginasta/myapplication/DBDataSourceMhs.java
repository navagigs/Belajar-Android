package com.example.navagiaginasta.myapplication;

/**
 * Created by Nava Gigs on 5/21/2016.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.sql.SQLException;
import java.util.ArrayList;

public class DBDataSourceMhs {

    private SQLiteDatabase database;
    private  DBHelperMahasiswa dbHelperMahasiswa;

    private String[] allColums = { DBHelperMahasiswa.COLUMN_ID,
                                   DBHelperMahasiswa.COLUMN_NPM,
                                   DBHelperMahasiswa.COLUMN_NAMA,
                                   DBHelperMahasiswa.COLUMN_KELAS};

    public DBDataSourceMhs(Context context){
        dbHelperMahasiswa = new DBHelperMahasiswa(context);
    }

    public void open() throws SQLException {
        database = dbHelperMahasiswa.getWritableDatabase();
    }

    public void close(){
        dbHelperMahasiswa.close();
    }

    public Mahasiswa createMahasiswa(String npm, String nama, String kelas){

        ContentValues values = new ContentValues();
        values.put(DBHelperMahasiswa.COLUMN_NPM, npm);
        values.put(DBHelperMahasiswa.COLUMN_NAMA, nama);
        values.put(DBHelperMahasiswa.COLUMN_KELAS, kelas);

        long insertId = database.insert(DBHelperMahasiswa.TABLE_NAME, null, values);

        Cursor cursor = database.query(DBHelperMahasiswa.TABLE_NAME,allColums, DBHelperMahasiswa.COLUMN_ID + " = "
                + insertId,null, null, null, null);

        cursor.moveToFirst();

        Mahasiswa newMahasiswa = cursorToMahasiswa(cursor);

        cursor.close();

        return newMahasiswa;

    }

    private Mahasiswa cursorToMahasiswa(Cursor cursor){

        Mahasiswa mahasiswa = new Mahasiswa();

        Log.v("info", "The getLONG "+cursor.getLong(0));
        Log.v("info", "The "+cursor.getString(1)+","+cursor.getString(2));

        mahasiswa.setId(cursor.getLong(0));
        mahasiswa.setMahasiswa_npm(cursor.getString(1));
        mahasiswa.setMahasiswa_nama(cursor.getString(1));
        mahasiswa.setMahasiswa_kelas(cursor.getString(1));

        return mahasiswa;
    }
}
