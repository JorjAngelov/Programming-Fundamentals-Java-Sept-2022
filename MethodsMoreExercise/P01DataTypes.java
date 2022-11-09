package MethodsMoreExercise;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();
        int intResult = 0;
        double doubleResult = 0;
        String stringInput = "";
        if (dataType.equals("int")) {
            int intInput = Integer.parseInt(scanner.nextLine());
            intResult = intInput * 2;
        } else if (dataType.equals("real")) {
            double doubleInput = Double.parseDouble(scanner.nextLine());
            doubleResult = doubleInput * 1.5;
        } else if (dataType.equals("string")) {
            stringInput = scanner.nextLine();
        }

        findDataType(dataType, intResult, doubleResult, stringInput);

    }

    public static void findDataType(String dataType, int intInput, double doubleInput, String stringInput) {
        switch (dataType) {
            case "int":
                System.out.println(intInput);
                break;
            case "real":
                System.out.printf("%.2f", doubleInput);
                break;
            case "string":
                System.out.println("$" + stringInput + "$");
                break;
        }
    }

}
