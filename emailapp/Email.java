package emailapp;
//class to make objects

import java.util.Scanner;

public class Email {
    //variable list
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String altEmailAddress;
    private int startingPasswordLength = 10;
    private String comapnyName = "comapny";
    //constructor for making email
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Generating company email for new employee: " + this.firstName + " " + this.lastName);

        department = setDepartment();

        this.password = randomPassword(startingPasswordLength);

        if (department == "none") {
            email = firstName.toLowerCase()  + "." + lastName.toLowerCase() + "@" + comapnyName + ".com";
        } else {
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + comapnyName + ".com";
        }

        System.out.println("Email created for: " + this.firstName + " " + this.lastName);
        System.out.println("Email: " + email);
        System.out.println("Password: " +  this.password);
    }
    //method to display employee name, email, and Mailbox capacity
    public String showInfo() {
        return "Display name: " + firstName + " " + lastName +
                "\nCompany email: " + email +
                "\nMailbox capacity: " + mailboxCapacity + "mb";
    }
    //method to ask and set department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Developemnt\n3 for Accounting\n0 for none\nPlease enter a department code: ");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();

        if(departmentChoice ==  1) {
            return "Sales";
        } else if (departmentChoice ==  2) {
            return "Development";
        } else if (departmentChoice ==  3) {
            return "Accounting";
        } else {
            return "none";
        }
    }
    //method to make a random password
    private String randomPassword(int length) {
        String passwordSet =  "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@!*^";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int randomInt = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomInt);
        }
        return new String(password);
    }
    //setter and getter methods for mailbox capacity, alternative email addresses, and password
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAltEmailAddress(String altEmailAddress) {
        this.altEmailAddress = altEmailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAltEmailAddress() {
        return altEmailAddress;
    }
}
