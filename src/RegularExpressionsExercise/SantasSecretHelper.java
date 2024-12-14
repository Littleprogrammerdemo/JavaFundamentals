package RegularExpressionsExercise;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SantasSecretHelper {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int key = Integer.parseInt(scanner.nextLine());

    Pattern childName = Pattern.compile("@(?<name>[A-Z][A-Za-z]+)[^@\\-!:>]*!(?<good>[A-Z]{1})!");
    String input = "";
    StringBuilder decrypt = new StringBuilder();
    List<String> goodChildren = new ArrayList<>();
        while (!"end".equals(input = scanner.nextLine())) {
        decrypt.setLength(0);
        for (int i = 0; i < input.length(); i++) {
            char letter = (char) (input.charAt(i) - key);
            decrypt.append(letter);
        }
        Matcher childMatcher = childName.matcher(decrypt);
        if (childMatcher.find()) {
            if (childMatcher.group("good").equals("G")) {
                String goodChild = childMatcher.group("name");
                goodChildren.add(goodChild);
            }
        }
    }
        goodChildren.forEach(System.out::println);
}
}
