// Michael B. Streed
// Module 9 assignment
// 11-28-2000
/**
 * The goal of this assignment is to be able to show my understanding of how
 * arrays work by writing a program that reads and fills an array with twenty
 * integers, and then using the array elements calculate and display the
 * following: the highest value entered, the lowest value entered, the average
 * of the numbers entered, the sum of the numbers entered, and the information
 * must be pretty and easy to understand.
 *
 */
public class Array {
    public static void main(String[] args) {
        // gotta make my variables
        int[] myArray = new int[20];
        int high = 0;
        int low = 101;
        int ave = 0;
        int sum = 0;
        // System.out.print(myArray); // this is for testing
        System.out.println("The following random numbers will be added to the array");
        for (int i = 0; i < myArray.length; i++) {// this loop will iterate through our array
            myArray[i] = (int) (1 + Math.random() * 100);// puts random number in array
            System.out.println(myArray[i]);// just prints the value of the variable we are adding
            // System.out.println("there are " + (i + 1) + " numbers in array");
            if (high < myArray[i]) {// finds the highest number
                high = myArray[i];
            }
            if (low > myArray[i]) {// finds the lowest number
                low = myArray[i];
            }
            sum += myArray[i];// This is how I found the sum
        }
        ave = (sum / myArray.length);// This is where I calc the ave

        System.out.println("");
        System.out.println("Now to play with our numbers a little bit...");
        System.out.println("-----------------");
        System.out.println("The highest number is " + high);
        System.out.println("-----------------");
        System.out.println("The lowest number is " + low);
        System.out.println("-----------------");
        System.out.println("The average of the numbers is " + ave);
        System.out.println("-----------------");
        System.out.println("The sum of the numbers in the array is " + sum);

    }
}
