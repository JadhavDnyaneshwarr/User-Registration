package ocm.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegUtility {
    static boolean firstName(String firstName){
        String validFirstName = ("^[A-Z]?[a-zA-Z]{2,}$");
        Pattern pattern = Pattern.compile(validFirstName);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("First Name is Valid");
            return true;
        }else {
            System.out.println("First Name is Invalid");
            return false;
        }
    }
    static boolean lastName(String lastName){
        String validLastName = ("^[A-Z]?[a-zA-Z]{2,}$");
        Pattern pattern = Pattern.compile(validLastName);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()){
            System.out.println("Last Name is Valid");
            return true;
        }else {
            System.out.println("Last Name is Invalid");
            return false;
        }
    }
    static boolean email(String email){
        String validEmail = ("^[a-z]{3,}[.]?([a-zA-Z]*)+@([b][l][.][c][o])+([.][i]?[n]?)$");
        Pattern pattern = Pattern.compile(validEmail);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            System.out.println("Email is Valid");
            return true;
        }else {
            System.out.println("Email is Invalid");
            return false;
        }
    }
    static boolean mobileNumber(String mobileNo){
        String validMobileNumber = "^[1-9]{2}[ ][1-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(validMobileNumber);
        Matcher matcher = pattern.matcher(mobileNo);
        if (matcher.matches()){
            System.out.println("Mobile Number is Valid");
            return true;
        }else {
            System.out.println("Mobile Number is Invalid");
            return false;
        }
    }
    static boolean password(String password){
        String validPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%&*+])[A-Za-z0-9!@#$%&*+]{8,}$";
        Pattern pattern = Pattern.compile(validPassword);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            System.out.println("Password is Valid");
            return true;
        }else {
            System.out.println("Password is Invalid");
            return false;
        }
    }
}