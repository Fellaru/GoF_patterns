package ru.fella.learn.patterns.creational.prototype;

/**
 * @author fellaru
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Song song = new Song("Кровосток", "Чебурашка");
        System.out.println(song);

        Song pirateSong = (Song) song.clone();
        System.out.println(pirateSong);
    }
}
