package Homework_nr7;

public abstract class Pensioned extends Person {
    int refireDate;
    int age;

    public Pensioned(String name, String surname,int refireDate,int age) {
        super(name, surname);
        this.age = age;
        this.refireDate = refireDate;
    }

    @Override
    public void printMyName() {
        System.out.println("The refireDate for Pensioned is" + refireDate);

    }
}
