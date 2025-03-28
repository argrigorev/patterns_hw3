package ru.netology;

import java.util.List;

public interface ProductFilter {
    List<Product> filter(List<Product> products);
}
