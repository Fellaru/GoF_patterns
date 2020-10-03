package ru.fella.learn.patterns.behavioral.observer;

/**
 * @author fellaru
 */
public class Buyer implements Subscriber {
    private final String name;

    public Buyer(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("Yuey!!!! My name is " + name + ". I'm run to shop: " + message);
    }
}
