package com.hd.pojo;

/**
 * Created by frankdou on 2017/3/24.
 * 本类是描述产品的信息
 */
public class Product {
    //产品的ID
    private  int id;
    //产品名称
    private  String proName;

    private  double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }
}

