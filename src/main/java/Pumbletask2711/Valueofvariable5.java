package Pumbletask2711;

import java.util.Scanner;

public class Valueofvariable5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = 0;
        double c = Math.sqrt((a * a) + 1);

        b = ((2 * a) / c) - (c / (a * a * a));

        System.out.println(b);

    }
}
