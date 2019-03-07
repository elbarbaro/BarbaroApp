package com.barbaro.barbaroapp.models;

public class ItemProduct {

    private String name;
    private String store;
    private String phone;

    public ItemProduct() {
    }

    public ItemProduct(String name, String store, String phone) {
        this.name = name;
        this.store = store;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "itemProduct{" +
                "name='" + name + '\'' +
                ", store='" + store + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
