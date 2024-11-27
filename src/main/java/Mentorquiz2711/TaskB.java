package Mentorquiz2711;

import java.util.Arrays;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            int a = sc.nextInt();
            array[i] = a;
        }

        int c =0;
        for (int j=1;j<array.length-1;j++){
            if (array[j]>array[j+1] && array[j]>array[j-1]) {
                c++;
            }
        }
        System.out.println(c);

    }
}
