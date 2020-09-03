package ru.fella.learn.patterns.structural.bridge.color;

/**
 * @author fellaru
 */
public class Red implements Color{
    @Override
    public void paint() {
        System.out.println("It is Red.");
    }
}
