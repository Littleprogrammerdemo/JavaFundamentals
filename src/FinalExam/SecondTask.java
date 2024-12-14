package FinalExam;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondTask {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());

            Pattern pattern = Pattern.compile("^!(?<command>[A-Z][a-z]+)!:\\[(?<text>[A-Za-z]{8,})\\]$");

            for (int i = 0; i < n; i++) {
                String input = scanner.nextLine();

                Matcher matcher = pattern.matcher(input);

                if (matcher.find()) {
                    String command = matcher.group("command");
                    String text = matcher.group("text");
                    translateAndPrint(command, text);
                } else {
                    System.out.println("The message is invalid");
                }
            }
        }

        private static void translateAndPrint(String command, String text) {
            System.out.print(command + ":");
            for (int i = 0; i < text.length(); i++) {
                System.out.print(" " + (int) text.charAt(i));
            }
            System.out.println();
        }
    }