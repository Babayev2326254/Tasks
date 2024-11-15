package numbergame;

import java.util.Random;
import java.util.Scanner;

public class numbergametaks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int[] numbers = new int[100];
        int count = 0;

        System.out.println("Let the game begin!");
        while (true) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                numbers[count] = number;
                count++;
                if (number < randomNumber) {
                    System.out.println(number + " is too low!");
                } else if (number > randomNumber) {
                    System.out.println(number + " is too high!");
                } else {
                    System.out.println(number + " is a number!");
                    break;
                }
            } else {
                System.out.println("Please enter a number");
                sc.next();
            }
        }
        sc.close();
        System.out.print("Secilen reqemler:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + (i < count - 1 ? ", " : ""));
        }


    }
}
