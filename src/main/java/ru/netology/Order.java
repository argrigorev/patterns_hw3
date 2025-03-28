package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderCounter = 0;
    private int orderId;
    private List<Product> products;
    private String status;

    public Order(List<Product> products) {
        this.orderId = ++orderCounter;
        this.products = new ArrayList<>(products);
        this.status = "В обработке";
    }

    public void showOrderDetails() {
        System.out.println("Заказ #" + orderId + " содержит следующие товары:");
        for (Product p : products) {
            System.out.println("- " + p.getInfo());
        }
        System.out.println("Статус заказа: " + status);
    }
}
