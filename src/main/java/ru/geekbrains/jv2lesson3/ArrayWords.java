package ru.geekbrains.jv2lesson3;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;



public class ArrayWords {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();

        numbers.add("Один");
        numbers.add("Два");
        numbers.add("Три");
        numbers.add("Четыре");
        numbers.add("Пять");
        numbers.add("Четыре");
        numbers.add("Три");
        numbers.add("Два");
        numbers.add("Один");
        numbers.add("Два");
        numbers.add("Три");
        numbers.add("Один");
        numbers.add("Два");
        numbers.add("Один");
        System.out.printf("Вся коллекция  составляет: %n" + numbers);

        Set<String> numbSet = new LinkedHashSet<>(numbers);
        System.out.println("\nУникальные элементы коллекции :\n" + numbSet);

        HashMap<String,Integer> countNumbers = new HashMap<>();
        Integer countNumber = null;
        for (String i: numbers) {
           countNumber = countNumbers.get(i) ;
           countNumbers.put(i,countNumber== null? 1 : countNumber +1);
        }
        System.out.println("\n Количество повторений слов в коллекции\n" + countNumbers);

    }




}
