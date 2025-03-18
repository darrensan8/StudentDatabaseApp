package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {


        System.out.print("Enter the amount of students to enroll: ");
        Scanner scanner =  new Scanner(System.in);
        int numStudents = scanner.nextInt();
        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payBalance();
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i].toString());
        }
    }
}
