package ru.fella.learn.patterns.behavioral.state;

/**
 * @author fellaru
 *
 * Состояние — это поведенческий паттерн проектирования,
 * который позволяет объектам менять поведение в зависимости от своего состояния.
 * Извне создаётся впечатление, что изменился класс объекта.
 *
 * Паттерн Состояние предлагает создать отдельные классы для каждого состояния, в котором может пребывать объект,
 * а затем вынести туда поведения, соответствующие этим состояниям.
 *
 * Вместо того, чтобы хранить код всех состояний, первоначальный объект,
 * называемый контекстом, будет содержать ссылку на один из объектов-состояний и делегировать ему работу,
 * зависящую от состояния.
 */
public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        document.publish();
        document.edit();

        document.publish();
        document.moderate(false);
        document.edit();
        document.moderate(true);

        document.publish();
        document.edit();
        document.publish();
    }
}
