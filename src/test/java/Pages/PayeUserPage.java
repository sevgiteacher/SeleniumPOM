package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PayeUserPage {
    static WebElement element = null;

    public static void clickContact(WebDriverWait wait){
       element = wait.until(ExpectedConditions.
               visibilityOfElementLocated(By.xpath("//span[@class='checkableLabel' and text()='Contact']")));
       element.click();
    }

    public static void selectPayee(WebDriverWait wait) throws InterruptedException {
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.
               xpath("//div[@class='selectionLabel' and text()='Please, select an option']"))).click();
       Thread.sleep(2000);
       element = wait.until(ExpectedConditions.
               visibilityOfElementLocated(By.xpath("//*[@class='option' and text()='Henry George']")));
       element.click();
       Thread.sleep(3000);
    }


    public static void enterAmountToPay(WebDriverWait wait,String amount){
       element = wait.until(ExpectedConditions.
               visibilityOfElementLocated(By.xpath("//input[@class='inputField large rightAligned']")));
       element.sendKeys(amount);
    }

    public static void typeDescription(WebDriverWait wait,String description){
       element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("description")));
       element.sendKeys(description);
    }

    public static void  clickSubmit(WebDriverWait wait) throws InterruptedException {
       element = wait.until(ExpectedConditions.
               visibilityOfElementLocated(By.xpath("//div[@class='actionButtonText' and text()='Submit']")));
       element.click();
       Thread.sleep(2000);
    }
}
