package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int numberOfPassengers = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandData = command.split(" ");
            if (commandData[0].contains("Add")) {
                int passengers = Integer.parseInt(commandData[1]);
                wagonsList.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(commandData[0]);
                for (int index = 0; index < wagonsList.size(); index++) {
                    int currentWagon = wagonsList.get(index);
                    if (currentWagon + passengersToAdd <= numberOfPassengers) {
                        wagonsList.set(index, currentWagon + passengersToAdd);
                        break;
                    }
                }
            }
            command = scanner.nextLine();;
        }
        for (int wagon : wagonsList) {
            System.out.print(wagon + " ");
        }
    }
}
