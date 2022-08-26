/*
Ryan Songcuan
3/27/22
Module 2 Assignment

1. Create a program using a recursive method that returns the sum of the following type inputs.
m(i) = 1/2 + 2/3 + 3/4 + 4/5 + 5/6 … i/(i + 1)
‘m’ is to be replaced with the method name you use.

2. Use three different input finishing values, testing your code to ensure it functions correctly.
Examples: m(4), m(9), m(14).
 */

public class M2 {
    public static void main(String[] args) {
        System.out.println(recursiveFractionSum(4));
        System.out.println(recursiveFractionSum(9));
        System.out.println(recursiveFractionSum(14));
    }

    public static double recursiveFractionSum (double i) {
        if (i <= 0) // base case
            return 0;
        else
            return i / (i + 1) + recursiveFractionSum(i-1); // Recursive call
    }
}
