package ExamPreparation;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Generate")) {

            String [] commandParts = command.split(">>>");
            String commandName = commandParts[0];

            switch(commandName) {
                case "Contains":
                    String subString = commandParts[1];
                    if (activationKey.contains(subString)) {
                        System.out.printf("%s contains %s%n", activationKey, subString);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String type = commandParts[1];
                    int startIndexForReplace = Integer.parseInt(commandParts[2]);
                    int endIndexForReplace = Integer.parseInt(commandParts[3]);
                    String textForReplace = activationKey.substring(startIndexForReplace, endIndexForReplace);
                    String newText = "";
                    if (type.equals("Upper")) {
                        newText = textForReplace.toUpperCase();
                    } else if (type.equals("Lower")) {
                        newText = textForReplace.toLowerCase();
                    }
                    activationKey = activationKey.replace(textForReplace, newText);
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);

                    String textForRemove = activationKey.substring(startIndex, endIndex);
                    activationKey = activationKey.replace(textForRemove, "");

                    System.out.println(activationKey);
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + activationKey);


    }
}