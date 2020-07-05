package scenarios;


import org.testng.annotations.Test;
import setup.BaseTest;
import utils.TestProperties;



import static org.testng.Assert.assertTrue;

public class NativeMobileTests extends BaseTest {


    @Test(groups = {"nativeAndroid"}, description = "This test will verify registration of the new user in Android")
    public void registerNewUserAndroidTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getPageObject().getWebelement("registerBtn").click();
        getPageObject().getWebelement("emailField").sendKeys(TestProperties.getProperty("email"));
        getPageObject().getWebelement("userNameField").sendKeys(TestProperties.getProperty("user"));
        getPageObject().getWebelement("passwordField").sendKeys(TestProperties.getProperty("password"));
        getPageObject().getWebelement("confirmPasswordField").sendKeys(TestProperties.getProperty("password"));
        getPageObject().getWebelement("agreementsCheckBox").click();
        getPageObject().getWebelement("endRegistrationBtn").click();

        boolean actualConfirmingRegistration = getPageObject().getWebelement("registrationConfirm").isDisplayed();
        assertTrue(actualConfirmingRegistration);
    }


    @Test(groups = {"nativeAndroid"}, description = "This test will verify sigin process in Android")
    public void signInRegisteredAndroidUserTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getPageObject().getWebelement("loginEmail").sendKeys(TestProperties.getProperty("email"));
        getPageObject().getWebelement("loginPassword").sendKeys(TestProperties.getProperty("password"));
        getPageObject().getWebelement("signInBtn").click();

        boolean actualHeaderBudgetActivity = getPageObject().getWebelement("headerAfterSignIn").isDisplayed();
        assertTrue(actualHeaderBudgetActivity);

        boolean actualButtonBudgetActivity = getPageObject().getWebelement("buttonInBudgetActivity").isDisplayed();
        assertTrue(actualButtonBudgetActivity);
    }

    @Test(groups = {"nativeIos"}, description = "This test will verify registration of the new user in Ios")
    public void registerNewUserIosTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getPageObject().getWebelement("registerBtn").click();
        getPageObject().getWebelement("emailField").sendKeys(TestProperties.getProperty("email"));
        getPageObject().getWebelement("userNameField").sendKeys(TestProperties.getProperty("user"));
        getPageObject().getWebelement("passwordField").sendKeys(TestProperties.getProperty("password"));
        getPageObject().getWebelement("confirmPasswordField").sendKeys(TestProperties.getProperty("password"));
        getPageObject().getWebelement("iosConfirmSwitch").click();
        getPageObject().getWebelement("endRegistrationBtn").click();

        boolean actualConfirmingRegistration = getPageObject().getWebelement("iosConfirmSwitch").isEnabled();
        assertTrue(actualConfirmingRegistration);
    }

    @Test(groups = {"nativeIos"}, description = "This test will verify sigin process in Ios")
    public void signInRegisteredIosUserTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getPageObject().getWebelement("loginEmail").sendKeys(TestProperties.getProperty("email"));
        getPageObject().getWebelement("loginPassword").sendKeys(TestProperties.getProperty("password"));
        getPageObject().getWebelement("signInBtn").click();

        boolean actualButtonBudgetActivity = getPageObject().getWebelement("buttonInBudgetActivity").isDisplayed();
        assertTrue(actualButtonBudgetActivity);
    }

}
