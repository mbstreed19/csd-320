
/* 
Michael Streed
10-24-2022
Module 2 programming assignment
*/
import java.util.Scanner; // Imports Scanner so that I can get user input

public class Waterheater {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);// This makes a Scanner to "read user input"

    // prompts the user for input to init these values
    System.out.print("What is the mass of the water to be heated?");
    float waterMass = input.nextFloat();

    System.out.print("What is the initial temperature of the water?");
    float initialTemperature = input.nextFloat();

    System.out.print("What is the final temperature you wish to heat the water to?");
    float finalTemperature = input.nextFloat();

    // does the math
    float q = waterMass * (finalTemperature - initialTemperature) * 4184;

    // prints the results
    System.out.println("It will take " + q + " Joules of energy to heat up " + waterMass +
        " kilograms of water to a temperature of " + finalTemperature +
        " degrees that started at an initial temperature of " + initialTemperature + " degrees");

  }

}
