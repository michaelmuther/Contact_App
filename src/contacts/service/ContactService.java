package contacts.service;

import contacts.model.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactService {
   private final List<Contact> contactList;
   private final Scanner scanner;

   public ContactService() {
       contactList = new ArrayList<>();
       scanner = new Scanner(System.in);
   }

   public void addEntry() {
       final String NAME = "Enter the name of the person:";
       final String SURNAME = "Enter the surname of the person:";
       final String NUMBER = "Enter the number:";
       final String RECORD_CREATED = "\nA record created!";

       System.out.println(NAME);
       String name = scanner.nextLine();
       System.out.println(SURNAME);
       String surname = scanner.nextLine();
       System.out.println(NUMBER);
       String number = scanner.nextLine();
       contactList.add(new Contact(name, surname, number));
       System.out.println(RECORD_CREATED);
   }

   public void getStatus() {
       final String END = "A Phone Book with a single record created!";
       System.out.println(END);
   }
}
