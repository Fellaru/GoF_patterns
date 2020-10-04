package ru.fella.learn.patterns.behavioral.visitor;

import ru.fella.learn.patterns.behavioral.visitor.media.Film;
import ru.fella.learn.patterns.behavioral.visitor.media.Music;
import ru.fella.learn.patterns.behavioral.visitor.media.Serial;

public interface Visitor {
    String getPresentation(Film film);
    String getPresentation(Music music);
    String getPresentation(Serial serial);
}
