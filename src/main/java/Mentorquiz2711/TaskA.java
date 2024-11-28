package Mentorquiz2711;

import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float salary1 = sc.nextFloat();
        float salary2 = sc.nextFloat();
        if (0 <= salary1 && salary1 < 1000 && 0 <= salary2 && salary2 < 1000) {
            if (salary1 > salary2) {
                System.out.println(salary1);
            } else if (salary1 < salary2) {
                System.out.println(salary2);
            } else {
                System.out.println(salary1);
            }
        }
    }

}
