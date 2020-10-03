package ru.fella.learn.patterns.behavioral.state;

/**
 * @author fellaru
 */
public interface State {
    boolean publish();

    boolean edit();

    void moderate(boolean isModerate);
}
