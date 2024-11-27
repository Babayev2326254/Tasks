package tasks;

import java.util.Scanner;
import java.util.Arrays;

public class Degreeofsymmetry {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a;
        int b;
        int c = number;
        a = number % 10;
        b = number;

        int lenght = 0;
        while (c > 0) {
            lenght++;
            c /= 10;
        }
        //System.out.println(lenght);


        int[] array = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            if (b > 0) {
                array[i] = a;
                b = b / 10;
                a = b % 10;
            }
        }
        int symmetry = 0;

        for (int j = 0; j < lenght; j++) {

            if (array[j] == array[lenght-1- j]) {
                symmetry++;
            }
        }
        symmetry=symmetry/2;
        System.out.println(Arrays.toString(array));
        System.out.println(symmetry);


    }
}
