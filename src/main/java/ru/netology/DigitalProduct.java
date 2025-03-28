package ru.netology;

public class DigitalProduct extends Product {
    private String downloadLink;

    public DigitalProduct(String name, double price, int rating, String manufacturer, String downloadLink) {
        super(name, price, rating, manufacturer);
        this.downloadLink = downloadLink;
    }

    public String getDownloadLink() {
        return "Ссылка для скачивания: " + downloadLink;
    }

    @Override
    public String getInfo() {
        return name + " - " + price + "$, производитель: " + manufacturer + " (Рейтинг: " + rating + ") [Цифровой товар]";
    }
}
