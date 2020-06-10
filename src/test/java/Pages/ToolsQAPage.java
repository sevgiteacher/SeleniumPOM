package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ToolsQAPage {

    public static WebElement element=null;

    public static void slides(WebDriver driver){
        WebElement slider = driver.findElement(By.xpath("//*[@type='range']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(60,0).release().perform();
    }

}
