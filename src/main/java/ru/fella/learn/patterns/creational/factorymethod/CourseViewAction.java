package ru.fella.learn.patterns.creational.factorymethod;

import ru.fella.learn.patterns.creational.factorymethod.course.Course;

/**
 * @author fellaru
 */
public class CourseViewAction {
    private final Course course;

    public CourseViewAction(Course course) {
        this.course = course;
    }

    void doSomething(){
        course.printTitle();
        // Тут еще много разной логики завязаной на course
    }
}
