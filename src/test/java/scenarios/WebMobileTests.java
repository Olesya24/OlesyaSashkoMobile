package scenarios;

import setup.BaseTest;
import utils.TestProperties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "Make sure that we've opened google page wirh \"EPAM\" request and find main link of company")
    public void SearchWebTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {

        getDriver().get(TestProperties.getProperty("url"));

        // Make sure that page has been loaded completely
        new WebDriverWait(getDriver(), 10).until(wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));

        getPageObject().getWebelement("enterSearch").sendKeys(TestProperties.getProperty("request"));
        getPageObject().getWebelement("searchBtn").click();
        WebElement result = getPageObject().getWebelement("firstLink");
        Assert.assertEquals(result.getText(), "EPAM | Enterprise Software Development, Design & Consulting");

        // Log that test finished
        System.out.println("Search ended");
    }
}
