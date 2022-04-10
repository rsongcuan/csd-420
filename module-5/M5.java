/*
Ryan Songcuan
4/10/22
Module 5 Assignment

1. Write a test program that reads words from a text file and displays all non-duplicate words in ascending order and
then in descending order.
- The file is to be referenced in the program, not needing to be used as a command line reference.
- The word file is to be titled collection_of_words.txt and included in your submission.
2. Write test code that ensures the code functions correctly.
*/

import java.util.*;
import java.io.*;

public class M5 {
    public static void main(String[] args) throws Exception {
        File file = new File("collection_of_words.txt");
        TreeSet<String> set = new TreeSet<>();
        try (
                Scanner textFile = new Scanner(file);
        ) {
            while (textFile.hasNext()) {
                String[] words = textFile.nextLine().split("[ \n.,]");
                for (String word: words) {
                    if (word.length() > 0)
                        set.add(word.toLowerCase());
                }
            }
        }
        System.out.println(set); // Ascending order, objects of TreeSet are stored in ascending order
        ArrayList<String> fileWords = new ArrayList<>(set);
        Collections.sort(fileWords, Collections.reverseOrder()); // Arrange elements in descending order
        System.out.println(fileWords);
    }
}
