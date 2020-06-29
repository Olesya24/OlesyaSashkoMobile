package scenarios;

import org.testng.annotations.Test;
import setup.BaseTest;
import utils.TestProperties;

import static org.testng.Assert.assertTrue;

public class NativeMobileTests extends BaseTest {


    @Test(groups = {"native"}, description = "This test will verify registration of the new user")
    public void registerNewUserTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getPageObject().getWebelement("registerBtn").click();
        getPageObject().getWebelement("emailField").sendKeys(TestProperties.getProperty("email"));
        getPageObject().getWebelement("userNameField").sendKeys(TestProperties.getProperty("user"));
        getPageObject().getWebelement("passwordField").sendKeys(TestProperties.getProperty("password"));
        getPageObject().getWebelement("confirmPasswordField").sendKeys(TestProperties.getProperty("password"));
        getPageObject().getWebelement("agreamentsCheckBox").click();
        getPageObject().getWebelement("endRegistrationBtn").click();

        boolean actualConfirmingRegistration = getPageObject().getWebelement("registrationConfirm").isDisplayed();
        assertTrue(actualConfirmingRegistration);
    }


    @Test(groups = {"native"}, description = "This test will verify sigin process")
    public void signInRegisteredUser() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getPageObject().getWebelement("loginEmail").sendKeys(TestProperties.getProperty("email"));
        getPageObject().getWebelement("loginPassword").sendKeys(TestProperties.getProperty("password"));
        getPageObject().getWebelement("signInBtn").click();

        boolean actualHeaderBudgetActivity = getPageObject().getWebelement("headerAfterSignIn").isDisplayed();
        assertTrue(actualHeaderBudgetActivity);

        boolean actualButtonBudgetActivity = getPageObject().getWebelement("buttonInBudgetActivity").isDisplayed();
        assertTrue(actualButtonBudgetActivity);
    }
}
