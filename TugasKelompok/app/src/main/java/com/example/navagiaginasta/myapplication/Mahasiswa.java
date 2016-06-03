package com.example.navagiaginasta.myapplication;

/**
 * Created by Nava Gigs on 5/21/2016.
 */
public class Mahasiswa {
    private long id;
    private String mahasiswa_npm;
    private String mahasiswa_nama;
    private String mahasiswa_kelas;

    public Mahasiswa(){

    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getMahasiswa_npm(){
        return mahasiswa_npm;
    }

    public void setMahasiswa_npm (String mahasiswa_npm){
        this.mahasiswa_npm = mahasiswa_npm;
    }

    public String getMahasiswa_nama(){
        return mahasiswa_nama;
    }

    public void setMahasiswa_nama (String mahasiswa_nama){
        this.mahasiswa_nama = mahasiswa_nama;
    }
    public String getMahasiswa_kelas(){
        return mahasiswa_kelas;
    }

    public void setMahasiswa_kelas(String mahasiswa_kelas){
        this.mahasiswa_kelas= mahasiswa_kelas;
    }

    public  String toString(){
        return "Mahasiswa "+ mahasiswa_npm +" "+ mahasiswa_nama +" "+ mahasiswa_kelas;
    }
}
