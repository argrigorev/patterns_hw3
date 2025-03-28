package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class KeywordFilter implements ProductFilter {
    private String keyword;

    public KeywordFilter(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }
}
