package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());

        List<String> guestsAreGoing = new ArrayList<>();

        for (int count = 1; count <= countCommands; count++) {
            String command = scanner.nextLine();

            List<String> commandParts = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String name = commandParts.get(0);

            if (commandParts.size() == 3) {
                if (guestsAreGoing.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestsAreGoing.add(name);
                }

            } else if (commandParts.size() == 4) {
                if (guestsAreGoing.contains(name)) {
                    guestsAreGoing.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }

        for (String name: guestsAreGoing) {
            System.out.println(name);
        }

    }
}
