package homework_nr6;

public class Main {
    public static void main(String[] args) {
        Invoice c1 = new Invoice("MacBook",
                "16 inch,8 gb ram",
                1,
                1000);
        c1.getAmount();
        System.out.println(c1.getAmount());


    }
}
