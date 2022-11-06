
/**
 * Michael B. Streed
 * Subset String Bonanza
 * Module 4
 * 11-05-2022
 */

import java.util.Scanner;//import Scanner

public class substring {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sub-string Detector!");
        Scanner input = new Scanner(System.in);
        // gotta get my strings from user to compare
        System.out.println("Enter A String");
        String firstString = input.nextLine();
        System.out.println("Enter Another String");
        String secondString = input.nextLine();
        // System.out.println(firstString);// this is for testing comment out before
        // turning in
        // System.out.println(secondString);// this is for testing comment out before
        // turning in
        /**
         * now that I have my strings I need to compare them. The goal here is to see if
         * firstString contains secondString or vice versa. print out the results
         */
        if (firstString.equals(secondString)) {
            System.out.println("They're the same string");
        } else if (firstString.contains(secondString)) {
            System.out.println("Your second string is a sub-string of your first string.");
        } else if (secondString.contains(firstString)) {
            System.out.println("your first string is a sub-string of your second string.");
        } else {
            System.out.println("Neither string is a sub-string of the other.");
        }
    }
}
