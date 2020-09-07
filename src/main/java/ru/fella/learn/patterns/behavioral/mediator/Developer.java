package ru.fella.learn.patterns.behavioral.mediator;

/**
 * @author fellaru
 */
public class Developer implements User {
    private Mediator projectManager;
    private String name;

    public Developer(Mediator projectManager, String name) {
        this.projectManager = projectManager;
        this.name = name;
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Developer with name: " + name + " get message: " + message);
    }

    @Override
    public void sendMessage(String message) {
        projectManager.notify(this, message);
    }
}
