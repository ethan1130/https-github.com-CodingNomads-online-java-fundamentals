package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(){
        int result;
        int a = 9;
        int b = 10;

        result = a * b;

        return result;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static int divide(){
        int result2;
        int a = 5;
        int b = 10;

        result2 = a / b;

        return result2;
    }


    // 3) Create a static void method that will print of joke of your choice to the console

    public static String joke(){
        String joke;
        String result3;
        joke = "Why did the chicken cross the road.... who knows.";
        result3 = joke;

        System.out.println(result3);

        return result3;
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int secsInYear(){
        int totalSec;
        int year;
        int sec;

        year = 2;
        sec = 31356000;
        totalSec = year * sec;


        return totalSec;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in






}
