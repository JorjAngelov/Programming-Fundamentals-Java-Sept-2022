package MethodsExercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sumOfNumbers = sum(number1, number2);
        int subtractOfNumbers = subtract(sumOfNumbers, number3);

        System.out.println(subtractOfNumbers);
    }

    public static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
}
