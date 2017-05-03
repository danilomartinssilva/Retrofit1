package com.example.dd.retrofit1;

import android.util.Log;

/**
 * Created by dd on 03.05.2017.
 */

public class User {
    private String id;
    private String kategoriia_personala;
    private String kolichestvo_vakansii;
    private String name;

    public User(String id, String kategoriia_personala, String kolichestvo_vakansii, String name) {
        this.id = id;
        this.kategoriia_personala = kategoriia_personala;
        this.kolichestvo_vakansii = kolichestvo_vakansii;
        this.name = name;
    }

    public String getId() {
        Log.d("123", "getId");
        return id;

    }

    public void setId(String id) {
        this.id = id;
        Log.d("123", "setId");
    }

    public String getKategoriia_personala() {
        Log.d("123", "getKategoriia_personala");
        return kategoriia_personala;
    }

    public void setKategoriia_personala(String kategoriia_personala) {
        this.kategoriia_personala = kategoriia_personala;
        Log.d("123", "setKategoriia_personala");
    }

    public String getKolichestvo_vakansii() {
        Log.d("123", "getKolichestvo_vakansii");
        return kolichestvo_vakansii;
    }

    public void setKolichestvo_vakansii(String kolichestvo_vakansii) {
        this.kolichestvo_vakansii = kolichestvo_vakansii;
        Log.d("123", "setKolichestvo_vakansii");
    }

    public String getName() {
        Log.d("123", "getName");
        return name;
    }

    public void setName(String name) {
        Log.d("123", "setName");
        this.name = name;
    }
}
