package Mentorquiz2711;

import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < number ; i++) {
            for (int j = 0; j < number-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = 0 ; k < number+1 ; k++) {
            for (int h = number-k; h < number; h++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}