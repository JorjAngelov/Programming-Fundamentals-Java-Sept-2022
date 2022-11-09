package MethodsExercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        vowelsCount(text.toLowerCase());

    }

    public static void vowelsCount(String text) {
        int count = 0;
        for (int index = 0; index <= text.length() - 1; index++) {
            char currentSymbol = text.charAt(index);
           if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'i' || currentSymbol == 'o' || currentSymbol == 'u') {
               count++;
           }
        }
        System.out.println(count);
        }
    }
