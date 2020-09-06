package ru.fella.learn.patterns.behavioral.command;

/**
 * @author fellaru
 */
public class InsertCommand implements Command {
    private Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
