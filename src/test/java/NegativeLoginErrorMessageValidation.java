import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeLoginErrorMessageValidation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("TEST12345");
        driver.findElement(By.id("login-button")).click();
        String errorMsgText = driver.findElement(By.xpath("//h3[@data-test='error']")).getAttribute("innerText");
        if (errorMsgText != "Epic sadface: Username and password do not match any user in this service"){
            System.out.println("Correct Login error message is displayed");
        }else {
            System.out.println("NOT Correct Login error message is displayed");
        }
        driver.quit();
    }
}