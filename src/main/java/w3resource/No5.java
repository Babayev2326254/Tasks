package w3resource;

import java.util.Scanner;


public class No5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String[] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                int day = sc.nextInt();
                switch (day) {
                    case 1:
                        System.out.println(weekday[0]);
                        break;
                    case 2:
                        System.out.println(weekday[1]);
                        break;
                    case 3:
                        System.out.println(weekday[2]);
                        break;
                    case 4:
                        System.out.println(weekday[3]);
                        break;
                    case 5:
                        System.out.println(weekday[4]);
                        break;
                    case 6:
                        System.out.println(weekday[5]);
                        break;
                    case 7:
                        System.out.println(weekday[6]);
                        break;
                    default:
                        System.out.println("Again");
                        break;
                }
            } catch (Exception e) {
                System.out.println("again");
                sc.nextLine();
            }
        }


    }
}
