import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DropdownSelection {

    public void selectValue() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement dd = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(dd);
        select.selectByValue("lohi");

        driver.findElement(By.id("react-burger-menu-btn")).click();
        List<WebElement> webElements = driver.findElements(By.cssSelector("a[class='bm-item menu-item']"));
        int i;
        for(i = 0; i< webElements.size(); i++){
            System.out.println(webElements.get(i).getAttribute("text"));
            driver.quit();
        }
    }
}

