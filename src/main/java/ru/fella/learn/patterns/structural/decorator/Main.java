package ru.fella.learn.patterns.structural.decorator;

import ru.fella.learn.patterns.structural.decorator.decorators.AlarmClockReminder;
import ru.fella.learn.patterns.structural.decorator.decorators.CalendarReminder;
import ru.fella.learn.patterns.structural.decorator.decorators.NoteOnRefrigeratorReminder;

/**
 * @author fellaru
 */
public class Main {
    public static void main(String[] args) {
        Reminder reminderImportantEvent =
                new CalendarReminder(
                        new AlarmClockReminder(
                                new NoteOnRefrigeratorReminder(
                                        new SimpleReminder())));

        Reminder reminderStandUp = new CalendarReminder(new SimpleReminder());

        reminderImportantEvent.remind("встреча с президентом");
        System.out.println("\n");
        reminderStandUp.remind("ежедневное дейли");
    }
}
