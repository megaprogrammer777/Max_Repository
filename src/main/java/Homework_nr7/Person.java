package Homework_nr7;

public abstract class Person {
    String name;
    String surname;


    public void printMyName() {
        System.out.println("My name is" + name + "" + surname);
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }
}


