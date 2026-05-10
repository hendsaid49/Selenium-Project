import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    WebDriver driver;

    @Test
    public void takeScreenShot() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        // Code to take screenshot goes here
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("src/main/resources/screenshottest.png");
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }

    @Test
    public void takescreenshotforelement() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        File src = driver.findElement(By.cssSelector(".lnXdpd")).getScreenshotAs(OutputType.FILE);
        File dest = new File("src/main/resources/screenshottestelement.png");
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }


}
