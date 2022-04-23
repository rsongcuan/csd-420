/*
Ryan Songcuan
4/24/22
Module 8 Assignment

1. Create a class titled <your first name here> ThreeThreads.
     -In this class, you are to use three threads to output three types of characters to a text area for display.
          -In the first thread, you are to output random letter characters such as a, b, c, d …
          -In the second thread, you are to output random number digits such as 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
          -In the third thread, you are to output random characters such as !, @, #, $, %, &, *
     -Display a minimum of 10,000 of each of the three sets.
2. Write test code that ensures all methods function correctly.
 */

import java.util.*;
import java.lang.*;

public class SongcuanThreeThreads {
    public static void main(String[] args) {
        RandomLetter firstThread = new RandomLetter();
        RandomNumber secondThread = new RandomNumber();
        RandomCharacter thirdThread = new RandomCharacter();
        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}

class RandomLetter extends Thread{
    public void run(){
        Random rd = new Random();
        for (int i = 0; i <= 10000; i++){
            char l = (char)(rd.nextInt(26) + 'a');
            System.out.println("First Thread: " + l);
        }
    }
}

class RandomNumber extends Thread{
    public void run(){
        Random rd = new Random();
        for (int i = 0; i <= 10000; i++) {
            int n = (rd.nextInt(10));
            System.out.println("Second Thread: " + n);
        }
    }
}

class RandomCharacter extends Thread{
    public void run(){
        int[] characters = {33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,58,59,60,61,62,63,64,91,92,93,94,95,96,123,124,125,126};
        Random rd = new Random();
        for (int i = 0; i <= 10000; i++) {
            char c = (char)(characters[rd.nextInt(characters.length)]);
            System.out.println("Third Thread: " + c);
        }
    }
}