package MapsExercise;
import java.util.*;

public class AMinerTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String resource = scanner.nextLine();
        while (!resource.equals("stop")) {

            int quantity = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(resource)) {
                int existingQuantity = resources.get(resource);
                resources.put(resource, existingQuantity + quantity);
            } else {
                resources.put(resource, quantity);
            }

            resource = scanner.nextLine();
        }

        resources.entrySet().forEach(entry -> System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue()));
    }
}
