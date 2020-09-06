package ru.fella.learn.patterns.behavioral.command;

/**
 * @author fellaru
 */
public class Database {
    public void select(){
        System.out.println("Select ...");
    }

    public void insert(){
        System.out.println("Insert ...");
    }

    public void update(){
        System.out.println("Update ...");
    }

    public void delete(){
        System.out.println("Delete ...");
    }
}
