package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReviewPaymentPage {

    static WebElement element = null;

    public static void confirmPayment(WebDriverWait wait) throws InterruptedException {
        element = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//div[@class='actionButtonText' and text()='Confirm']")));
        element.click();
        Thread.sleep(2000);
    }
}
