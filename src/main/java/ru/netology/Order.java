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

    public int getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void trackOrder() {
        System.out.println("Заказ #" + orderId + " - " + status);
    }

    public void returnOrder() {
        if (status.equals("Доставлен")) {
            System.out.println("Вы оформили возврат заказа #" + orderId);
            status = "Возвращен";
        } else {
            System.out.println("Нельзя вернуть заказ, который еще не доставлен!");
        }
    }

    public void showOrderDetails() {
        System.out.println("Заказ #" + orderId + " содержит следующие товары:");
        for (Product p : products) {
            System.out.println("- " + p.getInfo());
        }
        System.out.println("Статус заказа: " + status);
    }
}
