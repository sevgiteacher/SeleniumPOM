package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public static WebElement element = null;

    public static void navigate(WebDriver driver, String url) throws InterruptedException {
        driver.navigate().to(url);
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//*[@title='Accept Cookies']")).click();
        Thread.sleep(2000);
    }

    public static void enterUserName(WebDriverWait wait, String userName) {
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("principal")));
        element.sendKeys(userName);
    }

    public static void enterPassword(WebDriverWait wait, String password) {
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        element.sendKeys(password);
    }

    public static void clickButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@class='actionButton']"));
        element.click();
    }

    public static void viewsErrorMessage(WebDriverWait wait,String expectedErrorMessage){
        element = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[contains(@class, 'notificationText notificationText')]")));
        String actualErrorMessage = element.getText();
        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage));
    }
}
