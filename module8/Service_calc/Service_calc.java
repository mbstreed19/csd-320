/**
 * Michael Streed 11-26-2022 module8
 *
 * this assignment is to practice overloading methods by using a diffent number
 * of parameters for each method service charge is constant but I will randomize
 * the other charges and deductions, invoke all of the methods, and then
 * randomize again, invoke again. This seems like a better way to call each
 * method twice and meet the assignment criteria.
 *
 */

public class Service_calc {
    public static void main(String[] args) {
        // this block makes a random integer for our variables each iteration and then
        // runs the code
        for (int i = 0; i < 2; i++) {
            int oil_fee = (int) (30 + Math.random() * 50);
            int tire_roto_fee = (int) (20 + Math.random() * 30);
            int coupon = (int) (5 + Math.random() * 20);
            yearlyService();// test with no param
            yearlyService(oil_fee);
            yearlyService(oil_fee, tire_roto_fee);
            yearlyService(oil_fee, tire_roto_fee, coupon);
        }

    }

    public static void yearlyService() {
        // just the service charge
        int service_charge = 40;
        int total_cost = service_charge;
        System.out.println("Added service charge to total $" + service_charge);
        System.out.println("Your total cost is $" + total_cost);
        System.out.println();
    }

    public static void yearlyService(int oil_fee) {
        // service charge plus oil change
        int service_charge = 40;
        int total_cost = service_charge + oil_fee;
        System.out.println("Added service charge to total $" + service_charge);
        System.out.println("Added oil change fee to total $" + oil_fee);
        System.out.println("Your total cost is $" + total_cost);
        System.out.println();
    }

    public static void yearlyService(int oil_fee, int tire_roto_fee) {
        // service charge, oil change, tire rotation
        int service_charge = 40;
        int total_cost = service_charge + oil_fee + tire_roto_fee;
        System.out.println("Added service charge to total $" + service_charge);
        System.out.println("Added oil change fee to total $" + oil_fee);
        System.out.println("Added tire rotation fee total $" + tire_roto_fee);
        System.out.println("Your total cost is $" + total_cost);
        System.out.println();
    }

    public static void yearlyService(int oil_fee, int tire_roto_fee, int coupon) {
        // service charge, oil change, plus tire rotation, minus coupon
        int service_charge = 40;
        int total_cost = ((service_charge + oil_fee + tire_roto_fee) - coupon);
        System.out.println("Added service charge to total $" + service_charge);
        System.out.println("Added oil change fee to total $" + oil_fee);
        System.out.println("Added tire rotation fee total $" + tire_roto_fee);
        System.out.println("Subtracted value of coupon $" + coupon);
        System.out.println("Your total cost is $" + total_cost);
        System.out.println();
    }
}
