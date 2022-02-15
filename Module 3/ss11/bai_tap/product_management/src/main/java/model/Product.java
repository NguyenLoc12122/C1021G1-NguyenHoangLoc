package model;

public class Product {
    private int id;
    private String nameProduct;
    private double price;
    private int quality;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public Product(int id, String nameProduct, double price, int quality) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quality = quality;
    }
}
