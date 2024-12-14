package MethodsExercise;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dataType = sc.nextLine();

        switch (dataType) {
            case "int":
                int integerNumber = Integer.parseInt(sc.nextLine());
                printModifiedData(integerNumber);
                break;
            case "real":
                double doubleNumber = Double.parseDouble(sc.nextLine());
                printModifiedData(doubleNumber);
                break;
            case "string":
                String text = sc.nextLine();
                printModifiedData(text);
                break;
        }

    }

    public static void printModifiedData (int integer) {
        System.out.println(integer * 2);
    }

    public static void printModifiedData (double doubleNumber) {
        System.out.printf("%.2f", doubleNumber * 1.5);
    }

    public static void printModifiedData (String text) {
        System.out.println("$" + text + "$");
    }
}
