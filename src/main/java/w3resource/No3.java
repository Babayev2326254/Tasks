package w3resource;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        while (true) {
            try {
                if ((number1 > number2 && number1 > number3) || (number2 > number1 && number2 > number3)) {
                    if (number1 > number2) {
                        System.out.println("Big Number " + number1);
                    } else {
                        System.out.println("Big Number " + number2);
                    }
                } else {
                    System.out.println("BIg Number " + number3);
                }
                break;
            } catch (Exception e) {
                System.out.println("Again");
                sc.nextLine();
            }
            sc.close();
        }
    }
}
