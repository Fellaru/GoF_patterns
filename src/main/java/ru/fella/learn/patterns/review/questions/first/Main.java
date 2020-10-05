package ru.fella.learn.patterns.review.questions.first;

/**
 * @author fellaru
 * Каким шаблоном проектирования можно достичь эффекта множественного наследования?
 *
 * Мой ответ: Декоратор
 * Пример множественного наследования ниже.
 *
 * ClassC наследует и ClassB и ClassC
 */
public class Main {
    public static void main(String[] args) {
        ClassC c = new ClassC();

        c.methodC();
        c.methodA();
        c.methodB();
    }
}
