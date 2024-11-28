package Pumbletask2711;

import java.util.Scanner;

public class Corona2020 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long b = in.nextInt();
        long c = in.nextInt();

        if ((1 < a && 1 < b && 1 < c) || (a <= 100000000 && b <= 100000000 && c <= 100000000)) {
            if (a + b + c == 2020) {
                System.out.println(a + "+" + b + "+" + c);
            } else if (a - b - c == 2020) {
                System.out.println(a + "-" + b + "-" + c);
            } else if (a - b + c == 2020) {
                System.out.println(a + "-" + b + "+" + c);
            } else if (a + b - c == 2020) {
                System.out.println(a + "+" + b + "-" + c);
            } else {
                System.out.println("CORONA");
            }
        }
    }
}
