package com.example.android52_day6;

public class ProductModel {
    private int id;


    private String productName;
    private String productImage;
    private String productPrice;
    private String rate;
    private boolean isWish;

    public ProductModel() {
    }

    public ProductModel(int id, String productName, String productImage, String productPrice, String rate, boolean isWish) {
        this.id = id;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.rate = rate;
        this.isWish = isWish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public boolean isWish() {
        return isWish;
    }

    public void setWish(boolean wish) {
        isWish = wish;
    }


    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productImage='" + productImage + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", rate='" + rate + '\'' +
                ", isWish=" + isWish +
                '}';
    }
}
