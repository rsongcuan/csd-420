/*
Ryan Songcuan
3/20/22
Module 1 Assignment

1. Write a program that stores:
-An array of five random integers
-A Data objective instance using the current date
-An array of five random double values
2. Append the data in a file titled <yourname> datafile.dat.
3. Write a second program that will read the file and display the data.
4. Test the code to ensure the code functions correctly.
 */

import java.io.*;

public class M1_Part2 { //this file reads the requested data from the .dat file
    public static void main(String[] args)
            throws ClassNotFoundException, IOException {
        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("songcuandatafile.dat"));
                ) {
            int[] newInt = (int[])(input.readObject());
            java.util.Date date = (java.util.Date)(input.readObject());
            double[] newDouble = (double[])(input.readObject());

            System.out.println("Array of Five Random Integers:");
            for (int i = 0; i < newInt.length; i++)
                System.out.print(newInt[i] + " ");
            System.out.println();
            System.out.println();

            System.out.println("Current date:");
            System.out.println(date);
            System.out.println();

            System.out.println("Array of Five Random Doubles:");
            for (int i = 0; i < newDouble.length; i++)
                System.out.print(newDouble[i] + " ");
        }
    }
}
