package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegUtilityTest {
    UserRegUtility userReg;

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
}
