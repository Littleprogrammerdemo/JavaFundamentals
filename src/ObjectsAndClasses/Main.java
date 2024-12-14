package ObjectsAndClasses;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countSongs = Integer.parseInt(scanner.nextLine());
        List<Songs> songsList = new ArrayList<>();

        for (int count = 1; count <= countSongs; count++) {
            String data = scanner.nextLine();
            String[] songData = data.split("_");
            String typeList = songData[0];
            String name = songData[1];
            String time = songData[2];

            Songs song = new Songs(typeList, name, time);
            songsList.add(song);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Songs song : songsList) {
                System.out.println(song.getName());
            }
        } else {
            for (Songs song : songsList) {
                if (song.getTypeList().equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
