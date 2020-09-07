package ru.fella.learn.patterns.behavioral.mediator;

/**
 * @author fellaru
 */
public class Client implements User {
    private Mediator mediator;
    private String name;

    public Client(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Client with name: " + name + " get message: " + message);
    }

    @Override
    public void sendMessage(String message) {
        mediator.notify(this, message);
    }
}
