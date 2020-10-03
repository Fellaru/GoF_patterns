package ru.fella.learn.patterns.behavioral.state;

/**
 * @author fellaru
 */
public class Moderation implements State {
    Document document;

    public Moderation(Document document) {
        this.document = document;
    }

    @Override
    public boolean publish() {
        System.out.println("Document in moderation can't be published!");
        return false;
    }

    @Override
    public boolean edit() {
        System.out.println("Document in moderation is edit!");
        document.setState(new Draft(document));
        return true;
    }

    @Override
    public void moderate(boolean isModerate) {
        System.out.println("Document in moderation is moderate!");
        if(isModerate){
            document.setState(new Published(document));
        } else {
            document.setState(new Draft(document));
        }
    }
}
