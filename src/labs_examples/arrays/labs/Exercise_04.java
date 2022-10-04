package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        int random2[][] = {
                {3, 6, 9,},
                {12, 15, 18, 21},
                {24, 27, 30, 33, 36}};



        outputArray(random2);

    }

        public static void outputArray(int[][] arrayRandom){
            for(int r = 0; r < arrayRandom.length; r++){
                for (int c = 0; c < arrayRandom[r].length; c++){
                    System.out.print(arrayRandom[r][c] + " ");

                }

            }
        }
}