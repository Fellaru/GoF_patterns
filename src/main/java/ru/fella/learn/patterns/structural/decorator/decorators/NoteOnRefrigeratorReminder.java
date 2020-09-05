package ru.fella.learn.patterns.structural.decorator.decorators;

import ru.fella.learn.patterns.structural.decorator.Reminder;

/**
 * @author fellaru
 */
//Можно еще сделать декоратор через наследование. Но мне больше нравится через интерфейс
public class NoteOnRefrigeratorReminder extends ReminderDecorator {

    public NoteOnRefrigeratorReminder(Reminder wripeReminder) {
        super(wripeReminder);
    }

    @Override
    public void remind(String message) {
        super.remind(message);
        System.out.println("Смотри на меня! я записка на хлодильнике и напоминаю: " + message);
    }
}
