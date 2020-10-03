package ru.fella.learn.patterns.behavioral.state;


/**
 * @author fellaru
 */
public class Document {
    private State state;

    public Document() {
        this.state = new Draft(this);
    }

    public boolean publish() {
        return state.publish();
    }

    public void moderate(boolean isModerate) {
        state.moderate(isModerate);
    }

    public boolean edit() {
        return state.edit();
    }

    public void setState(State state) {
        this.state = state;
    }
}
