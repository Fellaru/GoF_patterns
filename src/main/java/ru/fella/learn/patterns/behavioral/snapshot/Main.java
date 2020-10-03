package ru.fella.learn.patterns.behavioral.snapshot;

/**
 * @author fellaru
 *
 * Снимок — это поведенческий паттерн проектирования,
 *который позволяет сохранять и восстанавливать прошлые состояния объектов, не раскрывая подробностей их реализации.
 *
 * Паттерн Снимок поручает создание копии состояния объекта самому объекту, который этим состоянием владеет.
 * Вместо того, чтобы делать снимок «извне», наш редактор сам сделает копию своих полей, ведь ему доступны все поля, даже приватные.
 */
public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(
                "Hello! \n My name is Ella.\n London is the capital of great Britain.",
                "english.txt",
                0L
        );

        Caretaker caretaker = new Caretaker(textEditor);
        caretaker.changeText("Hello! \n My name is Ella.\n Moscow is the capital of Russia.");
        caretaker.changeText("Hello! \n My name is Denis.\n Moscow is the capital of Russia.");

        System.out.println(textEditor.toString());

        caretaker.undo();
        caretaker.undo();
        System.out.println(textEditor.toString());
    }
}
