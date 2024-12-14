package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int number = 1; number <= n; number++) {
            int sum = 0;
            int SumForNumber = number;
            while (SumForNumber != 0) {
                int lastDigit = SumForNumber % 10;
                sum += lastDigit;
                SumForNumber /= 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(number + " -> True");
            } else {
                System.out.println(number + " -> False");
            }
        }
    }
}
