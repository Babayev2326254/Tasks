package Pumbletask2711;

import java.util.Scanner;

public class Valueofvariable {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = 0;

        b = a - ((a * a + 4) / 2) + (a * a * a) - (3 / (a + 7));

        System.out.println(b);
    }
}
