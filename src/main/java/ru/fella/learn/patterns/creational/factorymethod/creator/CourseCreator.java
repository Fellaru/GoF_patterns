package ru.fella.learn.patterns.creational.factorymethod.creator;

import ru.fella.learn.patterns.creational.factorymethod.course.Course;

public interface CourseCreator {
    Course createCourse();
}
