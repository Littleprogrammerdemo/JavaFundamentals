package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] books = scanner.nextLine().split("&");
        List<String> shelf = new ArrayList<>();
        for (String book : books) {
            shelf.add(book);
        }

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] tokens = input.split(" \\| ");
            String command = tokens[0];
            String bookName = tokens[1];

            switch (command) {
                case "Add Book":
                    if (!shelf.contains(bookName)) {
                        shelf.add(0, bookName);
                    }
                    break;
                case "Take Book":
                    shelf.remove(bookName);
                    break;
                case "Swap Books":
                    String book1 = tokens[1];
                    String book2 = tokens[2];
                    if (shelf.contains(book1) && shelf.contains(book2)) {
                        int index1 = shelf.indexOf(book1);
                        int index2 = shelf.indexOf(book2);
                        shelf.set(index1, book2);
                        shelf.set(index2, book1);
                    }
                    break;
                case "Insert Book":
                    if (!shelf.contains(bookName)) {
                        shelf.add(bookName);
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(bookName);
                    if (index >= 0 && index < shelf.size()) {
                        System.out.println(shelf.get(index));
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", shelf));
    }
}