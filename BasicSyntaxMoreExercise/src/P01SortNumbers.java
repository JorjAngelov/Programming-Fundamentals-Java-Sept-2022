import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        int maxNumber = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);
        int minNumber = Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
        int mediumNumber = (firstNumber + secondNumber + thirdNumber) - maxNumber - minNumber;

        int currentNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= 3; i++) {

            if (currentNumber > maxNumber) {
                minNumber = mediumNumber;
                mediumNumber = maxNumber;
                maxNumber = currentNumber;
                continue;
            }

            if (currentNumber > mediumNumber) {
                minNumber = mediumNumber;
                mediumNumber = currentNumber;
                continue;
            }

            if (currentNumber > minNumber) {
                minNumber = currentNumber;
                continue;
            }
        }

        System.out.printf("%d%n%d%n%d%n", maxNumber, mediumNumber, minNumber);
    }
}