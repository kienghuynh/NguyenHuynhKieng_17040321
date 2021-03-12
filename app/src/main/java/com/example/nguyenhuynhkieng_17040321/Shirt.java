package com.example.nguyenhuynhkieng_17040321;

public class Shirt {
    private String name;
    private String price;
    private int imageShirt;

    public Shirt(String name, String price, int imageShirt) {
        this.name = name;
        this.price = price;
        this.imageShirt = imageShirt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageShirt() {
        return imageShirt;
    }

    public void setImageShirt(int imageShirt) {
        this.imageShirt = imageShirt;
    }
}

