package ru.fella.learn.patterns.structural.bridge.shape;

import ru.fella.learn.patterns.structural.bridge.color.Color;

/**
 * @author fellaru
 */
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("It is square.");
        color.paint();
    }
}
