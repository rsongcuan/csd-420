/*
Ryan Songcuan
4/17/22
Module 6 Assignment

1. Write a program with the two following generic methods using a bubble sort. The first method sorts the elements
 using the Comparable interface, and the second uses the Comparator interface.
public static <E extends Comparable<E>>
 void bubbleSort(E[] list)
public static <E> void bubbleSort(E[] list,
 Comparator<? super E> comparator)
2. Write test code that ensures your code functions correctly.
 */

import java.util.Comparator;

public class M6 {
    // bubble sort using comparable
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        bubbleSort(list, (e1, e2) -> ((Comparable<E>)e1).compareTo(e2));
    }

    // bubble sort using comparator
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator){
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;  // Array may be sorted and next pass not needed
            for (int i = 0; i < list.length - k; i++) { // Perform next kth pass
                if (comparator.compare(list[i], list[i+1]) > 0) {
                    E temp = list[i];
                    list[i] = list[i + 1]; // Swap list[i] with list[i + 1]
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }

    // Write test code that ensures your code functions correctly
    public static void main(String[] args) {
        // Create an Integer array
        Integer[] integers = {38, 27, 88, 48, 99, 100, 57, 79, 41, 51};
        System.out.println("Unsorted Integers:");
        printObjects(integers);
        System.out.println();

        // Bubble sort and print Integer array
        bubbleSort(integers);
        System.out.println("Sorted Integers:");
        printObjects(integers);
        System.out.println();

        // Create a String array
        String[] largestStates = {"Alaska", "Texas", "California", "Montana", "New Mexico"};
        System.out.println("Five Largest States by Area:");
        printObjects(largestStates);
        System.out.println();

        // Bubble sort and print Integer array
        bubbleSort(largestStates);
        System.out.println("Largest States in Alphabetical Order:");
        printObjects(largestStates);
    }

    public static void printObjects(Object[] list) {
        for (int i = 0; i < (list.length - 1); i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[list.length - 1]);
    }
}
