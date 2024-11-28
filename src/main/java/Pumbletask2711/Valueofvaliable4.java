package Pumbletask2711;

import java.util.Scanner;


public class Valueofvaliable4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = 0;

        double c = Math.sqrt((a * a) + 1);

        b = ((2 * a) - 1) / (a * a) + (c / 2);

        System.out.printf("Rounded: %.3f%n", b);

    }
}
