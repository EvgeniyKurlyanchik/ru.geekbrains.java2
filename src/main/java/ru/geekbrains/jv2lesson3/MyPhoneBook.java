package ru.geekbrains.jv2lesson3;

import java.util.*;

public class MyPhoneBook {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", 7894561);
        phoneBook.add("Sidorov", 1472589);
        phoneBook.add("Petrov", 3692587);
        phoneBook.add("Sidorov", 1234567);
        phoneBook.add("Ivanov", 9876543);


        phoneBook.get("Sidorov");
    }
}

class PhoneBook {

    HashMap<String, HashSet<Integer>> phoneBook1;

    PhoneBook() {
        this.phoneBook1 = new HashMap<>();
    }

    void add(String name, int num1) {
        HashSet<Integer> phoneBook = phoneBook1.getOrDefault(name, new HashSet<>());
        phoneBook.add(num1);
        phoneBook1.put(name, (HashSet<Integer>) phoneBook);
    }

    void get(String name) {

        System.out.println("Контакт \n" + name + ": " + phoneBook1.getOrDefault(name, new HashSet<>()));
    }
}
