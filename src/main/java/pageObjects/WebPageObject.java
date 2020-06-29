package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPageObject {
    @FindBy(xpath = "//input[@name='q']")
    WebElement enterSearch;

    @FindBy(xpath = "//button[@class='Tg7LZd']")
    WebElement searchBtn;

    @FindBy(xpath = "//div[contains(text(),'EPAM | Enterprise Software Development, Design & Consulting')]")
    WebElement firstLink;


    public WebPageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }
}
