package MethodsExercise;
import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = Integer.parseInt(sc.nextLine());
        int y1 = Integer.parseInt(sc.nextLine());
        int x2 = Integer.parseInt(sc.nextLine());
        int y2 = Integer.parseInt(sc.nextLine());

        printCloserCoordinates(x1, y1, x2, y2);
    }

    public static void printCloserCoordinates (int x1, int y1, int x2, int y2) {
        int firstCoordinates = (x1 * x1 + y1 * y1);
        int secondCoordinates = (x2 * x2 + y2 * y2);

        if (firstCoordinates <= secondCoordinates) {
            System.out.printf("(%d, %d)",x1,y1);
        } else {
            System.out.printf("(%d, %d)",x2, y2);
        }
    }

}
