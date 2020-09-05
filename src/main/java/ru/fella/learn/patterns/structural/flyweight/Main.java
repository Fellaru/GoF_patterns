package ru.fella.learn.patterns.structural.flyweight;

import java.awt.Color;

/**
 * @author fellaru
 *
 * !!!Применимость: Весь смысл использования Легковеса — в экономии памяти. Поэтому, если в приложении нет такой
 * проблемы, то вы вряд ли найдёте там примеры Легковеса.
 *
 * Пример взят из https://refactoring.guru/ru/design-patterns/flyweight/java/example
 *
 * Классы:
 * ru.fella.learn.patterns.structural.flyweight.Cat,
 * ru.fella.learn.patterns.structural.flyweight.CatType,
 * ru.fella.learn.patterns.structural.flyweightCatFactory
 * Демонстрируют выполнение паттерна легковес, остальной код нужен лишь для того что бы
 * показать пользу от паатрена легковес
 *
 * J
 */
public class Main {
    static int CANVAS_SIZE = 500;
    static int CATS_TO_DRAW = 1000000;
    static int CAT_TYPES = 3;

    public static void main(String[] args) {
        CatKennel catKennel = new CatKennel();
        for (int i = 0; i < Math.floor(CATS_TO_DRAW / CAT_TYPES); i++) {
            catKennel.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Persian kitty", Color.GREEN, 30);
            catKennel.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Siamese kitty", Color.RED, 30);
            catKennel.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Blue kitty", Color.BLUE, 30);
        }
        catKennel.setSize(CANVAS_SIZE, CANVAS_SIZE);
        catKennel.setVisible(true);

        System.out.println(CATS_TO_DRAW + " cats drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Cat size (8 bytes) * " + CATS_TO_DRAW);
        System.out.println("+ TreeTypes size (~35 bytes) * " + CAT_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((CATS_TO_DRAW * 8 + CAT_TYPES * 35) / 1024 / 1024) +
                "MB (instead of " + ((CATS_TO_DRAW * 43) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
