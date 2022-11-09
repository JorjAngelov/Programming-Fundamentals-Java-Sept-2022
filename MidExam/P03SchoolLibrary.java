package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.regex.PatternSyntaxException;

public class P03SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> booksList = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Done")) {
            String[] commandsLine = inputLine.split(" \\| ");
            String command = commandsLine[0];

            switch (command) {
                case "Add Book":
                    if (!booksList.contains(commandsLine[1])) {
                        booksList.add(0, commandsLine[1]);
                    }
                    break;
                case "Take Book":
                    if (booksList.contains(commandsLine[1])) {
                        booksList.remove(commandsLine[1]);
                    }
                    break;
                case "Swap Books":
                    String firstBook = commandsLine[1];
                    String secondBook = commandsLine[2];
                    if (booksList.contains(firstBook) && booksList.contains(secondBook)) {
                        int firstBookIndex = booksList.indexOf(firstBook);
                        int secondBookIndex = booksList.indexOf(secondBook);
                        booksList.set(firstBookIndex, secondBook);
                        booksList.set(secondBookIndex, firstBook);
                    }
                    break;
                case "Insert Book":
                    if (!booksList.contains(commandsLine[1])) {
                        booksList.add(commandsLine[1]);
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(commandsLine[1]);
                    if (index < booksList.size()) {
                        System.out.println(booksList.get(index));
                    }
                    break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.println(String.join(", ", booksList));
    }
}
