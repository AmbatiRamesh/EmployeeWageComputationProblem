package com.bridgelabz.userRegistration;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

public class Testing {
    @BeforeAll
    static void beforeAllTestMsg() {
        System.out.println("-----Welcome to User Registration Problem-----");
    }
    @AfterAll
    static void afterAllTestPassedMsg(){
        System.out.println("All Test Case Passed");
    }
    @AfterEach
    public void afterEachTestPassMsg() {
        System.out.println("Happy Test Case");
    }
    @BeforeEach
    public void beforeEachTestPassMsg(){
        System.out.println("Sad Test Case");
    }
    @Test
    public void givenFirstNameShouldReturnTrue() throws UserRegistration.UserValidationException {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.checkFirstName("Ramesh"));
    }
    @Test
    public void givenLastNameShouldReturnTrue() throws UserRegistration.UserValidationException {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.checkLastName("Ambati"));
    }
    @Test
    public void givenEmailIdShouldReturnTrue() throws UserRegistration.UserValidationException {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.checkEmailId("rameshambati.ab@gmail.com"));
    }
    @Test
    public void givenPhoneNumberShouldReturnTrue() throws UserRegistration.UserValidationException {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.phoneNumber("91 9640827483"));
    }
    @Test
    public void givenPasswordRule1ShouldReturnTrue() throws UserRegistration.UserValidationException {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.password("viratkohli"));
    }
    @Test
    public void givenPasswordRule2ShouldReturnTrue() throws UserRegistration.UserValidationException {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.password2("Msdhonii"));
    }
    @Test
    public void givenPasswordRule3ShouldReturnTrue() throws UserRegistration.UserValidationException {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.password3("Rohitsharma45"));
    }
    @Test
    public void givenPasswordRule4ShouldReturnTrue() throws UserRegistration.UserValidationException {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.password4("Rohitsharma45@"));
    }
    @Test
    public void givenEmailSeparateShouldReturnTrue() throws UserRegistration.UserValidationException {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(true, userRegistration.checkEmailSeparate("abc@yahoo.com"));
    }

}
