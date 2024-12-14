package MidExamPreparation;
import java.util.Arrays;
import java.util.Scanner;
public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] targets = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int countShotTargets = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int shotIndex = Integer.parseInt(input);
            if (shotIndex >= 0 && shotIndex <= targets.length - 1) {
                int valueShotTarget = targets[shotIndex];
                for (int index = 0; index <= targets.length - 1; index++) {
                    int currentTarget = targets[index];
                    if (currentTarget != -1 && index != shotIndex) {
                        if (currentTarget > valueShotTarget) {
                            currentTarget -= valueShotTarget;
                        } else {
                           currentTarget += valueShotTarget;
                        }
                        targets[index] = currentTarget;}
               }
                targets[shotIndex] = -1;
                countShotTargets++;
            }
            input = scanner.nextLine();
        }
        System.out.print("Shot targets: " + countShotTargets + " -> ");
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}
