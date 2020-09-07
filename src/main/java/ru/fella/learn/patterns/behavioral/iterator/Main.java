package ru.fella.learn.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author fellaru
 * Паттерн итератор уже реализован в Java java.util.Iterator
 * <p>
 * Дает возможность последовательно обходить элементы структур данных
 * не привязываясь к реализации структур данных.
 * <p>
 * Применяется если:
 * - нужно иметь несколько вариаций как обходить одну и ту жу структуру данных
 * - нужно скрыть структуру данных от клиента
 * - нужен единный интерфейс обхода разных структур данных
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rachel");
        names.add("Monica");
        names.add("Phoebe");
        names.add("Joey");
        names.add("Ross");
        names.add("Chandler");

        Iterator javaClassicIterator = names.iterator();
        System.out.println(javaClassicIterator.hasNext());
        System.out.println(javaClassicIterator.next());

        IteratorCustom<String> iteratorCustom = new IteratorCustomImpl<>(names);
        System.out.println("Демонстрация работы кастомного итератора");
        enumeration(iteratorCustom);
    }

    private static void enumeration(IteratorCustom iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
