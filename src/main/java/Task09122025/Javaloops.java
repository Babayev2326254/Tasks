package Task09122025;

import java.util.Scanner;
import java.math.*;

public class Javaloops {

    public static int[] arr(int number) {
        Scanner in = new Scanner(System.in);
        int[] ar = new int[number];
        for (int i = 0; i < number; i++) {
            ar[i] = in.nextInt();
        }
        return ar;
    }

    public static int sum(int num1, int num2, int num3) {
        int sumall = 0;
        for (int i = 0; i <= num3; i++) {
            int sum = num1 + ((1 << i) * num2);
            sumall += sum;
        }
        return sumall;
    }

    public static int[] arrs(int[] ar) {
        int[] ars = new int[ar[2] + 1];
        for (int i = 0; i <= ar[2]; i++) {
            ars[i] = sum(ar[0], ar[1], i);
        }
        return ars;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] inputArray = arr(number);
        int[] resultArray = arrs(inputArray);
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }

}
