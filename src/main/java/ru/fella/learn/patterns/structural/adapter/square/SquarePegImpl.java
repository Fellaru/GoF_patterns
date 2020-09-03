package ru.fella.learn.patterns.structural.adapter.square;

/**
 * @author fellaru
 */
public class SquarePegImpl implements SquarePeg{
    private double width;

    public SquarePegImpl(double width) {
        this.width = width;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
