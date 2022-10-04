package labs_examples.arrays.labs;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list \, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        int[] nums = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33};
        for (int i = 0; i < nums.length; i++)
            System.out.print(i);
        System.out.print("");



        System.out.print("   - - - ( " + nums[3] + " ) - - - ");
    }
}