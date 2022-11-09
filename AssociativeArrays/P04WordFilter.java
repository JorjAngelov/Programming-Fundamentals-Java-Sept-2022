package AssociativeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = Arrays.stream(scanner.nextLine().split(" ")).filter(w -> w.length() % 2 == 0).toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }

}
