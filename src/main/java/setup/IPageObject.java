package setup;

import org.openqa.selenium.WebElement;

public interface IPageObject {
    WebElement getWebelement(String weName) throws NoSuchFieldException, IllegalAccessException, InstantiationException;
}
