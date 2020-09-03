package ru.fella.learn.patterns.structural.bridge.shape;

import ru.fella.learn.patterns.structural.bridge.color.Color;

/**
 * @author fellaru
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("It is circle.");
        color.paint();
    }
}
