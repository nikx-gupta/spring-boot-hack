package org.hackSpring.simpleBean;

public class MainBean {
    private final Animal animal;

    public MainBean(Animal animal){
        this.animal = animal;
    }

    public void shout(){
        this.animal.shout();
    }
}

