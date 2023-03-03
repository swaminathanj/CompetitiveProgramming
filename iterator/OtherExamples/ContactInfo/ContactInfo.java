import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContactInfo {

    public static void main(String[] args) {

        // Initialisation
    	List<Contact> con = new ArrayList<Contact>();
        Contact john = new Contact("John Doe", "0495812459", 2000);
        Contact jane = new Contact("Jane Doe", "0495812457", 2002);
        Contact bob = new Contact("Bob Bobbings", "0495812453", 1999);
        Contact tom = new Contact("Tom Tommings", "0495812451", 2001);
         con.add(john);
         con.add(jane);
         con.add(bob);
         con.add(tom);
        ContactBook contactBook = new ContactBook(con);

        // Iterator Pattern (just iterate over a data structure without knowing the internal implementation)

        // Iterate by ascending name
        IContactBookIterator nameIterator = contactBook.createAscendingNameIterator();

        while(nameIterator.hasNext()) {
            Contact contact = nameIterator.next();
            printUtil(contact);
        }

        // Iterate by oldest birth year
        IContactBookIterator ageIterator = contactBook.createOldestContactIterator();

        while(ageIterator.hasNext()) {
            Contact contact = ageIterator.next();
            printUtil(contact);
        }
    }

    private static void printUtil(Contact contact) {
        String name = contact.getName();
        String phoneNumber = contact.getPhoneNumber();
        int birthYear = contact.getBirthYear();
        System.out.println(name + ", birth year: "+ birthYear + ", phone: " + phoneNumber);
    }
}
class ContactBook implements IContactBook {

    private List<Contact> contacts;

    public ContactBook(List<Contact> contact) {
        this.contacts = contact;
    }

    @Override
    public IContactBookIterator createAscendingNameIterator() {
        return new AscendingNameIterator(this.contacts);
    }

    @Override
    public IContactBookIterator createOldestContactIterator() {
        return new OldestContactIterator(this.contacts);
    }
}
interface IContactBook {

    IContactBookIterator createAscendingNameIterator();
    IContactBookIterator createOldestContactIterator();
}
class AscendingNameIterator implements IContactBookIterator {

    private List<Contact> sortedContactBook;
    private int currentPosition;

    public AscendingNameIterator(List<Contact> contactList) {
        this.sortedContactBook = this.sortAscendingByName(contactList);
        this.currentPosition = 0;
    }

    private List<Contact> sortAscendingByName(List<Contact> contactList) {
        List<Contact> sortedContactBook = new LinkedList<>(contactList);

        for(int i = 0; i < sortedContactBook.size(); ++i) {
            for(int j = i + 1; j < sortedContactBook.size(); j++) {
                if(sortedContactBook.get(i).getName().compareTo(sortedContactBook.get(j).getName()) > 0) {
                    Contact tempContact = sortedContactBook.get(i);
                    sortedContactBook.set(i, sortedContactBook.get(j));
                    sortedContactBook.set(j, tempContact);
                }
            }
        }

        return sortedContactBook;
    }

    @Override
    public boolean hasNext() {
        return this.currentPosition < this.sortedContactBook.size();
    }

    @Override
    public Contact next() {
        if(this.hasNext())
            return this.sortedContactBook.get(this.currentPosition++);
        return null;
    }

    @Override
    public void reset() {
        this.currentPosition = 0;
    }
}
interface IContactBookIterator {

    boolean hasNext();
    Contact next();
    void reset();
}
class OldestContactIterator implements IContactBookIterator {

    private List<Contact> sortedContactBook;
    private int currentPosition;

    public OldestContactIterator(List<Contact> contactList) {
        this.sortedContactBook = this.sortByOldestAge(contactList);
        this.currentPosition = 0;
    }

    private List<Contact> sortByOldestAge(List<Contact> contactList) {
        List<Contact> sortedContactBook = new LinkedList<>(contactList);

        for(int i = 0; i < sortedContactBook.size(); ++i) {
            for(int j = i + 1; j < sortedContactBook.size(); j++) {
                if(sortedContactBook.get(i).getBirthYear() > sortedContactBook.get(j).getBirthYear()) {
                    Contact tempContact = sortedContactBook.get(i);
                    sortedContactBook.set(i, sortedContactBook.get(j));
                    sortedContactBook.set(j, tempContact);
                }
            }
        }

        return sortedContactBook;
    }

    @Override
    public boolean hasNext() {
        return this.currentPosition < this.sortedContactBook.size();
    }

    @Override
    public Contact next() {
        if(this.hasNext())
            return this.sortedContactBook.get(this.currentPosition++);
        return null;
    }

    @Override
    public void reset() {
        this.currentPosition = 0;
    }
}
class Contact {

    private String name;
    private String phoneNumber;
    private int birthYear;

    public Contact(String name, String phoneNumber, int birthYear) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }
}