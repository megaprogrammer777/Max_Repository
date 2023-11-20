package Homework_nr7;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Anton", "Sokolov", "It nice", 20, "pearch");
        Programmer p2 = new Programmer("Alexandr", "Antonov", "IT very", "JAVA", 5);
        p2.printMyName();
        p2.Work();

        m1.printMyName();
        m1.Work();



        Person[]persons = new Person[]{
                m1,p2
        };
        Company c1 = new Company("Apple",12,persons);

        System.out.println(" -------------------------");
        c1.MakePersonsWork();

    }
}
