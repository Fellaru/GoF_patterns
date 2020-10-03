package ru.fella.learn.patterns.behavioral.strategy;

/**
 * @author fellaru
 */
public class Subscription {
    private Strategy strategy;

    public Subscription(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(String contentName) {
        strategy.execute(contentName);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
