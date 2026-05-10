import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {

    WebDriver driver;
    By JSAlert = By.cssSelector("[onclick=\"jsAlert()\"]");
    By JSconfirm = By.cssSelector("[onclick=\"jsConfirm()\"]");
    By JSPrompt = By.cssSelector("[onclick=\"jsPrompt()\"]");


    @Test
    public void JSAlert() {
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(JSAlert).click();
        driver.switchTo().alert().accept();

    }

    @Test
    public void JSConfirm() {
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(JSconfirm).click();
        driver.switchTo().alert().dismiss();
    }

    @Test
    public void JSPrompt() {
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(JSPrompt).click();
        driver.switchTo().alert().sendKeys("Test Selenium");
        driver.switchTo().alert().accept();
    }

}