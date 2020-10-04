package ru.fella.learn.patterns.behavioral.visitor;

import java.util.List;

import ru.fella.learn.patterns.behavioral.visitor.media.Element;
import ru.fella.learn.patterns.behavioral.visitor.media.Film;
import ru.fella.learn.patterns.behavioral.visitor.media.Music;
import ru.fella.learn.patterns.behavioral.visitor.media.Serial;

/**
 * @author fellaru
 * <p>
 * Посетитель — это поведенческий паттерн проектирования, который позволяет добавлять в программу новые операции,
 * не изменяя классы объектов, над которыми эти операции могут выполняться.
 * <p>
 * https://refactoring.guru/ru/design-patterns/visitor-double-dispatch
 */
public class Main {
    public static void main(String[] args) {
        List<Element> media = List.of(
                new Music("Arms Tonite", "Mother Mother"),
                new Serial("The Witcher", 1),
                new Film("The Shawshank Redemption", List.of("Tim Robbins", "Morgan Freeman")),
                new Serial("Friends", 10),
                new Music("Disintegration", "Monarchy")
        );
        Visitor visitor = new VisitorImpl();
        media.stream().map(m -> m.accept(visitor)).forEach(p -> System.out.println(p));
    }
}
