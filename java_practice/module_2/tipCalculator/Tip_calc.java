import java.util.Scanner;
public class Tip_calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate.");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double total = (subtotal) * ((gratuity / 100) + 1);
        System.out.print("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
