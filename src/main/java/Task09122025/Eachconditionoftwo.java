package Task09122025;

import java.util.Scanner;

public class Eachconditionoftwo {

    public static long twodigit(long number) {
        number = Math.abs(number);
        int c = 0;
        while (number > 0) {
            number /= 10;
            c++;
        }
        return c;
    }

    public static void yesorno(long number) {
        if (number % 3 == 0 && number % 2 == 0 && twodigit(number) == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        yesorno(in.nextLong());
    }
}
