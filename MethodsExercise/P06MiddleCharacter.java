package MethodsExercise;

import java.util.Scanner;

public class P06MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleCharacters(text);

    }

    private static void printMiddleCharacters(String text) {
        if (text.length() % 2 == 1) {
            int indexOdMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexOdMiddleCharacter));
        } else {
            int indexFirstMiddleCharacter = text.length() / 2 - 1;
            int indexSecondMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexFirstMiddleCharacter) + "" + text.charAt(indexSecondMiddleCharacter));
        }
    }
}
