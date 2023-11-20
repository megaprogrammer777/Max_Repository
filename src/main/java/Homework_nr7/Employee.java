package Homework_nr7;

public abstract class Employee extends Person {
    String companyName;

    public Employee(String name, String surname, String companyName) {
        super(name, surname);
        this.companyName = companyName;
    }

    @Override
    public void printMyName() {
        System.out.println("My name is" + name + "" + surname + "");
    }

    public abstract void Work();{

    }


}
