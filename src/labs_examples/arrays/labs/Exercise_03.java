package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int [][] random = new int [5][5];

        outputArray(random);
        int[][] theMinAndMax = findMinMax(random);
//        System.out.print(theMinAndMax[0]);
//        System.out.print(theMinAndMax[1]);
//        System.out.print(theMinAndMax[2]);
//        System.out.print(theMinAndMax[3]);
//        System.out.print(theMinAndMax[4]);


    }


    public static void outputArray(int[][] arrayRandom){
        int num = 0;
        for(int r = 0; r < arrayRandom.length; r++){
            for (int c = 0; c < arrayRandom[r].length; c++){
                arrayRandom[r][c] = num += 3;
                System.out.print(arrayRandom[r][c] + "  ");
            }
            System.out.println();
        }
    }
    public static int[] findMinMax(int[][] outputArray)[] {
        int min = outputArray[0][0];
        int max = outputArray[0][0];

        for (int[] row: outputArray){
            for(int num: row){
                if (num > max){
                    max = num;
                } else if (num < min) {
                    min = num;
                }
            }
        }
        int[] minMax = {min, max};
        return new int[][]{minMax};
        }
    }



