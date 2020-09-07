package ru.fella.learn.patterns.behavioral.mediator;

/**
 * @author fellaru
 */
public class Main {
    public static void main(String[] args) {
        ProjectManager mediator = new ProjectManager();
        Analyst analyst1 = new Analyst(mediator, "Adam");
        Analyst analyst2 = new Analyst(mediator, "Eva");
        Developer developer = new Developer(mediator, "Jesus");
        Client client = new Client(mediator, "God");

        mediator.addAnalyst(analyst1);
        mediator.addAnalyst(analyst2);
        mediator.addDeveloper(developer);
        mediator.addClient(client);

        System.out.println("step 1");
        client.sendMessage("I want the best web application for cat sale");

        System.out.println("step 2");
        analyst1.sendMessage("We have completed the technical task");

        System.out.println("step 3");
        developer.sendMessage("Ok! Done");
    }
}
