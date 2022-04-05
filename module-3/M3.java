/*
Ryan Songcuan
4/3/22
Module 3 Assignment

1. Write a test program that contains a static method that returns a new ArrayList.
The new ArrayList returned will contain all original values with no duplicates from the original ArrayList.
Fill the Original ArrayList with 50 random values from 1 to 20.
public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
2. Write test code that ensures the code functions correctly.
 */

import java.util.*;

public class M3 {
    public static void main(String[] args) {
        Random rd = new Random();

        //An ArrayList of 50 random integers from 1 to 20
        ArrayList<Integer> originalList = new ArrayList<>(50);
        System.out.println("Original ArrayList:");
        for (int i = 0; i < 50; i++) {
            originalList.add(rd.nextInt(20) + 1);
            System.out.print(originalList.get(i) + " ");
        }

        System.out.println("\n\nNew ArrayList:");
        ArrayList<Integer> newList;
        newList = removeDuplicates(originalList);
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>(list.size());
        for (E arrayList : list) {
            if (!newList.contains(arrayList)) {
                newList.add(arrayList);
            }
        }
        return newList;
    }
}
