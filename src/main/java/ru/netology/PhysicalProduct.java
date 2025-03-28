package ru.netology;

public class PhysicalProduct extends Product {

    public PhysicalProduct(String name, double price, int rating, String manufacturer) {
        super(name, price, rating, manufacturer);
    }

    @Override
    public String getInfo() {
        return name + " - " + price + "$, производитель: " + manufacturer + " (Рейтинг: " + rating + ") [Физический товар]";
    }
}
