package com.example.dd.retrofit1;

import android.util.Log;

/**
 * Created by dd on 03.05.2017.
 */

public class User {
    private String hobby;
    private String name;

    public User(String hobby, String name) {
        this.hobby = hobby;
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
