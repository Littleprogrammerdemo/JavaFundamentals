package Methods;
import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String operation = scanner.nextLine();
    int firstNumber = Integer.parseInt(scanner.nextLine());
    int secondNumber = Integer.parseInt(scanner.nextLine());

    executeOperation(operation, firstNumber, secondNumber);
}
    private static void executeOperation(String operation, int firstNumber, int secondNumber) {
        switch (operation) {
            case "add":
                sumAndPrint(firstNumber, secondNumber);
                break;
            case "multiply":
                multiplyAndPrint(firstNumber, secondNumber);
                break;
            case "subtract":
                subtractAndPrint(firstNumber, secondNumber);
                break;
            case "divide":
                divideAndPrint(firstNumber, secondNumber);
                break;

        }
    }
    public static void sumAndPrint(int n1, int n2) {
        System.out.println(n1 + n2);
    }
    public static void multiplyAndPrint(int n1, int n2) {
        System.out.println(n1 * n2);
    }
        public static void subtractAndPrint(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    public static void divideAndPrint(int n1, int n2) {
        System.out.println(n1 / n2);
    }
}
