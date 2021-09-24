package org.hackSpring.simpleBean;

public class Dog implements Animal {
    public void bark() {
        System.out.println("Barking");
    }

    public void shout() {
        bark();
    }
}
