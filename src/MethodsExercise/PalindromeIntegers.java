package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            System.out.println(isInputPalindrome(input));
            input = scanner.nextLine();
        }
    }

    public static boolean isInputPalindrome(String input) {

  StringBuilder builder = new StringBuilder(input);
   String reversedString = builder.reverse().toString();

        return input.equals(reversedString);
    }
}
