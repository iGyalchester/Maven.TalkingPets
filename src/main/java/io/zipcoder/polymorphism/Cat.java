package io.zipcoder.polymorphism;

public class Cat extends Pet{
    public Cat(String Kind, String name) {
        super(Kind, name);
        this.Speak = "Meow";
    }
}
