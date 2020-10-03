package ru.fella.learn.patterns.behavioral.strategy;

/**
 * @author fellaru
 * <p>
 * Стратегия — это поведенческий паттерн проектирования, который определяет семейство схожих алгоритмов и помещает
 * каждый из них в собственный класс, после чего алгоритмы можно взаимозаменять прямо во время исполнения программы.
 */
public class Main {
    public static void main(String[] args) {
        Strategy strategy = new BasicSubscription();
        Subscription subscription = new Subscription(strategy);

        subscription.execute("Never Gonna Give You Up");
        subscription.execute("Animal I Have Become");

        Strategy premiumSubscription = new PremiumSubscription();
        subscription.setStrategy(premiumSubscription);
        subscription.execute("Never Gonna Give You Up");
        subscription.execute("Animal I Have Become");
    }
}
