package emailapp;
//main class
public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("John", "Doe");

        System.out.println(email1.showInfo());
    }
}
