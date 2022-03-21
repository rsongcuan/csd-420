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
import java.util.*;

public class M1_Part1 { //this file creates .dat file and writes the requested data to it
    public static void main(String[] args) throws IOException {
        Random rd = new Random();

        //An array of five random integers
        int[] arrInt = new int[5];
        for (int i = 0; i < 5; i++) {
            arrInt[i] = rd.nextInt();
        }

        //A Data objective instance using the current date
        Date currentDate = new Date();

        //An array of five random double values
        double[] arrDouble = new double[5];
        for (int i = 0; i < 5; i++) {
            arrDouble[i] = rd.nextDouble();
        }

        //Append the data in a file titled <yourname> datafile.dat
        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("songcuandatafile.dat"));
                ) {
            output.writeObject(arrInt);
            output.writeObject(currentDate);
            output.writeObject(arrDouble);
        }
    }
}
