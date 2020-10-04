package ru.fella.learn.patterns.behavioral.visitor;

import java.util.stream.Collectors;

import ru.fella.learn.patterns.behavioral.visitor.media.Film;
import ru.fella.learn.patterns.behavioral.visitor.media.Music;
import ru.fella.learn.patterns.behavioral.visitor.media.Serial;

/**
 * @author fellaru
 */
public class VisitorImpl implements Visitor {
    @Override
    public String getPresentation(Film film) {
        return String.format("I present you a film called: %s. Starring %s \n",
                film.getFilmName(),
                film.getActors().stream().collect(Collectors.joining(","))
                );
    }

    @Override
    public String getPresentation(Music music) {
        return String.format("I present to you the song %s the author is %s\n", music.getTrackName(), music.getAuthor());
    }

    @Override
    public String getPresentation(Serial serial) {
        return String.format("I present you a series %s consisting of %d episodes\n",
                serial.getName(),
                serial.getSeasons());
    }
}
