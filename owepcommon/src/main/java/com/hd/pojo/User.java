package com.hd.pojo;

import java.io.Serializable;

/**
 * Created by frankdou on 2017/3/24.
 */
public class User implements Serializable {

    private  int id;

    private String name;

    private  String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
