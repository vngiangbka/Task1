package com.product.ygd.task1.model;

public class ItemPack {
    private String item_pack_name;
    private int item_pack_value;
    private int item_pack_cost;

    public ItemPack() {
    }

    public ItemPack(String item_pack_name, int item_pack_value, int item_pack_cost) {
        this.item_pack_name = item_pack_name;
        this.item_pack_value = item_pack_value;
        this.item_pack_cost = item_pack_cost;
    }

    public String getItem_pack_name() {
        return item_pack_name;
    }

    public void setItem_pack_name(String item_pack_name) {
        this.item_pack_name = item_pack_name;
    }

    public int getItem_pack_value() {
        return item_pack_value;
    }

    public void setItem_pack_value(int item_pack_value) {
        this.item_pack_value = item_pack_value;
    }

    public int getItem_pack_cost() {
        return item_pack_cost;
    }

    public void setItem_pack_cost(int item_pack_cost) {
        this.item_pack_cost = item_pack_cost;
    }
}
