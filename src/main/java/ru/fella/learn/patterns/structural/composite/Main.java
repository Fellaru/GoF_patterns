package ru.fella.learn.patterns.structural.composite;

import java.util.List;

/**
 * @author fellaru
 * Компоновшик - группирует простые и составные элементы в структуру типа дерева,
 * позволяя к элементам и простым и составным обрашаться единообразно
 */
public class Main {
    public static void main(String[] args) {
        Product simpleProduct = simpleProduct();
        System.out.println(simpleProduct.cost());

        Product compositeProduct = compositeProduct();
        compositeProduct.cost();
    }

    private static Product simpleProduct(){
        return new Muffin();
    }

    private static Product compositeProduct(){
        Product box1 = new Box(List.of(
                new Muffin(),
                new Muffin(),
                new Milk()
        ));

        Product box2 = new Box(List.of(
                box1,
                new Milk(),
                new Muffin()
        ));

        return new Box(List.of(
                box2,
                new Muffin()
        ));
    }
}
