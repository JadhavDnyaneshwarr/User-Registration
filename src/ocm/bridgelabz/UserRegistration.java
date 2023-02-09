package ocm.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("welcome to User Registration Problem");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Name");
        String firstName = scanner.next();
        UserRegUtility.firstName(firstName);
    }
}
