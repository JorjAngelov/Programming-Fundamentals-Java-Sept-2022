package BasicSyntaxMoreExercise.src;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String input = "";
        double price = 0;
        double sum = 0;
        double totalSum = budget - sum;
        while (!input.equals("Game time")) {
            input = scanner.nextLine();
            if (price > budget) {
                System.out.println("Too Expensive");
            }
            if (input.equals("OutFall 4")) {
                price = 39.99;
                budget -= price;
                System.out.println("Bought OutFall 4");
            } else if (input.equals("CS: OG")) {
                price = 15.99;
                budget -= price;
                System.out.println("Bought CS: OG");
            } else if (input.equals("Zplinter Zell")) {
                price = 19.99;
                budget -= price;
                System.out.println("Zplinter Zell");
            } else if (input.equals("Honored 2")) {
                price = 59.99;
                budget -= price;
                System.out.println("Bought Honored 2");
            } else if (input.equals("RoverWatch")) {
                price = 29.99;
                budget -= price;
                System.out.println("Bought RoverWatch");
            } else if (input.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                budget -= price;
                System.out.println("Bought RoverWatch Origins Edition");
            } else {
                System.out.println("Not Found");
            }
            if (budget <= 0) {
                System.out.println("Out of money!");
                break;
            }


            if (input.equals("Game Time")) {
                System.out.printf("Total spent: $. ");
                System.out.printf("Remaining: $");
            }
        }
    }
}
