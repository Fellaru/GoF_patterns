package ru.fella.learn.patterns.structural.proxy;

import java.util.List;
import java.util.Map;

/**
 * @author fellaru
 */
public class RealServer implements Server {
    private Map<Integer, List<String>> clientTable = Map.of(
            1, List.of("paper", "milk"),
            2, List.of("cup", "water", "juice"),
            3,  List.of("bread", "eggs")
    );

    @Override
    public List<String> getClientOrders(int clientId) {
        //тут мы ходим в Бд или еще что-то. Вообще здесь должна быть сложная логика, но я ее заменила на:
        return clientTable.get(clientId);
    }
}
