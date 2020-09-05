package ru.fella.learn.patterns.structural.decorator.decorators;

import ru.fella.learn.patterns.structural.decorator.Reminder;

/**
 * @author fellaru
 */
public class AlarmClockReminder implements Reminder {
    private Reminder wripeReminder;

    public AlarmClockReminder(Reminder wripeReminder) {
        this.wripeReminder = wripeReminder;
    }

    @Override
    public void remind(String message) {
        wripeReminder.remind(message);
        System.out.println("Дзин Дзин! Напоминаю: " + message);
    }
}
