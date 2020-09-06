package ru.fella.learn.patterns.behavioral.command;

/**
 * @author fellaru
 */
public class DeleteCommand implements Command {
    private Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
