package ru.fella.learn.patterns.behavioral.template.method;

import ru.fella.learn.patterns.behavioral.template.method.model.AbstractClass;
import ru.fella.learn.patterns.behavioral.template.method.model.ConcreteClass1;
import ru.fella.learn.patterns.behavioral.template.method.model.ConcreteClass2;

/**
 * @author fellaru
 *
 * Шаблонный метод — это поведенческий паттерн проектирования, который определяет скелет алгоритма,
 * перекладывая ответственность за некоторые его шаги на подклассы. Паттерн позволяет подклассам переопределять
 * шаги алгоритма, не меняя его общей структуры.
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass1();
        abstractClass.templateMethod();

        System.out.println("\n");

        AbstractClass abstractClass2 = new ConcreteClass2();
        abstractClass2.templateMethod();
    }
}
