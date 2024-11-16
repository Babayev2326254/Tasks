package weekplanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class weekplanertask {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] week = new String[7][2];
        week[0][0] = "Monday";
        week[1][0] = "Tuesday";
        week[2][0] = "Wednesday";
        week[3][0] = "Thursday";
        week[4][0] = "Friday";
        week[5][0] = "Saturday";
        week[6][0] = "Sunday";
        week[0][1] = "do home work";
        week[1][1] = "whathcing film";
        week[2][1] = "Drink go beer";
        week[3][1] = "go to course";
        week[4][1] = "go to party";
        week[5][1] = "all day sleep";
        week[6][1] = "work work work";


        while (true) {
            System.out.println("Please, input the day of the week:");
            String day = scanner.nextLine().trim().toLowerCase();
            String question =  "Do you want to "+day+"change schedule (enter 'yes' or 'no')?";


            if (day.equals("exit")) {
                break;
            }
            switch (day) {
                case "sunday":
                    System.out.println("Your tasks for Sunday: " + week[0][1]);
                    System.out.println(question);
                    String yesOrNo = scanner.nextLine();
                    if (yesOrNo.equals("yes")) {
                        week[0][0] = scanner.nextLine().trim().toLowerCase();
                    }

                    break;
                case "monday":
                    System.out.println("Your tasks for Monday: " + week[1][1]);
                    System.out.println(question);
                    break;
                case "tuesday":
                    System.out.println("Your tasks for Sunday: " + week[0][1]);
                    System.out.println(question);
                    break;
                case "wednesday":
                    System.out.println("Your tasks for Sunday: " + week[0][1]);
                    System.out.println(question);
                    break;
                case "thursday":
                    System.out.println("Your tasks for Sunday: " + week[0][1]);
                    System.out.println(question);
                    break;
                case "friday":
                    System.out.println("Your tasks for Sunday: " + week[0][1]);
                    System.out.println(question);
                    break;
                case "saturday":
                    System.out.println("Your tasks for Sunday: " + week[0][1]);
                    System.out.println(question);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
