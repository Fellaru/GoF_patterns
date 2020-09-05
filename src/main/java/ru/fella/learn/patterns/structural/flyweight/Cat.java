package ru.fella.learn.patterns.structural.flyweight;

import java.awt.Graphics;

/**
 * @author fellaru
 */
public class Cat {
    private int x;
    private int y;
    private CatType catType;

    public Cat(int x, int y, CatType catType) {
        this.x = x;
        this.y = y;
        this.catType = catType;
    }

    public void draw(Graphics g){
        catType.draw(g, x, y);
    }
}
