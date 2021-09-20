package io.zipcoder.polymorphism;

public class Pet {
    public String Kind, Speak;
    private String Name;

    public Pet(String Kind, String name){
        this.Name = name;
        this.Kind = Kind;
    }

    public String getName() {

        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    public void speech(String speak){
        this.Speak = speak;

    }

    @Override
    public String toString() {
        return "Pet{" +
                "Kind='" + Kind + '\'' +
                ", Speak='" + Speak + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
