package proxy;

import java.util.HashMap;
import java.util.Map;

public class ContactList implements ContactListIntrface {
    private Map<String, Contact> contacts = new HashMap<String, Contact>();

    @Override
    public Contact getContact(String chave) {
        if (contacts.containsKey(chave)) {
            return contacts.get(chave);
        } else {
            return null;
        }
    }

    public boolean addContact(Contact contact) {
        if (contacts.containsKey(contact.getName())) {
            return false;

        } else {
            contacts.put(contact.getName(), contact);
            return true;
        }

    }
}
