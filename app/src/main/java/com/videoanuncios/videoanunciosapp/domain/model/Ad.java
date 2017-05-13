package com.videoanuncios.videoanunciosapp.domain.model;

/**
 * Created by pablomartinez on 12/05/2017.
 */

public class Ad {

    private String urlImage;
    private double price;
    private String title;

    public Ad(String title, double price, String urlImage){
        this.urlImage = urlImage;
        this.title = title;
        this.price = price;
    }

    public Ad(){
        this("", 0.0,"");
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
