package Homework_nr7;

public class Manager extends Employee {

        int teamSize;
        String teamName;

        public Manager (String name, String surname, String companyName,int teamSize,String teamName) {
            super(name, surname, companyName);
            this.teamName = teamName;
            this.teamSize = teamSize;
        }

        @Override
        public void Work() {
            System.out.println("Manager write"+ teamName + "" + " in message from another company");

        }
}
