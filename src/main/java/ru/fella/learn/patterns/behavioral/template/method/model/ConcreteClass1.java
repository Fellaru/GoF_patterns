package ru.fella.learn.patterns.behavioral.template.method.model;

/**
 * @author fellaru
 */
public class ConcreteClass1 extends AbstractClass {
    @Override
    protected boolean step2() {
        System.out.println("ConcreteClass2 Step 2");
        return true;
    }

    @Override
    protected void step3() {
        System.out.println("ConcreteClass1 Step 3");
    }
}
