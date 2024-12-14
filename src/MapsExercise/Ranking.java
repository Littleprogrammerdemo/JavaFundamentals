package MapsExercise;
import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contestsPasswords = new HashMap<>();
        Map<String, Map<String, Integer>> usersPoints = new HashMap<>();
        String line;
        while (!"end of contests".equals(line = scanner.nextLine())) {
            String[] contestData = line.split(":");
            contestsPasswords.put(contestData[0], contestData[1]);
        }
        while (!"end of submissions".equals(line = scanner.nextLine())) {
            String[] submissionData = line.split("=>");
            String contest = submissionData[0];
            String password = submissionData[1];
            String user = submissionData[2];
            int points = Integer.parseInt(submissionData[3]);
            if (contestsPasswords.containsKey(contest) && contestsPasswords.get(contest).equals(password)) {
                usersPoints.computeIfAbsent(user, k -> new HashMap<>()).merge(contest, points, Integer::max);
            }
        }
        String bestUser = "";
        int maxPoints = 0;
        for (Map.Entry<String, Map<String, Integer>> userEntry : usersPoints.entrySet()) {
            int totalPoints = userEntry.getValue().values().stream().mapToInt(Integer::intValue).sum();
            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                bestUser = userEntry.getKey();
            }
        }
        System.out.println("Best candidate is " + bestUser + " with total " + maxPoints + " points.");
        System.out.println("Ranking:");
        List<Map.Entry<String, Map<String, Integer>>> sortedUsers = new ArrayList<>(usersPoints.entrySet());
        Collections.sort(sortedUsers, Comparator.comparing(Map.Entry::getKey));
        for (Map.Entry<String, Map<String, Integer>> userEntry : sortedUsers) {
            System.out.println(userEntry.getKey());
            List<Map.Entry<String, Integer>> sortedContests = new ArrayList<>(userEntry.getValue().entrySet());
            Collections.sort(sortedContests, Comparator.comparing((Map.Entry<String, Integer> entry) -> -entry.getValue()));
            for (Map.Entry<String, Integer> contestEntry : sortedContests) {
                System.out.println(" #  " + contestEntry.getKey() + " -> " + contestEntry.getValue());
            }
        }
    }
}
