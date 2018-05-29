package com.product.ygd.task1.model;

public class UserInfo {
    private int user_rank;
    private String user_Avatar_url;
    private String user_name;
    private int user_point;

    public UserInfo() {
    }

    public UserInfo(int user_rank, String user_Avatar_url, String user_name, int user_point) {
        this.user_rank = user_rank;
        this.user_Avatar_url = user_Avatar_url;
        this.user_name = user_name;
        this.user_point = user_point;
    }

    public int getUser_rank() {
        return user_rank;
    }

    public void setUser_rank(int user_rank) {
        this.user_rank = user_rank;
    }

    public String getUser_Avatar_url() {
        return user_Avatar_url;
    }

    public void setUser_Avatar_url(String user_Avatar_url) {
        this.user_Avatar_url = user_Avatar_url;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_point() {
        return user_point;
    }

    public void setUser_point(int user_point) {
        this.user_point = user_point;
    }
}
