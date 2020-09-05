package ru.fella.learn.patterns.structural.flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fellaru
 */
public class CatFactory {
    static Map<String, CatType> treeTypes = new HashMap<>();

    public static CatType getCatType(String name, Color color, int size) {
        CatType result = treeTypes.get(name);
        if (result == null) {
            result = new CatType(name, color, size);
            treeTypes.put(name, result);
        }
        return result;
    }
}
