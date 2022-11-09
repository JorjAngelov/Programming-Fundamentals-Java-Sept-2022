package MidExam;

import java.util.Scanner;

public class P01TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBiscuitsPerDay = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int numberOfBiscuitsFor30Days = Integer.parseInt(scanner.nextLine());

        double totalBiscuitsPerDay = 0;
        double totalBiscuits = 0;
        double percents = 0;
        for (int days = 1; days <= 30; days++) {
            if (days % 3 == 0) {
                totalBiscuitsPerDay = Math.floor((0.75 * numberOfBiscuitsPerDay) * countOfWorkers);
            } else {
                totalBiscuitsPerDay = numberOfBiscuitsPerDay * countOfWorkers;
            }
            totalBiscuits += totalBiscuitsPerDay;
        }

        System.out.printf("You have produced %.0f biscuits for the past month.%n", totalBiscuits);
        if (totalBiscuits < numberOfBiscuitsFor30Days) {
            percents = (numberOfBiscuitsFor30Days - totalBiscuits) / numberOfBiscuitsFor30Days * 100;
            System.out.printf("You produce %.2f percent less biscuits.", percents);
        } else {
            percents = (totalBiscuits - numberOfBiscuitsFor30Days) / numberOfBiscuitsFor30Days * 100;
            System.out.printf("You produce %.2f percent more biscuits.", percents);
        }

    }
}
