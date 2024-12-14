package MidExam;
import java.util.Arrays;
import java.util.Scanner;
public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                String[] coffees = scanner.nextLine().split(" ");
                int n = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < n; i++) {
                    String[] command = scanner.nextLine().split(" ");

                    switch (command[0]) {
                        case "Include":
                            coffees = Arrays.copyOf(coffees, coffees.length + 1);
                            coffees[coffees.length - 1] = command[1];
                            break;
                        case "Remove":
                            int numberOfCoffees = Integer.parseInt(command[2]);
                            if (command[1].equals("first")) {
                                if (numberOfCoffees <= coffees.length) {
                                    coffees = Arrays.copyOfRange(coffees, numberOfCoffees, coffees.length);
                                }
                            } else {
                                if (numberOfCoffees <= coffees.length) {
                                    coffees = Arrays.copyOf(coffees, coffees.length - numberOfCoffees);
                                }
                            }
                            break;
                        case "Prefer":
                            int coffeeIndex1 = Integer.parseInt(command[1]);
                            int coffeeIndex2 = Integer.parseInt(command[2]);
                            if (coffeeIndex1 < coffees.length && coffeeIndex2 < coffees.length) {
                                String temp = coffees[coffeeIndex1];
                                coffees[coffeeIndex1] = coffees[coffeeIndex2];
                                coffees[coffeeIndex2] = temp;
                            }
                            break;
                        case "Reverse":
                            reverse(coffees);
                            break;
                    }
                }

                System.out.println("Coffees:");
                for (String coffee : coffees) {
                    System.out.print(coffee + " ");
                }
            }

            private static void reverse(String[] coffees) {
                int left = 0;
                int right = coffees.length - 1;

                while (left < right) {
                    String temp = coffees[left];
                    coffees[left] = coffees[right];
                    coffees[right] = temp;
                    left++;
                    right--;
                }
            }
        }
