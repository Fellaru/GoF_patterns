package ru.fella.learn.patterns.behavioral.mediator;

public interface Mediator {
    void notify(User user, String message);
}
