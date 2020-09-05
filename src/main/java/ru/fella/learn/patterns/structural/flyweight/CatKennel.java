package ru.fella.learn.patterns.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

/**
 * @author fellaru
 */
public class CatKennel extends JFrame {
    private List<Cat> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, int size) {
        CatType type = CatFactory.getCatType(name, color, size);
        Cat tree = new Cat(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Cat tree : trees) {
            tree.draw(graphics);
        }
    }
}
