package ru.fella.learn.patterns.creational.factorymethod.creator;

import ru.fella.learn.patterns.creational.factorymethod.course.Course;
import ru.fella.learn.patterns.creational.factorymethod.course.GoDeveloperCourse;

/**
 * @author fellaru
 */
public class GoDeveloperCourseCreator implements CourseCreator {
    //Этот метод и является фабричным методом. Он инкапсулирует в себе вызов new и создание конкретного класса.
    public Course createCourse() {
        return new GoDeveloperCourse();
    }
}
