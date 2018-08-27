package com.nf.phone.entity;

public class Phone {
    private int id;
    private String brand;//手机品牌
    private String name;//手机型号
    private float price;//手机价格
    private String sc;//存储容量 64GB

    public Phone(String brand, String name, float price, String sc) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.sc = sc;
    }

    public Phone(int id, String brand, String name, float price, String sc) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.sc = sc;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sc='" + sc + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }
}
