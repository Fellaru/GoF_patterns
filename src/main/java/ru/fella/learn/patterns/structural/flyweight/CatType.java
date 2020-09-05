package ru.fella.learn.patterns.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author fellaru
 */
public class CatType {
    private final String name;
    private final Color color;
    private final int size;

    public CatType(String name, Color color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillOval(x , y , size, size);
    }

    public String getName() {
        return name;
    }
}
