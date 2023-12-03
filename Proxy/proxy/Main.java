package proxy;

public class Main {

    public static void main(String[] args) {
        ContactList list = new ContactList();
        list.addContact(new Contact("Eduildo", "limaeduildo@email.com", "123456789"));
        list.addContact(new Contact("Mantorras", " mant@slb.pt", "123456"));
        list.addContact(new Contact("Cardozo", "cardozo@slb.pt", " 123456"));
        list.addContact(new Contact("Jonas", "jonas@slb.pt", " 123456"));
        ContactListIntrface contacts = new ContactListProxy(list);
        System.out.println(contacts.getContact("Eduildo"));
        System.out.println(contacts.getContact("Mantorras"));
        System.out.println(contacts.getContact("Cardozo"));
        System.out.println(contacts.getContact("jonas"));
    }
}
