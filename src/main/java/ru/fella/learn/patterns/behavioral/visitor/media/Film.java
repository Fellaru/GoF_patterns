package ru.fella.learn.patterns.behavioral.visitor.media;

import java.util.List;

import lombok.Value;
import ru.fella.learn.patterns.behavioral.visitor.Visitor;

/**
 * @author fellaru
 */
@Value
public class Film implements Element{
    String filmName;
    List<String> actors;

    @Override
    public String accept(Visitor visitor) {
        return visitor.getPresentation(this);
    }
}
