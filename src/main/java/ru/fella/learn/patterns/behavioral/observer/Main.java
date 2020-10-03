package ru.fella.learn.patterns.behavioral.observer;

/**
 * @author fellaru
 *
 * Наблюдатель — это поведенческий паттерн проектирования, который создаёт механизм подписки,
 * позволяющий одним объектам следить и реагировать на события, происходящие в других объектах.
 */
public class Main {
    public static void main(String[] args) {
        Publisher foodStore = new Publisher(TypeOfProduct.FOOD, "Ленинградская,5");
        Publisher zara = new Publisher(TypeOfProduct.CLOTHES, "Солнечная 6/3");
        Publisher cars = new Publisher(TypeOfProduct.CARS, "Кирова 106");

        Buyer ella = new Buyer("Ella");
        Buyer natasha = new Buyer("Natasha");
        Buyer oleg = new Buyer("Oleg");
        Buyer egor = new Buyer("Egor");
        Buyer sergey = new Buyer("Sergey");

        foodStore.addSubscriber(ella);
        foodStore.addSubscriber(egor);
        foodStore.addSubscriber(sergey);

        zara.addSubscriber(oleg);
        zara.addSubscriber(egor);
        zara.addSubscriber(sergey);

        cars.addSubscriber(natasha);
        cars.addSubscriber(ella);

        cars.addNewProducts();
        System.out.println("\n");
        foodStore.addNewProducts();
    }
}
