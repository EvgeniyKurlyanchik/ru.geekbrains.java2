package ru.geekbrains.jv2lesson2;

import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1","2","8","4"} ,
                {"5","6","7","8"},
                {"9","10","11","12"},
                {"13","14","15","16"}};
        try {
            try {
                int result = method(arr);
                System.out.println("Сумма элементов массива =" + result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j+ "- исправьте");
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }


      }








