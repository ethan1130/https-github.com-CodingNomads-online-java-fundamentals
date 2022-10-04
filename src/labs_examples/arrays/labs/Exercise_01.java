package labs_examples.arrays.labs;

import java.util.Arrays;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int x = 1; x < number.length; x++) {

            sum = sum + number[x];

            System.out.println("Total Sum is " + sum);
        }


    }
}