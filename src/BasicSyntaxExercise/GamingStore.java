package BasicSyntaxExercise;
import java.util.Scanner;
public class GamingStore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String input = sc.nextLine();
        boolean enoughMoney = true;
        double startingMoney = budget;

        while (!input.equals("Game Time")) {
            switch (input) {
                case "CS: OG":
                    if (budget >= 15.99) {
                        budget -= 15.99;
                        System.out.printf("Bought %s%n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (budget >= 19.99) {
                        budget -= 19.99;
                        System.out.printf("Bought %s%n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (budget >= 59.99) {
                        budget -= 59.99;
                        System.out.printf("Bought %s%n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (budget >= 29.99) {
                        budget -= 29.99;
                        System.out.printf("Bought %s%n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                case "OutFall 4":
                    if (budget >= 39.99) {
                        budget -= 39.99;
                        System.out.printf("Bought %s%n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            if (budget == 0) {
                System.out.println("Out of money!");
                enoughMoney = false;
                break;
            }

            input = sc.nextLine();
        }

        double cost = startingMoney - budget;
        if (enoughMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", cost, budget);
        }
    }
}