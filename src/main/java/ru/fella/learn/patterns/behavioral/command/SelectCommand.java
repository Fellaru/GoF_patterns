package ru.fella.learn.patterns.behavioral.command;

/**
 * @author fellaru
 */
public class SelectCommand implements Command {
    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
