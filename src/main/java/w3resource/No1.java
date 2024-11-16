package w3resource;

import java.util.Scanner;

//1. Write a Java program to get a number from the user and print whether it is positive or negative.
//
//Test Data
//Input number: 35
//Expected Output :
//Number is positive


public class No1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please enter a number:");
                int number = sc.nextInt();

                if (number > 0) {
                    System.out.println("Positive");
                } else if (number < 0) {
                    System.out.println("Negative");
                } else {
                    System.out.println("Nothing");
                }
                break;
            } catch (Exception e) {
                System.out.println("again");
                sc.nextLine();
            }
        }
        sc.close();


    }
}
