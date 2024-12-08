package Task09122025;

import java.util.Scanner;

public class Valueofvariable3 {

    public static double sum(double x, double y) {
        y = ((x * x) + (3 * x) - 4) / ((2 * x) - 3) - ((x + 2) / ((x * x) - (5 * x) + 7));
        return y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double z = sum(in.nextFloat(), 0);
        System.out.println(z);
    }
}
