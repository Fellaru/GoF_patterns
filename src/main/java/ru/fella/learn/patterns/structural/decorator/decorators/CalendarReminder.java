package ru.fella.learn.patterns.structural.decorator.decorators;

import ru.fella.learn.patterns.structural.decorator.Reminder;

/**
 * @author fellaru
 */
public class CalendarReminder implements Reminder {
    private Reminder wripeReminder;

    public CalendarReminder(Reminder wripeReminder) {
        this.wripeReminder = wripeReminder;
    }

    @Override
    public void remind(String message) {
        wripeReminder.remind(message);
        System.out.println("Вплываюшее сообшение! Хэй у тебя: " + message);
    }
}
