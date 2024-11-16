package w3resource;

import java.util.Scanner;


public class No7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] weekday = {"January", "February", "Match", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] monthday = {"31", "29", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
        while (true) {
            try {
                System.out.print("Input a month number ");
                int month = sc.nextInt();
                System.out.print("Input a year ");
                int year = sc.nextInt();
                switch (month) {
                    case 1:
                        System.out.println(weekday[0] + year + " has" + monthday[0] + " days");
                        break;
                    case 2:
                        System.out.println(weekday[1] + year + " has" + monthday[1] + " days");
                        break;
                    case 3:
                        System.out.println(weekday[2] + year + " has" + monthday[2] + " days");
                        break;
                    case 4:
                        System.out.println(weekday[3] + year + " has" + monthday[3] + " days");
                        break;
                    case 5:
                        System.out.println(weekday[4] + year + " has" + monthday[4] + " days");
                        break;
                    case 6:
                        System.out.println(weekday[5] + year + " has" + monthday[5] + " days");
                        break;
                    case 7:
                        System.out.println(weekday[6] + year + " has" + monthday[6] + " days");
                        break;
                    case 8:
                        System.out.println(weekday[7] + year + " has" + monthday[7] + " days");
                        break;
                    case 9:
                        System.out.println(weekday[8] + year + " has" + monthday[8] + " days");
                        break;
                    case 10:
                        System.out.println(weekday[9] + year + " has" + monthday[9] + " days");
                        break;
                    case 11:
                        System.out.println(weekday[10] + year + " has" + monthday[10] + " days");
                        break;
                    case 12:
                        System.out.println(weekday[11] + year + " has" + monthday[11] + " days");
                        break;
                    default:
                        System.out.println("Again");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Again");
                sc.nextLine();
            }
        }
    }
}
