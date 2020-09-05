package ru.fella.learn.patterns.structural.proxy;

import java.util.List;

/**
 * @author fellaru
 */
public class ProxyServer implements Server {
    private RealServer server;

    public ProxyServer(RealServer server) {
        this.server = server;
    }

    @Override
    public List<String> getClientOrders(int clientId) {
        //Тут мы дополняем логику: кэшируем, логируем, проверяем доступы и т.д
        System.out.println("Запрашивают заказы клиента с id " + clientId);
        return server.getClientOrders(clientId);
    }
}
