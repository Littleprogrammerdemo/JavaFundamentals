package BasicSyntaxExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = Integer.parseInt(sc.nextLine());
        int number2 = Integer.parseInt(sc.nextLine());
        int number3 = Integer.parseInt(sc.nextLine());

        if (number1 >= number2 && number1 >= number3) {
            System.out.println(number1);
            System.out.println(Math.max(number2, number3));
            System.out.println(Math.min(number2, number3));
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println(number2);
            System.out.println(Math.max(number1, number3));
            System.out.println(Math.min(number1, number3));
        } else {
            System.out.println(number3);
            System.out.println(Math.max(number1, number2));
            System.out.println(Math.min(number1, number2));
        }
    }
}