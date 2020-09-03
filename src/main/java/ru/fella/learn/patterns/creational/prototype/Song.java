package ru.fella.learn.patterns.creational.prototype;

/**
 * @author fellaru
 */
public class Song implements Cloneable{
    private final String author;
    private final String title;

    public Song(String author, String title) {
        this.author = author;
        this.title = title;
    }

    //Наследование интерфейса Cloneable и реализация метода clone
    // является самым простым способом реализации паттерна прототип в java.
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Song{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
