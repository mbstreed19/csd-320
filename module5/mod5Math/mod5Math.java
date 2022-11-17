// Michael Streed
// 11-13-2022
// Module 5 math
public class mod5Math {
    public static void main(String[] args) {
        // declaring our starting variables
        double numerator = 1;
        double denominator = 3;
        double results = (numerator / denominator);
        // lets do math going forward, printing the results of each problem.
        System.out.println("Starting math with incrementing denominators");
        while (denominator <= 99) {
            System.out.println(numerator + "/" + denominator + " = " + results);
            denominator++;
            results = (numerator / denominator);// testing
        }
        // hacky way to avoid denominator == 100
        denominator--;
        results = (numerator / denominator);
        // math going down
        System.out.println("Starting math with decrimenting denominators");
        while (denominator >= 3) {
            System.out.println(numerator + "/" + denominator + " = " + results);
            denominator--;
            results = (numerator / denominator);
        }
    }
}
