package ru.fella.learn.patterns.creational.factorymethod.creator;

import ru.fella.learn.patterns.creational.factorymethod.course.Course;
import ru.fella.learn.patterns.creational.factorymethod.course.JavaDeveloperCourse;

/**
 * @author fellaru
 */
public class JavaDeveloperCourseCreator implements CourseCreator{
    public Course createCourse() {
        return new JavaDeveloperCourse();
    }
}
