package ru.fella.learn.patterns.structural.decorator.decorators;

import ru.fella.learn.patterns.structural.decorator.Reminder;

/**
 * @author fellaru
 */
public class ReminderDecorator implements Reminder {
    protected Reminder wripeReminder;

    protected ReminderDecorator(Reminder wripeReminder) {
        this.wripeReminder = wripeReminder;
    }

    @Override
    public void remind(String message){
        wripeReminder.remind(message);
    }
}
