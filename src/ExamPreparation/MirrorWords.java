package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([@#]{1})(?<wordOne>[a-zA-Z]{3,})\\1{2}(?<wordTwo>[a-zA-Z]{3,})\\1";

        int pairsCounter = 0;

        List<StringBuilder> pairWords = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            pairsCounter++;
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            String reversedWordTwo = "";
            for (int i = wordTwo.length() - 1; i >= 0; i--) {
                reversedWordTwo += wordTwo.charAt(i);
            }
            if (wordOne.equals(reversedWordTwo)) {
                StringBuilder currentWord = new StringBuilder(wordOne);
                pairWords.add(currentWord);
            }
        }
        if (pairsCounter == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", pairsCounter);
        }
        if (pairWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            for (int i = 0; i < pairWords.size(); i++) {
                StringBuilder wordToReverse = new StringBuilder(pairWords.get(i));
                wordToReverse.reverse();
                System.out.printf("%s <=> %s", pairWords.get(i), wordToReverse);
                if (i < pairWords.size() - 1) {
                    System.out.print(", ");
                }
            }
        }


    }
}
