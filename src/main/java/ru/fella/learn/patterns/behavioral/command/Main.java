package ru.fella.learn.patterns.behavioral.command;

/**
 * @author fellaru
 *
 * Суть паттерна - преврашаят действия в объекты.
 *
 * Когда применять:
 * - если надо параметризовать действия
 * - если необходим отложенный вызов.
 * - если нужна операция отмены действия
 */
public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new DeleteCommand(database),
                new InsertCommand(database),
                new SelectCommand(database),
                new UpdateCommand(database)
        );

        developer.insert();
    }
}
