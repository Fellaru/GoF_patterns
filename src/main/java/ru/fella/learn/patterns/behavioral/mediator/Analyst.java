package ru.fella.learn.patterns.behavioral.mediator;

/**
 * @author fellaru
 */
public class Analyst implements User {
    private Mediator mediator;
    private String name;

    public Analyst(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Analyst with name: " + name + " get message: " + message);
    }

    @Override
    public void sendMessage(String message) {
        mediator.notify(this, message);
    }
}
