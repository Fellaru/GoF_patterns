package ru.fella.learn.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fellaru
 */
public class ProjectManager implements Mediator {
    List<Developer> developers;
    List<Analyst> analysts;
    List<Client> clients;

    public ProjectManager() {
        this.developers = new ArrayList<>();
        this.analysts = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void addAnalyst(Analyst analyst) {
        analysts.add(analyst);
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public void notify(User user, String message) {
        if (clients.contains(user)) {
            analysts.forEach(a -> a.getMessage(message));
        } else if (analysts.contains(user)) {
            developers.forEach(a -> a.getMessage(message));
        } else {
            analysts.forEach(a -> a.getMessage(message));
            clients.forEach(a -> a.getMessage(message));
        }
    }
}
