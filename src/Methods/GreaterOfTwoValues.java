package Methods;


import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        executeComparisonByType(scanner, type);
    }
    private static void executeComparisonByType(Scanner scanner, String type) {
        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                compareAndPrint(firstNumber, secondNumber);
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                compareAndPrint(firstSymbol, secondSymbol);
                break;
            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                compareAndPrint(firstText, secondText);
                break;
        }
    }

    public static void compareAndPrint(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }

    public static void compareAndPrint(char firstSymbol, char secondSymbol) {
        if (firstSymbol > secondSymbol) {
            System.out.println(firstSymbol);
        } else {
            System.out.println(secondSymbol);
        }
    }

    public static void compareAndPrint(String firstText, String secondText) {

        if (firstText.compareTo(secondText) > 0) {
            System.out.println(firstText);
        } else {
            System.out.println(secondText);
        }
    }
}
