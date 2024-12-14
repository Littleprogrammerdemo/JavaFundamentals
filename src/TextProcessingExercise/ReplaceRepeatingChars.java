package TextProcessingExercise;

    import java.util.Scanner;

    public class ReplaceRepeatingChars {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            StringBuilder result = new StringBuilder();

            for (int i = 1; i < text.length(); i++) {
                if (text.charAt(i - 1) != text.charAt(i)) {
                    result.append(text.charAt(i - 1));
                }
            }

            result.append(text.charAt(text.length() - 1));

            System.out.println(result);
        }
}
