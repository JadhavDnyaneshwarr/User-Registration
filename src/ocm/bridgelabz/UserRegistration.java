package ocm.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegUtility userRegUtility = new UserRegUtility();
        boolean valid = false;
        while( valid == false) {
            System.out.println("welcome to User Registration Problem");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first Name");
            String firstName = scanner.next();
            System.out.println("Enter Last Name");
            String lastName = scanner.next();
            System.out.println("Enter Email");
            String email = scanner.next();
            System.out.println("Enter Mobile Number");
            String mobileNo = scanner.next();

            userRegUtility.firstName(firstName);
            userRegUtility.lastName(lastName);
            userRegUtility.email(email);
            userRegUtility.mobileNumber(mobileNo);
            break;
        }
    }
}
