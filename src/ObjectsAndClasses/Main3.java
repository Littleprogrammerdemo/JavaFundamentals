package ObjectsAndClasses;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Main3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Students2> studentsList = new ArrayList<>();
            String input = scanner.nextLine();
            while (!input.equals("end")) {
                String[] studentsDataArr = input.split(" ");
                String firstName = studentsDataArr[0];
                String lastName = studentsDataArr[1];
                int age = Integer.parseInt(studentsDataArr[2]);
                String town = studentsDataArr[3];

                if (isStudentExisting(studentsList, firstName, lastName)) {
                    int index = getExistingIndex(studentsList, firstName, lastName);
                    studentsList.get(index).setAge(age);
                    studentsList.get(index).setHometown(town);
                } else {
                    Students2 currentStudent = new Students2(firstName, lastName, age, town);
                    studentsList.add(currentStudent);
                }

                input = scanner.nextLine();
            }

            String homeTown = scanner.nextLine();
            for (Students2 student : studentsList) {
                if (homeTown.equals(student.getHometown())) {
                    System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
                }
            }
        }

        public static int getExistingIndex (List<Students2> studentsList, String firstName, String lastName) {
            int index = -1;
            for (int i = 0; i < studentsList.size(); i++) {
                Students2 student = studentsList.get(i);
                if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                    index = i;
                }
            }
            return index;
        }

        static boolean isStudentExisting(List<Students2> studentsList, String firstName, String lastName) {
            for (Students2 student : studentsList) {
                if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                    return true;
                }
            }
            return false;
        }
}
