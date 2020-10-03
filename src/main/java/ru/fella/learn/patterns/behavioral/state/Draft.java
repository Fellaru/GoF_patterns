package ru.fella.learn.patterns.behavioral.state;

/**
 * @author fellaru
 */
public class Draft implements State {
    Document document;

    public Draft(Document document) {
        this.document = document;
    }

    @Override
    public boolean publish() {
        System.out.println("No! Draft can't be publish!!");
        return false;
    }

    @Override
    public boolean edit() {
        System.out.println("Draft edit!! And go to moderation");
        document.setState(new Moderation(document));
        return true;
    }

    @Override
    public void moderate(boolean isModerate) {
        System.out.println("No! Draft can't be moderate!!");
    }
}
