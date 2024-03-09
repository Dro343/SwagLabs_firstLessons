import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
   static WebDriver driver;
    public static void selectElementByLinkText(String text){
        driver.findElement(By.linkText(text)).click();


    }
}
