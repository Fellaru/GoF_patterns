package ru.fella.learn.patterns.structural.decorator;

/**
 * @author fellaru
 */
public class SimpleReminder implements Reminder {

    @Override
    public void remind(String message) {
        System.out.println("Просто напоминаю, что: " + message );
    }
}
