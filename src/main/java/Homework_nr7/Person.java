package Homework_nr7;

public abstract class Person {
    String name;
    String surname;

    public void printName(){
        System.out.println("My name is" + name + ""+ surname);
    }

    public abstract void printMyName();

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
