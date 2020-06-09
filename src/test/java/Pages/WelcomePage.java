package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage {

    public static WebElement element=null;

    public static void viewsMessage(WebDriverWait wait, String expectedMessage) {
        element = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//div[@class='pageSectionHeading']")));
        String actualMessage = element.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}
