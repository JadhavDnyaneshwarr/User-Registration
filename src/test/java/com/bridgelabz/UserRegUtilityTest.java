package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class UserRegUtilityTest {
    UserRegUtility userReg;
    private boolean expected;
    private String email;

    public UserRegUtilityTest(boolean expected, String email){
        this.expected = expected;
        this.email=email;
    }

    @Before
    public void setup(){
        userReg = new UserRegUtility();
    }

    @Test
    public void whenGivenValidFirstNameShouldReturnTrue(){
        boolean validName = userReg.firstName("Dnyaneshwar");
        Assertions.assertEquals(true, validName);
    }
    @Test
    public void whenGivenValidLastNameShouldReturnTrue(){
        boolean validName = userReg.lastName("Jadhav");
        Assertions.assertEquals(true, validName);
    }
    @Test
    public void whenGivenValidEmailShouldReturnTrue(){
        boolean validEmail = userReg.email("Jadhav.dnyanesh@bl.co.in");
        Assertions.assertEquals(true, validEmail);
    }
    @Test
    public void whenGivenValidMobileNumberShouldReturnTrue(){
        boolean validMobileNumber = userReg.mobileNumber("91 8806474798");
        Assertions.assertEquals(true, validMobileNumber);
    }
    @Test
    public void whenGivenValidPasswordShouldReturnTrue(){
        boolean validPassword = userReg.password("Dj@12345");
        Assertions.assertEquals(true, validPassword);
    }
    @Parameterized.Parameters
    public static Collection data(){
        Object[][] sampleEmails = new Object[][]{{true, "abc@yahoo.com"}, {true, "abc-100@yahoo.com"},{true,"abc.100@yahoo.com"}, {true, "abc111@abc.com"}, {true, "abc-100@abc.net"}, {true, "abc.100@abc.com.au"}, {true, "abc@1.com"}, {true, "abc@gmail.com.com"}, {true, "abc+100@gmail.com"}};
        return Arrays.asList(sampleEmails);
    }
    @Test
    public void WhenGivenSampleEmailShouldReturnTrue(){
        Assertions.assertEquals(expected, userReg.sampleEmails(email));
    }
}
