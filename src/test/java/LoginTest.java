import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginTest {

    public static void login() {

        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Boolean result =  driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
        if(result==true){
            System.out.println("Test case is passed");
        }
        ///driver.findElement(By.linkText("Sauce Labs Backpack")).click();
       //driver.findElement(By.partialLinkText("allTheThings")).click();


        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.xpath("//button[text()='Add to cart']"))).build().perform();





    }
}
