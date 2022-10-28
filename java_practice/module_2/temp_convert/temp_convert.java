import java.util.Scanner;
public class temp_convert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the celcius temp?");
        double celsius = input.nextDouble();
        double farenheit = (9.0 / 5.0) * (celsius) + 32;
        System.out.print("your farenheit temp is " + farenheit);
    }
}
