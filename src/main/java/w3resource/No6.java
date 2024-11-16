package w3resource;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                float number1 = sc.nextInt();
                float number2 = sc.nextInt();

                if (number1 == number2) {
                    System.out.println("Same number");
                } else {
                    System.out.println("Not same number");
                }
            } catch (Exception e) {
                System.out.println("Again");
                sc.nextLine();
                sc.nextLine();
            }
        }
    }
}
