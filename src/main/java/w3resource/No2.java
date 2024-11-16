package w3resource;

import java.util.Scanner;

//2. Write a Java program to solve quadratic equations (use if, else if and else).
//
//Test Data
//Input a: 1
//Input b: 5
//Input c: 1
//Expected Output :
//The roots are -0.20871215252208009 and -4.7912878474779195

public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please enter a number:");
                double num1 = sc.nextInt();
                double num2 = sc.nextInt();
                double num3 = sc.nextInt();

                double dis = (num2 * num2) - (4 * num1 * num3);
                double x1 = (-num2 + dis) / (2 * num1);
                double x2 = (-num2 - dis) / (2 * num1);
                double x12 = -num2 / (2 * num1);

                if (dis > 0) {
                    System.out.println("first root " + x1);
                    System.out.println("second root " + x2);
                } else if (dis == 0) {
                    System.out.println("first and second  root " + x12);
                } else {
                    System.out.println("Not root");
                }

            } catch (Exception e) {
                System.out.println("Again");
                sc.nextLine();
            }
        }

    }
}
