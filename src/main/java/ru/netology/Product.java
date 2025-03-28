package ru.netology;

abstract class Product {
    protected String name;
    protected double price;
    protected int rating;
    protected String manufacturer;

    public Product(String name, double price, int rating, String manufacturer) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.manufacturer = manufacturer;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getManufacturer() { return manufacturer; }

    public abstract String getInfo();

    @Override
    public String toString() {
        return name + " - " + price + "$, " + manufacturer + ", рейтинг: " + rating;
    }
}
