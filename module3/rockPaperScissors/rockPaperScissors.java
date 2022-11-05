
/*
 * Michael B. Streed
 * 11-04-2022
 * Rock Paper Scissors
 */
import java.util.Scanner;// This is to be able to get user input

public class rockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Welcome to The Rock, Paper, Scissors Game!");
        Scanner input = new Scanner(System.in);// starts the scanner in order to see user input
        System.out.print("Enter \"1\" for rock, \"2\" for paper, or \"3\" for scissors.");
        /*
         * now we need to make variables that store a chosen number for the user and a
         * random number for the computer to use.
         */
        int computerPick = (int) (1 + (Math.random() * 3));
        // System.out.println(computerPick);// this is for testing comment out when done
        int userPick = input.nextInt();
        // System.out.println(userPick);// this is for testing comment out when done

        // I will first print out each players choice...
        switch (computerPick) {
        case 1:
            System.out.println("Computer Chose Rock");
            break;
        case 2:
            System.out.println("Computer Chose Paper");
            break;
        case 3:
            System.out.println("Computer Chose Scissors");
            break;
        }

        switch (userPick) {
        case 1:
            System.out.println("User Chose Rock");
            break;
        case 2:
            System.out.println("User Chose Paper");
            break;
        case 3:
            System.out.println("User Chose Scissors");
            break;
        }
        /*
         * Next step is to compare the results to determine the winner. I will use a
         * series of if/else statements for this
         */
        if ((userPick == 1 && computerPick == 3) || (userPick == 2 && computerPick == 1)
                || (userPick == 3 && computerPick == 2)) {
            System.out.println("User Wins! :) ");
        } else if (userPick == computerPick) {
            System.out.println("It is a Tie!");
        } else {
            System.out.println("Computer Wins! :( ");
        }
    }

}
