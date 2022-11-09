package MethodsExercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= num; number++) {
            if (isSumOfDigitsDivisibleBy8(number) && isContainsOddDigit(number)) {
                System.out.println(number);
            }
        }
        
    }
    
    public static boolean isSumOfDigitsDivisibleBy8(int num) {
        int sumDigits = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sumDigits += lastDigit;
            num /= 10;
        }
        return sumDigits % 8 == 0;
    }

    public static boolean isContainsOddDigit(int num) {
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                num /= 10;
            }
        }
        return false;
    }
}
