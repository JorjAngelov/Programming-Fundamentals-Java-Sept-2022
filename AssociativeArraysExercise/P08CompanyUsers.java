package AssociativeArraysExercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> companyMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] data = input.split(" -> ");

            if (companyMap.containsKey(data[0])) {
                List<String> employees = companyMap.get(data[0]);
                if (!employees.contains(data[1])) {
                    employees.add(data[1]);
                }
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(data[1]);
                companyMap.put(data[0], employees);
            }

            input = scanner.nextLine();
        }

        companyMap.entrySet().forEach(company -> {
            System.out.println(company.getKey());
            company.getValue().forEach(employee -> System.out.println("-- " + employee));
        });
    }
}
