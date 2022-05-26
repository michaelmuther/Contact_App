public class Contact {

    private String name;
    private String surname;
    private String number;

    public Contact(String name, String surname, String number){
        this.name = name;
        this.surname = surname;
        this.number = number;
        final String RECORD_CREATED = "\nA record created!";
        System.out.println(RECORD_CREATED);
    }
}
