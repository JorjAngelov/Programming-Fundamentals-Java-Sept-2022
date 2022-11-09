package Methods;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        int fistNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());
        switch (commandInput) {
            case "add":
                addNumbers(fistNumInput, secondNumInput);
                break;
            case "multiply":
                multiplyNumbers(fistNumInput, secondNumInput);
                break;
            case "subtract":
                subtractNumbers(fistNumInput, secondNumInput);
                break;
            case "divide":
                divideNumbers(fistNumInput, secondNumInput);
                break;
        }
    }

    public static void addNumbers(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }

    public static void multiplyNumbers(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void subtractNumbers(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    public static void divideNumbers(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}