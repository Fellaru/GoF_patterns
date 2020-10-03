package ru.fella.learn.patterns.behavioral.state;

/**
 * @author fellaru
 */
public class Published implements State {
    Document document;

    public Published(Document document) {
        this.document = document;
    }

    @Override
    public boolean publish() {
        System.out.println("Yey! Our document published!!");
        return true;
    }

    @Override
    public boolean edit() {
        System.out.println("Published document edit!!");
        document.setState(new Draft(document));
        return false;
    }

    @Override
    public void moderate(boolean isModerate) {
        System.out.println("Published document can't be moderate!!");
    }
}
