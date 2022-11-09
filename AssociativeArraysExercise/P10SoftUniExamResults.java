package AssociativeArraysExercise;

import java.util.*;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> usernamePoints = new LinkedHashMap<>();
        Map<String, Integer> languageCount = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")) {
            String[] splitArray = input.split("-");
            String username = splitArray[0];

            if (splitArray.length == 3) {
                String language = splitArray[1];
                int points = Integer.parseInt(splitArray[2]);

                if (!usernamePoints.containsKey(username)) {
                    usernamePoints.put(username, points);
                } else {
                    int currentPoints = usernamePoints.get(username);
                    if (points > currentPoints) {
                        usernamePoints.put(username, points);
                    }
                }

                if (!languageCount.containsKey(language)) {
                    languageCount.put(language, 1);
                } else {
                    languageCount.put(language, languageCount.get(language) + 1);
                }
            } else {
                usernamePoints.remove(username);
            }

            input = scanner.nextLine();
        }

        System.out.println("Results:");
        usernamePoints.entrySet().forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

        System.out.println("Submissions:");
        languageCount.entrySet().forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
