package ru.fella.learn.patterns.behavioral.snapshot;

import java.util.LinkedList;

/**
 * @author fellaru
 */
public class Caretaker {
    private final TextEditor textEditor;
    private final LinkedList<TextEditor.Snapshot> history;

    public Caretaker(TextEditor textEditor) {
        this.textEditor = textEditor;
        this.history = new LinkedList<>();
    }

    public void undo(){
        textEditor.restore(history.pop());
    }

    public void changeText(String text){
        history.push(textEditor.makeSnapshot());
        textEditor.setText(text);
    }

}
