package ru.fella.learn.patterns.structural.bridge;

import java.util.List;

import ru.fella.learn.patterns.structural.bridge.color.Blue;
import ru.fella.learn.patterns.structural.bridge.color.Red;
import ru.fella.learn.patterns.structural.bridge.shape.Circle;
import ru.fella.learn.patterns.structural.bridge.shape.Shape;
import ru.fella.learn.patterns.structural.bridge.shape.Square;

/**
 * @author fellaru
 *
 * Мост — это структурный паттерн проектирования, который разделяет один или несколько классов
 * на две отдельные иерархии — абстракцию и реализацию, позволяя изменять их независимо друг от друга.
 */
public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(new Red()),
                new Square(new Red()),
                new Square(new Blue())
        );

        shapes.stream().forEach(shape ->
        {
            shape.draw();
            System.out.println("\n");
        });
    }
}
