package ru.fella.learn.patterns.behavioral.command;

/**
 * @author fellaru
 */
public class Developer {
    private DeleteCommand deleteCommand;
    private InsertCommand insertCommand;
    private SelectCommand selectCommand;
    private UpdateCommand updateCommand;

    public Developer(DeleteCommand deleteCommand, InsertCommand insertCommand, SelectCommand selectCommand,
                     UpdateCommand updateCommand) {
        this.deleteCommand = deleteCommand;
        this.insertCommand = insertCommand;
        this.selectCommand = selectCommand;
        this.updateCommand = updateCommand;
    }

    public void insert(){
        insertCommand.execute();
    }
}
