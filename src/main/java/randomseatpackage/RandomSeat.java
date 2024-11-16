package randomseatpackage;

import java.util.Random;
import java.util.Arrays;


public class RandomSeat {
    public static void main(String[] args) {
        String[] names = {"Rəvan Agayev", "Gülər Əbilova", "Yetər Nəbiyeva", "Mirzəyeva Dilbər", "Ruslan Çərkəzov", "Sənubər Abbasova", "Fəxri Babayev", "Lalə Həmidova", "Günay İskəndərova", "Ramina Səlimova", "Tural Nəzərov", "Rəvan Əliyev", "İbrahim Ələkbərov", "Ella Piriyeva", "Aynur Məmmədova", "Ömər Ələkbərov", "Famil Məmmədov", "Rena Mehdiyeva", "ƏliMurad", "Seyran Xəlilzadə", "Hüseynov Məhəmməd", "Pərvin Bədəlova", "Nicat Məcidov"};
        Random random = new Random();
        int[] numbers = new int[names.length];
        boolean[] trueorafalse = new boolean[24];

        for (int i = 0; i < names.length; i++) {
            int randomInt = random.nextInt(23) + 1;

            while (trueorafalse[randomInt]) {
                randomInt = random.nextInt(23) + 1;
            }

            trueorafalse[randomInt] = true;
            numbers[i] = randomInt;
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " -> Seat Number  " + numbers[i]);
        }

    }
}
