package FinalExam;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] tokens = command.split("\\s+");
            String action = tokens[0];

            switch (action) {
                case "Change":
                    char charToReplace = tokens[1].charAt(0);
                    String replacement = tokens[2];
                    input = input.replace(charToReplace, replacement.charAt(0));
                    System.out.println(input);
                    break;
                case "Includes":
                    String substring = tokens[1];
                    System.out.println(capitalizeFirstLetter(String.valueOf(input.contains(substring))));
                    break;
                case "End":
                    String endSubstring = tokens[1];
                    System.out.println(capitalizeFirstLetter(String.valueOf(input.endsWith(endSubstring))));
                    break;
                case "Uppercase":
                    input = input.toUpperCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    char charToFind = tokens[1].charAt(0);
                    System.out.println(input.indexOf(charToFind));
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int count = Integer.parseInt(tokens[2]);
                    String cutChars = input.substring(startIndex, startIndex + count);
                    System.out.println(cutChars);
                    break;
            }

            command = scanner.nextLine();
        }
    }

    private static String capitalizeFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}