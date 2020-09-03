package ru.fella.learn.patterns.structural.bridge.color;

/**
 * @author fellaru
 */
public class Blue implements Color{
    @Override
    public void paint() {
        System.out.println("It is Blue.");
    }
}
