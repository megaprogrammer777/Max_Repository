package Homework_nr7;

public class Company {
    String companyName;
    int employeeCount;
    Person[] persons;

    public Company(String companyName, int employeeCount, Person[] persons) {
        this.companyName = companyName;
        this.employeeCount = employeeCount;
        this.persons = persons;
    }

    public void MakePersonsWork() {
        for (int index = 0; index != persons.length; index++){
            if(persons[index] instanceof Manager){
                ((Manager) persons[index]).Work();
            }
        }
    }
}