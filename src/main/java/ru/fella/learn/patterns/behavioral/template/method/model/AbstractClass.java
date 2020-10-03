package ru.fella.learn.patterns.behavioral.template.method.model;

/**
 * @author fellaru
 */
public abstract class AbstractClass {

    public void templateMethod() {
        step1();
        if (step2()) {
            step3();
        } else {
            step4();
        }

        //и дальше еще какая-то логика
    }

    protected void step1() {
    }

    protected abstract boolean step2();

    protected void step3() {
        System.out.println("AbstractClass Step 3");
    }

    protected void step4() {
        System.out.println("AbstractClass Step 1");
    }
}
