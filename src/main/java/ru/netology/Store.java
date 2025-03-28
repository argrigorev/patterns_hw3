package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getFilteredProducts(ProductFilter filter) {
        return filter.filter(products);
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
