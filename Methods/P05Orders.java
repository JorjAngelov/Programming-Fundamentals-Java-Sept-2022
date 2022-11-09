package Methods;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product) {
            case "coffee":
                getTotalSum(quantity, 1.50);
                break;
            case "water":
                getTotalSum(quantity, 1.00);
                break;
            case "coke":
                getTotalSum(quantity, 1.40);
                break;
            case "snacks":
                getTotalSum(quantity, 2.0);
                break;
        }

    }

    public static void getTotalSum(int quantity, double price){
        double totalSum = quantity * price;
        System.out.printf("%.2f", totalSum);

    }
}
