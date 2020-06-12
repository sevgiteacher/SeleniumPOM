package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferDetailsPage {
    static WebElement element = null;

    public static void confirmPaymentSuccessfull(WebDriverWait wait,String expectedMessage) throws InterruptedException {
        element = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//div[@class='notificationText notificationText-singleLine']")));
        String actualMessage = element.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
        Thread.sleep(2000);
    }
}
