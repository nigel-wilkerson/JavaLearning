package varArgs;

/**
 * Name: Nigel Wilkerson
 * File: VarArgs.java
 * Version: 1.0
 * Date: 7/13/2026
 * Description: Uses varargs (variable-length arguments) with the ellipsis syntax to create flexible methods
 *              that can accept any number of arguments
 */

public class VarArgs {

    public static void main(String[] args) {

        /* varargs == allow a method to accept a varying # of arguments
         *             makes methods more flexible, no need for overloaded methods
         *             java will pack the arguments into an array
         *             ... (ellipsis)
         */


        // Test calculateAverage with varying inputs
        System.out.println(calculateAverage());              // no args → returns 0
        System.out.println(calculateAverage(50));            // one number
        System.out.println(calculateAverage(50, 75));        // two numbers
        System.out.println(calculateAverage(50, 75, 90));    // three numbers
        System.out.println(calculateAverage(50, 75, 90, 100, 85));

        // Test add with varying inputs
        System.out.println(add());                    // no args → returns 0
        System.out.println(add(5));                   // one number
        System.out.println(add(5, 10));               // two numbers
        System.out.println(add(111, 25, 35, 84));     // four numbers


    }
    static double calculateAverage(double... numbers){
        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    static int add(int... numbers) {
        int sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
