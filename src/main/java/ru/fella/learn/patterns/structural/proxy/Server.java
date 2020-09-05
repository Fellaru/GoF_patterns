package ru.fella.learn.patterns.structural.proxy;

import java.util.List;

public interface Server {
    List<String> getClientOrders(int clientId);
}
