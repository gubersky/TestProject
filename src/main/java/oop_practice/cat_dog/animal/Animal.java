package oop_practice.cat_dog.animal;

public abstract class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    protected Animal() {
    }

    public abstract void sound();

}
