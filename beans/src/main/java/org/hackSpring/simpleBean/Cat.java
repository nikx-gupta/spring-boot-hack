package org.hackSpring.simpleBean;

public class Cat implements Animal {
    public void meow() {
        System.out.println("meow");
    }

    public void shout() {
        meow();
    }
}
