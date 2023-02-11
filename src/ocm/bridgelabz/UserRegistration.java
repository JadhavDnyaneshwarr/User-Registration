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

        System.out.println("----------Sample Emails-------------");
        String[] arrayOfSampleValidEmail = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        System.out.println("Checking all Valid Sample!!!");
        for (int i = 0; i < arrayOfSampleValidEmail.length; i++) {
            userRegUtility.sampleEmails(arrayOfSampleValidEmail[i]);
        }
        System.out.println();
        String[] arrayOfSampleInvalidEmail = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", ".abc@abc.com", "abc()*@gmail.com", "abc123@.com.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com","abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
        System.out.println("Checking all InValid Sample!!!");
        for (int i = 0; i < arrayOfSampleInvalidEmail.length; i++) {
            userRegUtility.sampleEmails(arrayOfSampleInvalidEmail[i]);
        }
    }
}
