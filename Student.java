package studentdatabaseapp;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String studentID;
    private String courses = "";
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("1 -> Freshman \n2 -> Sophomore \n3 -> Junior \n4 -> Senior \nEnter student grade level: ");
        this.gradeLevel = scanner.nextInt();

        setStudentID();

    }

    private void setStudentID() {
        id++;
        this.studentID =  gradeLevel +""+ id;
    }

    public void enroll() {
        do {
            System.out.print("Enter a course to enroll (press 0 to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("0")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {break;}
        } while (1 != 0);
    }

    public void viewBalance() {
        System.out.println("Your balance is: $ " + tuitionBalance);
    }

    public void payBalance() {
        viewBalance();
        Scanner scanner =  new Scanner(System.in);
        System.out.print("How much would you like to pay? Please enter a payment amount: ");
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank your payment of: $" + payment +"\nYour updated balance is: $" + tuitionBalance);
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeLevel +
                "\nStudentID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nTuition Balance: $" + tuitionBalance;
    }
}
