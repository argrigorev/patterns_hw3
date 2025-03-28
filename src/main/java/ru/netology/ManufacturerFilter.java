package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerFilter implements ProductFilter{
    private String manufacturer;

    public ManufacturerFilter(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getManufacturer().equalsIgnoreCase(manufacturer)) {
                result.add(p);
            }
        }
        return result;
    }
}
