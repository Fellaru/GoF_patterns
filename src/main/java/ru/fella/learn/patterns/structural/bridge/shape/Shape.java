package ru.fella.learn.patterns.structural.bridge.shape;

import ru.fella.learn.patterns.structural.bridge.color.Color;

/**
 * @author fellaru
 */
public abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
