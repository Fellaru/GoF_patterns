package ru.fella.learn.patterns.structural.composite;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author fellaru
 */
public class Box implements Product{

    private List<Product> products;

    public Box(List<Product> products) {
        this.products = products;
    }

    public void add(Product product){
        products.add(product);
    }

    @Override
    public double cost() {
        return products.stream().collect(Collectors.summingDouble(Product::cost));
    }
}
