package Task09122025;

import java.util.Scanner;

public class How_manytimes {

    public static long sum(long number) {
        if (number > 0 && number <= 2000000000) {
            long b = 0;
            while (number > 0) {
                b += number % 10;
                number /= 10;
            }
            return b;
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        int c = 0;
        while (number > 0) {
            long result = sum(number);
            number -= result;
            c++;
            System.out.println(result);
        }
        System.out.println(c);
    }
}
