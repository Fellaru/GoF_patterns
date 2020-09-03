package ru.fella.learn.patterns.structural.adapter;

import ru.fella.learn.patterns.structural.adapter.round.RoundPeg;
import ru.fella.learn.patterns.structural.adapter.square.SquarePeg;

/**
 * @author fellaru
 *
 * Реализация паттерна Адаптер. Наш адаптер реализует интерфейс RoundPeg,
 * а в конструкторе параметром принимает объект интерфейса SquarePeg
 */

public class SquarePegAdapter implements RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
    }
}
