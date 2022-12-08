
// Michael Streed
// 12-08-2022
// Module 10 Assignment
/**
 * This purpose of this assignment is to demonstrate overloading methods the
 * perform the same actions but on different data types
 *
 *
 */
import java.util.Arrays;// I imported this in order to get my Arrays to a pretty string

public class Overload_Methods {
    public static void main(String[] args) {// This is my test method
        // Declare my arrays with different data types and amount of values
        short[] array1 = { 2, 4, 6, 8, 10 };
        int[] array2 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        long[] array3 = { 120, 220, 320, 420, 520, 620, 720, 820, 920, 1020, 1120, 1220 };
        double[] array4 = { 1.9, 2.9, 3.9, 4.9, 5.9, 6.9, 7.9, 8.9, 9.9, 10.9 };
        // This will print the arrays and the averages
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Average: " + average(array1));

        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Average: " + average(array2));

        System.out.println("Array 3: " + Arrays.toString(array3));
        System.out.println("Average: " + average(array3));

        System.out.println("Array 4: " + Arrays.toString(array4));
        System.out.println("Average: " + average(array4));
    }

    public static short average(short[] array) {
        short sum = 0;// declare a variable to hold the sum
        for (short value : array) { // for each loop to add each value to the sum
            sum += value;
        }
        return (short) (sum / array.length);// this will return the average for us to use in the test method
    }

    // the rest of the methods work like the one above. see those comments
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }
}
