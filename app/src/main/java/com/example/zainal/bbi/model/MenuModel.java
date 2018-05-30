package com.example.zainal.bbi.model;

public class MenuModel {
    private int imageResource;
    private String title;

    public MenuModel() {
    }

    public MenuModel(int imageResource, String title) {

        this.imageResource = imageResource;
        this.title = title;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
