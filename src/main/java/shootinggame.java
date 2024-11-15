import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class shootinggame {
    public static void main(String[] args) {

        char[][] matrix = new char[5][5];
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = '-';
            }
        }

        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        System.out.println("All set. Get ready to rumble!");

        while (true) {
            int row = getInput(input, "Enter row (1-5): ") - 1;
            int col = getInput(input, "Enter column (1-5): ") - 1;

            if (row == targetRow && col == targetCol) {
                matrix[row][col] = 'x';
                System.out.println("Win");
                break;
            } else if (matrix[row][col] == '*') {
                System.out.println("same again!");
            } else {
                matrix[row][col] = '*';
                System.out.println("Again!");
            }

            printBoard(matrix);
        }

        printBoard(matrix);
    }

    private static int getInput(Scanner scanner, String prompt) {
        int input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş! Lütfen 1-5 arasında bir sayı girin.");
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input < 1 || input > 5);
        return input;
    }

    private static void printBoard(char[][] board) {
        System.out.println("Current board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }


    }
}
