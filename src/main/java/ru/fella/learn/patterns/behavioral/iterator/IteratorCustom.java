package ru.fella.learn.patterns.behavioral.iterator;

/**
 * @author fellaru
 */
public interface IteratorCustom<E> {
    boolean hasNext();
    E next();
}
