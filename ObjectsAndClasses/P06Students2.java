package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {
    static class Student {
        String firstName;
        String lastName;
        int age;
        String town;
        Student() {
            this.firstName = null;
            this.lastName = null;
            this.age = 0;
            this.town = null;
        }

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return this.town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String toString() {
            return String.format("%s %s is %d years old%n", this.getFirstName(), this.getLastName(), this.getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] arrStudentData = inputLine.split("\\s+");

            String firstName = arrStudentData[0];
            String lastName = arrStudentData[1];
            int age = Integer.parseInt(arrStudentData[2]);
            String town = arrStudentData[3];

            Student student = new Student(firstName, lastName, age, town);

            int existingIndex = findStudentsIndex(studentsList, student.getFirstName(), student.getLastName());
            if (existingIndex != -1) {
                studentsList.get(existingIndex).setAge(student.getAge());
                studentsList.get(existingIndex).setTown(student.getTown());
            } else {
                studentsList.add(student);
            }

            inputLine = scanner.nextLine();
        }

        String searchTown = scanner.nextLine();

        for (Student s : studentsList) {
            if (s.getTown().equals(searchTown)) {
                System.out.print(s);
            }
        }

    }

    static public int findStudentsIndex (List<Student> studentsList, String firstName, String lastName) {
        for (int i = 0; i < studentsList.size(); i++) {
            String firstNameList = studentsList.get(i).getFirstName();
            String lastNameList = studentsList.get(i).getLastName();

            if (firstNameList.equals(firstName) && lastNameList.equals(lastName)) {
                return  i;
            }
        }

        return -1;
    }
}
