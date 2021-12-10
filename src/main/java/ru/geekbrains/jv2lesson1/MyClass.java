package ru.geekbrains.jv2lesson1;

public class MyClass {
    public static void main(String[] args) {
        System.out.println(Week.MONDAY.getH());
        System.out.println(Week.MONDAY.getName());
        System.out.println(Week.MONDAY.getWorked());

        System.out.println(Week.SUNDAY.getH());
        System.out.println(Week.SUNDAY.getName());
        System.out.println(Week.SUNDAY.getWorked());
    }
}
