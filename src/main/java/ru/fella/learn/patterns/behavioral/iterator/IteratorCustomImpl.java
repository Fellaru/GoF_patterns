package ru.fella.learn.patterns.behavioral.iterator;

import java.util.List;

/**
 * @author fellaru
 */
public class IteratorCustomImpl<E> implements IteratorCustom<E> {
    private List<E> collection;
    int cursor;

    public IteratorCustomImpl(List<E> collection) {
        this.collection = collection;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return collection.size() > cursor;
    }

    @Override
    public E next() {
        E element = collection.get(cursor);
        cursor++;

        return element;
    }
}
