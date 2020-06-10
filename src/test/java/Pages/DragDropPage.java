package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDropPage {

    public static WebElement element = null;

    public static void dragAndDrop(WebDriver driver,String arg0,String arg1) throws InterruptedException {
        WebElement source = driver.findElement(By.id(arg0));
        WebElement target = driver.findElement(By.id(arg1));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).perform();
        Thread.sleep(2000);
    }

    public static void viewMessage(WebDriverWait wait,String expectedMessage) throws InterruptedException {
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("droptarget")));
       String actualMessage = element.getText();
        Assert.assertEquals(actualMessage,expectedMessage);
        Thread.sleep(2000);
    }
}
