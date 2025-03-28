package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String productName) {
        products.removeIf(p -> p.getName().equalsIgnoreCase(productName));
    }

    public List<Product> getProducts() { return products; }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void clearCart() {
        products.clear();
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }
}
