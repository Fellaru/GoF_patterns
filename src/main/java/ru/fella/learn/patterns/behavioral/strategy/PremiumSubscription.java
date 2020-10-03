package ru.fella.learn.patterns.behavioral.strategy;

/**
 * @author fellaru
 */
public class PremiumSubscription implements Strategy {
    @Override
    public void execute(String contentName) {
        System.out.println("In Premium subscription you can watch and listening everything");
        System.out.println("play " + contentName);
    }
}
