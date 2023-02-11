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
        System.out.println("Checking all Valid Sample!!!");
        userRegUtility.sampleEmails("abc@yahoo.com");
        userRegUtility.sampleEmails("abc-100@yahoo.com");
        userRegUtility.sampleEmails("abc.100@yahoo.com");
        userRegUtility.sampleEmails("abc111@abc.com");
        userRegUtility.sampleEmails("abc-100@abc.net");
        userRegUtility.sampleEmails("abc.100@abc.com.au");
        userRegUtility.sampleEmails("abc@1.com");
        userRegUtility.sampleEmails("abc@gmail.com.com");
        userRegUtility.sampleEmails("abc+100@gmail.com");
        System.out.println();
        System.out.println("Checking all InValid Sample!!!");
        userRegUtility.sampleEmails("abc");
        userRegUtility.sampleEmails("abc@.com.my");
        userRegUtility.sampleEmails("abc123@gmail.a");
        userRegUtility.sampleEmails("abc123@.com");
        userRegUtility.sampleEmails(".abc@abc.com");
        userRegUtility.sampleEmails("abc()*@gmail.com");
        userRegUtility.sampleEmails("abc123@.com.com");
        userRegUtility.sampleEmails("abc@%*.com");
        userRegUtility.sampleEmails("abc..2002@gmail.com");
        userRegUtility.sampleEmails("abc.@gmail.com");
        userRegUtility.sampleEmails("abc@abc@gmail.com");
        userRegUtility.sampleEmails("abc@gmail.com.1a");
        userRegUtility.sampleEmails("abc@gmail.com.aa.au");
    }
}
