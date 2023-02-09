package ocm.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegUtility {
    static boolean firstName(String firstName){
        String validFirstName = ("^[A-Z]?[a-zA-z]{2,}$");
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
        String validFirstName = ("^[A-Z]?[a-zA-z]{2,}$");
        Pattern pattern = Pattern.compile(validFirstName);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()){
            System.out.println("Last Name is Valid");
            return true;
        }else {
            System.out.println("Last Name is Invalid");
            return false;
        }
    }
}
