package RegularExpressionsExercise;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern symbol = Pattern.compile("(?<symbol>[^0-9]+)(?<number>[\\d]+)"); //"(?<symbol>[^\\d]+)(?<number>\\d+)"
        Matcher symbolFind = symbol.matcher(input);
        StringBuilder message = new StringBuilder();
        StringBuilder uniqueSymbols = new StringBuilder();
        while (symbolFind.find()) {
            String rageQuit = symbolFind.group("symbol").toUpperCase();
            int number = Integer.parseInt(symbolFind.group("number"));
            if (number == 0) {
                continue;
            }
            for (int i = 0; i < rageQuit.length(); i++) {
                char singleSymbol = rageQuit.charAt(i);

                if (uniqueSymbols.indexOf(String.valueOf(singleSymbol)) == -1) {
                    uniqueSymbols.append(singleSymbol);
                }
            }
            message.append(rageQuit.repeat(number));
        }
        System.out.printf("Unique symbols used: %d%n", uniqueSymbols.length());
        System.out.println(message);

    }
}
