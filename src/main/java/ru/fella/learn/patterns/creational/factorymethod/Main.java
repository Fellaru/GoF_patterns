package ru.fella.learn.patterns.creational.factorymethod;

import ru.fella.learn.patterns.creational.factorymethod.course.Course;
import ru.fella.learn.patterns.creational.factorymethod.creator.CourseCreator;
import ru.fella.learn.patterns.creational.factorymethod.creator.GoDeveloperCourseCreator;
import ru.fella.learn.patterns.creational.factorymethod.creator.JavaDeveloperCourseCreator;

/**
 * @author fellaru
 */
public class Main {
    public static void main(String[] args) {
        programRun(new JavaDeveloperCourseCreator());
        programRun(new GoDeveloperCourseCreator());

    }

    //Эмулятор программы или куска кода
    public static void programRun(CourseCreator creator){
        Course course = creator.createCourse();

        new CourseViewAction(course).doSomething();
    }
}
