package MidExam;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCities = scanner.nextInt();
        double totalProfit = 0;

        for (int i = 1; i <= numberOfCities; i++) {
            String cityName = scanner.next();
            double income = scanner.nextDouble();
            double expenses = scanner.nextDouble();
            double profit = income - expenses;

            if (i % 3 == 0 && i % 5 != 0) {
                double specialEventCost = expenses * 0.5;
                profit -= specialEventCost;
            } else if (i % 5 == 0) {
                double rainLoss = income * 0.1;
                profit -= rainLoss;
            }

            totalProfit += profit;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, profit);
        }

        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
        scanner.close();
    }
}