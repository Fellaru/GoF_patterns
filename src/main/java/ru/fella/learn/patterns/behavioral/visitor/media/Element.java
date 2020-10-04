package ru.fella.learn.patterns.behavioral.visitor.media;

import ru.fella.learn.patterns.behavioral.visitor.Visitor;

public interface Element {
    String accept(Visitor visitor);
}
