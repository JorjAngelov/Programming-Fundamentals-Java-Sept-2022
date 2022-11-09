package MethodsMoreExercise;

import java.util.Scanner;

public class P02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        nearNumbersToZero(x1, y1, x2, y2);

    }

    public static void nearNumbersToZero(int x1, int y1, int x2, int y2) {
        int firstNumber = 0;
        int secondNumber = 0;
        if (x1 + y1 < x2 + y2) {
            firstNumber = x1;
            secondNumber = y1;
            System.out.printf("(%d, %d)", firstNumber, secondNumber);
        } else if (x1 + y1 > x2 + y2){
            firstNumber = x2;
            secondNumber = y2;
            System.out.printf("(%d, %d)", firstNumber, secondNumber);
        } else {
            System.out.printf("(%d, %d)", x1, y1);
        }
    }
}
