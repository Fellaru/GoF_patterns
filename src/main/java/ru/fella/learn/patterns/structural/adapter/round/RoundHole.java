package ru.fella.learn.patterns.structural.adapter.round;

/**
 * @author fellaru
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
