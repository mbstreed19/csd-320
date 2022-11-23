
/**
 * Michael B. Streed Module 7 11-21-2022
 *
 * This program will take a string as input and then analyze it to see if it
 * matches the following criteria must have at least 8 characters must have both
 * letters and digits must contain at least one uppercase and at least one
 * lowercase letter
 * */
import java.util.Scanner;// gotta bring in the scanner if we want input

public class Password {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);// inits the scanner to take input
        System.out.println("Enter String for analysis for use as Password");// input prompt
        String userString = userInput.nextLine();// stores input in variable
        boolean password = (checkString(userString));// assigns value from checkString method to var password
        if (password) {
            System.out.println("This password is acceptable.");
        } else {
            System.out.println(
                    "This password is not acceptable. It needs at least one number, lowercase letter, uppercase letter, and needs to be at least 8 digits long");
        }

    }

    // Declare my method that will test the string
    public static boolean checkString(String str) {
        // these are variables that I will need
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean stringLength = false;

        // test length once. do not need to have this in loop
        if (str.length() > 7) {
            stringLength = true;
        }
        // a for loop to iterate over the string
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);// this indexes the current character for evaluation.
            // check for a digit
            if (Character.isDigit(ch)) {
                numberFlag = true;
            }
            // check for an uppercase
            else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
                // check for lowercase
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
            // checks if all conditions are met, if so returns a true value.
            if (stringLength && capitalFlag && lowerCaseFlag && numberFlag) {
                return true;
            }
        }
        // if any one of the conditions are not met then the method returns a false
        // value
        return false;
    }
}
