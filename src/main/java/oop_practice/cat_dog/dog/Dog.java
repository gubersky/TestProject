package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        this.name =name;
    }

    @Override
    public void sound() {
        System.out.println("I'am a Doc. My name is " + name + ". Gav");

    }
}
