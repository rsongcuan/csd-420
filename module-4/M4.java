/*
Ryan Songcuan
4/3/22
Module 4 Assignment

1. Write a test program that stores 50,000 integers in LinkedList and test the time to traverse the list using an
iterator vs. using the get(index) method.
2. Then, test your program storing 500,000 integers.
3. After completing this program and having tested both values, in your comments, explain the results and discuss the
time taken using both values and their difference with the get(index) approach.
4. Write test code that ensures the code functions correctly.
 */

import java.util.*;

public class M4 {
    public static void main(String[] args) {
        Random rd = new Random();

        //Store 50,000 integers in LinkedList
        LinkedList<Integer> listFiftyThousand = new LinkedList<Integer>();
        for (int i = 0; i < 50000; i++) {
            listFiftyThousand.add(rd.nextInt());
        }

        //Traverse list with iterator
        long iteratorStart50k = System.currentTimeMillis();
        ListIterator<Integer> listIterator50K = listFiftyThousand.listIterator();
        while (listIterator50K.hasNext()) {
            listIterator50K.next();
        }
        long iteratorStop50k = System.currentTimeMillis();
        System.out.println("Time to traverse list of 50k ints with an iterator = " + (iteratorStop50k - iteratorStart50k)
                + " millis");

        //Traverse list with get(index) method
        long getStart50K = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            listFiftyThousand.get(i);
        }
        long getStop50K = System.currentTimeMillis();
        System.out.println("Time to traverse list of 50k ints with get(index) method = " + (getStop50K - getStart50K) +
                " millis");


        //Store 500,000 integers in LinkedList
        LinkedList<Integer> listFiveHundredThousand = new LinkedList<Integer>();
        for (int i = 0; i < 500000; i++) {
            listFiveHundredThousand.add(rd.nextInt());
        }

        //Traverse list with iterator
        long iteratorStart500k = System.currentTimeMillis();
        ListIterator<Integer> listIterator500K = listFiveHundredThousand.listIterator();
        while (listIterator500K.hasNext()) {
            listIterator500K.next();
        }
        long iteratorStop500k = System.currentTimeMillis();
        System.out.println("Time to traverse list of 500k ints with an iterator = " + (iteratorStop500k -
                iteratorStart500k) + " millis");

        //Traverse list with get(index) method
        long getStart500K = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            listFiveHundredThousand.get(i);
        }
        long getStop500K = System.currentTimeMillis();
        System.out.println("Time to traverse list of 500k ints with get(index) method = " + (getStop500K - getStart500K)
                + " millis");
    }
    /*
    With both LinkedLists, the list with 50K integers and the list with 500K integers, the iterator was the much faster
    option. On my first run of the program, the iterator took 4 millis and 9 millis to traverse the 50k and 500k lists,
    respectively. The get(index) method took 1382 millis and 3160 millis to traverse the 50k and 500k lists,
    respectively. Subsequent tests varied but were very similar to the first run. The iterator option goes more quickly
    since the LinkedList has its own Iterator implementation and sequentially traverses the elements,whereas the
    get(index) method loops through each individual element until it gets to the ith element.
     */
}
