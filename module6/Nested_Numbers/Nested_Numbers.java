/**
 * Michael Streed 11-20-2022 Module 6
 *
 */
public class Nested_Numbers {
    public static void main(String[] args) {
        // thanks for the help on the discussion board!!
        // This outer loop runs once per row.
        for (int row = 0; row <= 6; row++) {
            // This loop enters the right amount of spaces before the numbers
            for (int column = 1; column <= 6 - row; column++) {
                System.out.print("    ");
            }
            // This loop performs the math needed to print numbers on left side of pyramid
            for (int column = 0; column <= row; column++) {
                System.out.printf("%4d", (int) Math.pow(2, column));
            }
            // This loop performs the math needed to print the numbers on the right side of
            // pyramid
            for (int column = row - 1; column >= 0; column--) {
                System.out.printf("%4d", (int) Math.pow(2, column));
            }
            // this loop prints the spaces on left side of numbers
            for (int column = 1; column <= 6 - row; column++) {
                System.out.print("    ");
            }
            // ends each iteration of our outer for loop with a @ and a new line
            System.out.print("@");
            System.out.println();
        }
    }
}
