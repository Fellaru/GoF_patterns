package ru.fella.learn.patterns.behavioral.command;

/**
 * @author fellaru
 */
public class UpdateCommand implements Command {
    private Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
