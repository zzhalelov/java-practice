package hashMapAndHashSet.Task1;

import java.util.List;
import java.util.Scanner;

//задача про телефонный справочник с поддержкой групп контактов. Один контакт может входить в несколько групп. Например, если вы работаете со своим другом, то он будет в группах "Друзья" и "Работа". Должна быть возможность создания групп и контактов, добавления одного контакта в несколько групп
//the task is about a phone directory with support for contact groups. One contact can belong to several groups. For example, if you work with your friend, then he will be in the "Friends" and "Work" groups. It should be possible to create groups and contacts, add one contact to several groups
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить группу контактов");
            System.out.println("2. Добавить контакт в группу");
            System.out.println("3. Найти контакт по группе");
            System.out.println("4. Найти контакт по номеру");
            System.out.println("0. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Введите название группы");
                    String groupName = scanner.nextLine();
                    phoneBook.addGroup(groupName);
                    System.out.println("Группа " + groupName + " добавлена");
                    break;
                case 2:
                    System.out.println("Введите имя контакта");
                    String name = scanner.nextLine();
                    System.out.println("Введите номер телефона");
                    String phoneNumber = scanner.nextLine();

                    Contact contact = new Contact(name, phoneNumber);
                    System.out.println("Введите группу, в которую нужно поместить контакт");
                    groupName = scanner.nextLine();
                    phoneBook.addContactToGroup(contact, groupName);
                    System.out.println("Контакт добавлен в группу " + groupName);
                    break;
                case 3:
                    System.out.println("Введите название группы, чтобы найти контакты");
                    groupName = scanner.nextLine();
                    List<Contact> contacts = phoneBook.findContactsByGroup(groupName);
                    System.out.println("Контакты в группе " + groupName);
                    for (Contact c : contacts) {
                        System.out.println(c);
                    }
                    break;
                case 4:
                    System.out.println("Введи номер, чтобы найти контакт");
                    phoneNumber = scanner.nextLine();
                    contact = phoneBook.findContactByNumber(phoneNumber);
                    if (contact != null) {
                        System.out.println("Контакт найден " + contact);
                    } else {
                        System.out.println("Контакт не найден");
                    }
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова");
            }
            System.out.println();
        }
    }
}