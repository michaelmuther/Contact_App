package contacts;

import contacts.service.ContactService;

public class Main {

    public static void main(String[] args) {
        ContactService contactService = new ContactService();
        contactService.addEntry();
        contactService.getStatus();
    }
}
