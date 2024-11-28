package Pumbletask2711;

import java.util.Scanner;

public class Matris {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = 1;

        if ((1 <= a && 1 <= b) || (a <= 100 && b <= 100)) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(c + " ");
                    c++;
                }
                System.out.println();
            }
        }

    }
}
