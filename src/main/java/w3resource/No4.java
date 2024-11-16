package w3resource;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                double number = sc.nextDouble();
                if (number > 0) {
                    if (number > 1000000) {
                        System.out.println("Positive and Large Number");
                    } else if (number < 1) {
                        System.out.println("Positive and small number");
                    } else {
                        System.out.println("Positive Number");
                    }
                    break;
                } else if (number < 0) {
                    System.out.println("Negative Number");
                    break;
                } else {
                    System.out.println("Zero Number");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Again");
                sc.nextLine();
            }
        }

    }
}
