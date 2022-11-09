package AssociativeArraysExercise;

import java.util.*;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();
        String resource = scanner.nextLine();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resourcesQuantity.containsKey(resource)) {
                resourcesQuantity.put(resource, quantity);
            } else {
                int currentQuantity = resourcesQuantity.get(resource);
                resourcesQuantity.put(resource, currentQuantity + quantity);
            }

            resource = scanner.nextLine();
        }

        resourcesQuantity.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));
    }
}
