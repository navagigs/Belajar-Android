package com.example.navagiaginasta.myapplication;

/**
 * Created by Nava Gigs on 5/21/2016.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DBHelperMahasiswa extends SQLiteOpenHelper {
    public static final String TABLE_NAME = "data_mahasiswa";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NPM = "mahasiswa_npm";
    public static final String COLUMN_NAMA = "mahasiswa_nama";
    public static final String COLUMN_KELAS = "mahasiswa_kelas";
    private static final String db_name = "mahasiswa.db";
    private static final int db_version=1;

        private static final String db_create = "create table"
                + TABLE_NAME + "("
                + COLUMN_ID + " integer primary key autoincrement,"
                + COLUMN_NPM + " varchar(50) not null, "
                + COLUMN_NAMA + " varchar(50) not null, "
                + COLUMN_KELAS + " varchar(50) not null);";

    public DBHelperMahasiswa(Context context) {
        super(context, db_name, null, db_version);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(db_create);
    }

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
            Log.w(DBHelperMahasiswa.class.getName(),"Upgrade database from version " + oldVersion + " to " + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
            onCreate(db);
        }
}
