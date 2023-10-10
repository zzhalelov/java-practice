package hashMapAndHashSet.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<Contact>> groups;

    public PhoneBook() {
        groups = new HashMap<>();
    }

    public void addGroup(String groupName) {
        groups.put(groupName, new ArrayList<>());
    }

    public void addContactToGroup(Contact contact, String groupName) {
        List<Contact> contacts = groups.get(groupName);
        if (contacts != null) {
            contacts.add(contact);
        } else {
            System.out.println("Группа контактов " + groupName + " не найдена");
        }
    }

    public List<Contact> findContactsByGroup(String groupName) {
        return groups.getOrDefault(groupName, new ArrayList<>());
    }

    public Contact findContactByNumber(String number) {
        for (List<Contact> contacts : groups.values()) {
            for (Contact contact : contacts) {
                if (contact.getNumber().equals(number)) {
                    return contact;
                }
            }
        }
        return null;
    }
}