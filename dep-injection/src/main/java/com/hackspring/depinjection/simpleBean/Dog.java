package com.hackspring.depinjection.simpleBean;

public class Dog implements Animal {
    public void bark() {
        System.out.println("Barking");
    }

    @Override
    public void shout() {
        bark();
    }
}
