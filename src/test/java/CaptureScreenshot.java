import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.lang.*;

import java.io.File;

public class CaptureScreenshot {
public static void takeScreenshot(WebDriver driver, String path){
    ///Convert web driver object to TakeScreenshot
    TakesScreenshot scrShot =((TakesScreenshot)driver);
    ///Call getScreenshotAs method to create image file
    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    ///Copy file to Desired Location
    //Move image file to new destination
    File DestFile=new File(path);
    //Copy file at destination

   ///FileHandler.copyFile(SrcFile, DestFile);
}
}