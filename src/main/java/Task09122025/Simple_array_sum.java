package Task09122025;
import java.util.Scanner;


public class Simple_array_sum {

    public static int[] arr(int number) {
        Scanner in = new Scanner(System.in);
        int[] ar = new int[number];
        for (int i = 0; i < number; i++) {
            ar[i] = in.nextInt();
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int size = in.nextInt();
        int[] array = arr(size);
        for (int num : array) {
            sum += num;
        }

        System.out.println(sum);
    }
}
