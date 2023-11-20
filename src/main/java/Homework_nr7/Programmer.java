package Homework_nr7;

public class Programmer extends Employee{

    String programmingLanguage;
    int yearsOfExperience;

    public Programmer(String name, String surname, String companyName,String programmingLanguage,int yearsOfExperience) {
        super(name, surname, companyName);
        this.yearsOfExperience = yearsOfExperience;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void Work() {
        System.out.println("Programmer work with language" + programmingLanguage);

    }
}
