package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog(String Kind, String name) {
        super(Kind, name);
        this.Speak = "Woof Woof";
    }
}
