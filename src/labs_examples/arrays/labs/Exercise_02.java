package labs_examples.arrays.labs;

import java.io.IOException;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {
        public static void main (String[]args) throws IOException {

            int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            System.out.println("Enter a number followed by ENTER");
            Scanner prompt = new Scanner(System.in);
            int num = prompt.nextInt();
            System.out.println(array[num]);
            // get a char//            System.in
            }
            // write code here


        }

