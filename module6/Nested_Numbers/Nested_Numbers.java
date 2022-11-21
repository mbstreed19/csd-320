public class Other_Numbers {
    public static void main(String[] args) {
        for (int row = 0; row <= 6; row++) {
            for (int column = 1; column <= 6 - row; column++) {
                System.out.print("  ");
            }
            for (int column = 0; column <= row; column++) {
                System.out.print((int) Math.pow(2, column) + " ");
            }
            for (int column = row - 1; column >= 0; column--) {
                System.out.print((int) Math.pow(2, column) + " ");
            }
            for (int column = 1; column <= 6 - row; column++) {
                System.out.print("  ");
            }
            System.out.print("@");
            System.out.println();
        }
    }
}
