package ru.fella.learn.patterns.behavioral.template.method.model;

/**
 * @author fellaru
 */
public class ConcreteClass2 extends AbstractClass {
    @Override
    protected boolean step2() {
        System.out.println("ConcreteClass2 Step 2");
        return false;
    }

    @Override
    protected void step1() {
        System.out.println("ConcreteClass2 Step 1");
    }

    @Override
    protected void step4() {
        System.out.println("ConcreteClass2 Step 4");
    }
}
