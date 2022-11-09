package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friendsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        int countOfBlacklisted = 0;
        int countOfLostNames = 0;

        while (!inputLine.equals("Report")) {
            String[] commandsLine = inputLine.split(" ");
            String command = commandsLine[0];
            switch (command) {
                case "Blacklist":
                    String currentName = commandsLine[1];
                    int currentIndex = friendsList.indexOf(commandsLine[1]);
                    if (friendsList.contains(currentName)) {
                        System.out.printf("%s was blacklisted.%n", commandsLine[1]);
                        countOfBlacklisted++;
                        friendsList.remove(currentName);
                        friendsList.add(currentIndex, "Blacklisted");
                    } else {
                        System.out.printf("%s was not found.%n", commandsLine[1]);
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(commandsLine[1]);
                    if (index < friendsList.size() && !friendsList.get(index).contains("Blacklisted") && !friendsList.get(index).contains("Lost")) {
                        System.out.printf("%s was lost due to an error.%n", friendsList.get(index));
                        friendsList.remove(index);
                        friendsList.add(index, "Lost");
                        countOfLostNames++;
                    }
                    break;
                case "Change":
                    index = Integer.parseInt(commandsLine[1]);
                    String newName = commandsLine[2];
                    if (index < friendsList.size()) {
                        System.out.printf("%s changed his username to %s.%n", friendsList.get(index), newName);
                        friendsList.remove(index);
                        friendsList.add(index, newName);
                    }

                    break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n", countOfBlacklisted);
        System.out.printf("Lost names: %d%n", countOfLostNames);
        for (String name : friendsList) {
            System.out.print(name + " ");
        }

    }
}
