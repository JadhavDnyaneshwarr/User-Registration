package ocm.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegUtility userRegUtility = new UserRegUtility();
        System.out.println("welcome to User Registration Problem");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Name");
        String firstName = scanner.next();
        System.out.println("Enter Last Name");
        String lastName = scanner.next();
        System.out.println("Enter Email");
        String email = scanner.next();
        System.out.println("Enter Mobile Number");
        String mobileNo = " ";
        mobileNo = scanner.nextLine();
        mobileNo += scanner.nextLine();
        System.out.println("Enter Password - must contain 8 character");
        String password = scanner.next();

        userRegUtility.firstName(firstName);
        userRegUtility.lastName(lastName);
        userRegUtility.email(email);
        userRegUtility.mobileNumber(mobileNo);
        userRegUtility.password(password);
    }
}
