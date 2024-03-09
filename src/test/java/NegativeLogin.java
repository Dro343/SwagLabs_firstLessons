import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeLogin {

    public static void main(String []args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("TEST12345");
        driver.findElement(By.id("login-button")).click();
        Boolean errormsg = driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed();

        if (errormsg){
            System.out.println("Not able to login with negative credentials");
        } else {
            System.out.println("User was able to login with negative credentials. Alert!!!");
        }
    }
}
