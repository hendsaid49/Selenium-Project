import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class WebElementsLocators {
    WebDriver driver;
    By FirstName = By.id("_R_1cl2p4jikacppb6amH1_");
    By Surname = By.id("_R_1kl2p4jikacppb6amH1_");
    By Day = By.cssSelector("[aria-label=\"Select day\"]");
    By Month = By.cssSelector("[aria-label=\"Select month\"]");
    By Year = By.cssSelector("[aria-label=\"Select year\"]");
    By Gender = By.xpath("//*[@id=\"_R_mad6p4jikacppb6amH2_\"]");
    By Mail = By.xpath("//*[@id=\"_R_6ad8p4jikacppb6amH1_\"]");
    By Password = By.xpath("//*[@id=\"_R_clap4jikacppb6amH1_\"]");
    By Showpass = By.cssSelector("[aria-label=\"Show password\"]");
    By Submit = By.xpath("//*[text()='Submit']");
    By usernamelocator = RelativeLocator.with(By.cssSelector("[name=\"user\"]")).
            below(By.xpath("//*[text()='Username']"));
    By passlocator = RelativeLocator.with(By.cssSelector("#inputPassword")).
            below(By.cssSelector("#inputUsername"));
    By CheckBoxlocator = RelativeLocator.with(By.cssSelector("[value=\"remember-me\"]")).
            above(By.cssSelector("#loginButton"));
    By Submitlocator = RelativeLocator.with(By.xpath("//*[text()='Sign in']")).
            below(By.cssSelector("[type=\"checkbox\"]"));


    @Test
    public void locators() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        driver.findElement(FirstName).sendKeys("Hend");
        driver.findElement(Surname).sendKeys("Saeed");
        driver.findElement(Day).sendKeys("14");
        driver.findElement(Day).click();
        driver.findElement(Month).sendKeys("September");
        driver.findElement(Month).click();
        driver.findElement(Year).sendKeys("1996");
        driver.findElement(Year).click();
        driver.findElement(Gender).sendKeys("Male");
        driver.findElement(Gender).click();
        driver.findElement(Mail).sendKeys("hend@gmail.com");
        driver.findElement(Password).sendKeys("123456789");
        driver.findElement(Showpass).click();
        driver.findElement(Submit).click();

    }


    @Test
    public void RelativeLocators() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://aa-practice-test-automation.vercel.app/index.html");
        driver.findElement(usernamelocator).sendKeys("Hend Saeed");
        driver.findElement(passlocator).sendKeys("123456789");
        driver.findElement(CheckBoxlocator).click();
        driver.findElement(Submitlocator).click();


    }


}
