package com.product.ygd.task1.model;

public class StorePack {
    private String store_pack_name;
    private int store_pack_value;
    private int store_pack_cost;



    public StorePack() {
    }

    public StorePack(String store_pack_name, int store_pack_value, int store_pack_cost) {
        this.store_pack_name = store_pack_name;
        this.store_pack_value = store_pack_value;
        this.store_pack_cost = store_pack_cost;
    }

    public String getStore_pack_name() {
        return store_pack_name;
    }

    public void setStore_pack_name(String store_pack_name) {
        this.store_pack_name = store_pack_name;
    }

    public int getStore_pack_value() {
        return store_pack_value;
    }

    public void setStore_pack_value(int store_pack_value) {
        this.store_pack_value = store_pack_value;
    }

    public int getStore_pack_cost() {
        return store_pack_cost;
    }

    public void setStore_pack_cost(int store_pack_cost) {
        this.store_pack_cost = store_pack_cost;
    }
}
