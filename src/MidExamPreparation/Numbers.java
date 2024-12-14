package MidExamPreparation;
import java.util.*;
import java.util.stream.Collectors;
public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum * 1.0 / numbers.size();
        List<Integer> greaterElements = new ArrayList<>();
        for (int number : numbers) {
            if (number > average) {
                greaterElements.add(number);
            }
        }
        Collections.sort(greaterElements);
        Collections.reverse(greaterElements);
        if (greaterElements.isEmpty()) {
            System.out.println("No");
        } else {
            if (greaterElements.size() <= 5) {
                for (int number : greaterElements) {
                    System.out.print(number + " ");
                }
            }
            else {
                for (int position = 0; position <= 4; position++) {
                    System.out.print(greaterElements.get(position) + " ");
                }
            }
        }
    }
}
