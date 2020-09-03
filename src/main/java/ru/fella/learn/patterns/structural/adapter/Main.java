package ru.fella.learn.patterns.structural.adapter;

import ru.fella.learn.patterns.structural.adapter.round.RoundHole;
import ru.fella.learn.patterns.structural.adapter.round.RoundPeg;
import ru.fella.learn.patterns.structural.adapter.square.SquarePeg;
import ru.fella.learn.patterns.structural.adapter.square.SquarePegImpl;

/**
 * @author fellaru
 */
public class Main {

    public static void main(String[] args) {
        //Пусть внешняя библиотека возврашает нам объект с интерфейсом SquarePeg. Внешнюю бибилиотеку изменить мы не можем
        SquarePeg squarePeg = new SquarePegImpl(2);

        //Как совместить интерфейс SquarePeg из внешней библиотеки, которую мы изменить не можем с интерфейсом RoundPeg
        // из нашего клиентского кода. Наш код переделывать трудозатратно и не выгодно. ?

        //Ответ использовать паттер Адаптер
        RoundPeg peg = new SquarePegAdapter(squarePeg);
        clientCode(peg);
    }

    //Это наш клиентский код. Его мы менять не хотим
    public static void clientCode(RoundPeg peg){
        RoundHole roundHole = new RoundHole(5);
        assert roundHole.fits(peg) == true;
    }
}
