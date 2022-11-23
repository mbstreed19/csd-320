/**
 * Michael B. Streed Module 7 11-21-2022
 *
 * This program will take a string as input and then analyze it to see if it
 * matches the following criteria must have at least 8 characters must have both
 * letters and digits must contain at least one uppercase and at least one
 * lowercase letter
 *
 */

public class Password {
    public static void main(String[] args) {
        System.out.println(checkString("Butt4tuff"));
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
            if (stringLength && capitalFlag && lowerCaseFlag && numberFlag) {
                return true;
            }
        }
        return false;
    }
}
