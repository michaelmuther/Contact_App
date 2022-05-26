import java.util.Scanner;

public class App {

    public App() {
        final String NAME = "Enter the name of the person:";
        final String SURNAME = "Enter the surname of the person:";
        final String NUMBER = "Enter the number:";
        final String END = "A Phone Book with a single record created!";

        Scanner s = new Scanner(System.in);
        System.out.println(NAME);
        String name = s.nextLine();
        System.out.println(SURNAME);
        String surname = s.nextLine();
        System.out.println(NUMBER);
        String number = s.nextLine();
        Contact c = new Contact(name, surname, number);
        System.out.println(END);
    }
}
