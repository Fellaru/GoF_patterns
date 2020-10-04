package ru.fella.learn.patterns.behavioral.visitor.media;

import lombok.Value;
import ru.fella.learn.patterns.behavioral.visitor.Visitor;

/**
 * @author fellaru
 */
@Value
public class Serial implements Element{
    String name;
    int seasons;

    @Override
    public String accept(Visitor visitor) {
        return visitor.getPresentation(this);
    }
}
