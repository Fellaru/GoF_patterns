package ru.fella.learn.patterns.structural.proxy;

/**
 * @author fellaru
 *
 * Заместитель имеет тот же интерфейс, что его служебный объект, благодаря чему их можно взаимозаменять.
 * Заместитль позволяет сделать что-то до или после передачи вызова оригиналу. Например: кжширование,
 * логирование, удаленный доступ, ленивую инициализацию, проверку прав доступов
 */
public class Main {
    public static void main(String[] args) {
        Server server = new ProxyServer(new RealServer());

        server.getClientOrders(1);
    }
}
