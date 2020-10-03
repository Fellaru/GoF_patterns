package ru.fella.learn.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fellaru
 */
public class Publisher {
    private final List<Subscriber> subscribers = new ArrayList<>();
    private final TypeOfProduct typeOfProduct;
    private final String address;

    public Publisher(TypeOfProduct typeOfProduct, String address) {
        this.typeOfProduct = typeOfProduct;
        this.address = address;
    }

    public void addNewProducts(){
        ///Тут какая-то логика
        notifySubscribers();
    }

    private void notifySubscribers(){
        subscribers.stream().forEach(s ->s.notify(address));
    }

    public boolean addSubscriber(Subscriber subscriber){
        return subscribers.add(subscriber);
    }

    public boolean removeSubscriber(Subscriber subscriber){
        return subscribers.remove(subscriber);
    }
}
