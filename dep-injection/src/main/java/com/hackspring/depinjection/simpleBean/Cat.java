package com.hackspring.depinjection.simpleBean;

public class Cat implements Animal {
    public void meow() {
        System.out.println("meow");
    }

    @Override
    public void shout() {
        meow();
    }
}
