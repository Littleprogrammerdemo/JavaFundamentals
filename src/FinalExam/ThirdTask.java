package FinalExam;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class ThirdTask {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Map<String, Integer[]> followers = new LinkedHashMap<>();

            String input = scanner.nextLine();
            while (!input.equals("Log out")) {
                String[] tokens = input.split(": ");
                String command = tokens[0];
                String username = tokens[1];

                switch (command) {
                    case "New follower":
                        followers.putIfAbsent(username, new Integer[]{0, 0});
                        break;
                    case "Like":
                        int likeCount = Integer.parseInt(tokens[2]);
                        followers.putIfAbsent(username, new Integer[]{0, 0});
                        Integer[] existingLikesAndComments = followers.get(username);
                        existingLikesAndComments[0] += likeCount;
                        break;
                    case "Comment":
                        followers.putIfAbsent(username, new Integer[]{0, 0});
                        Integer[] existingLikesAndComments2 = followers.get(username);
                        existingLikesAndComments2[1]++;
                        break;
                    case "Blocked":
                        if (followers.containsKey(username)) {
                            followers.remove(username);
                        } else {
                            System.out.println(username + " doesn't exist.");
                        }
                        break;
                }

                input = scanner.nextLine();
            }

            System.out.println(followers.size() + " followers");
            followers.forEach((key, value) -> System.out.println(key + ": " + (value[0] + value[1])));
        }
    }