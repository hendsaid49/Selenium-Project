import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumBasicsMethod {
    WebDriver Browser;
    String url = "https://example.com/";

    @Test
    public void Basics() {
        Browser = new ChromeDriver();
        navigateTo(url);
        System.out.println("Browser is opened and navigated to the URL: " + url);
        System.out.println("My current URL is: " + Browser.getCurrentUrl());
        System.out.println("My current Title is: " + Browser.getTitle());
        System.out.println("My current PageSource is: " + Browser.getPageSource());
        System.out.println("My current UniqueID is: " + Browser.getWindowHandle());
        Browser.navigate().to("https://www.selenium.dev");
        Browser.navigate().back();
        Browser.navigate().forward();
        Browser.navigate().refresh();
        System.out.println("My current Size " + Browser.manage().window().getSize());
        System.out.println("My current Position " + Browser.manage().window().getPosition());
        Browser.manage().window().setSize(new org.openqa.selenium.Dimension(1027, 768));
        System.out.println("My current Size " + Browser.manage().window().getSize());
        Browser.manage().window().setPosition(new org.openqa.selenium.Point(200, 150));
        System.out.println("My current Position " + Browser.manage().window().getPosition());
        Browser.manage().window().maximize();
        Browser.get(url);
        Browser.switchTo().newWindow(WindowType.TAB);
        Browser.get("https://www.selenium.dev");
        System.out.println("My current UniqueID is: " + Browser.getWindowHandle());
        navigateTo(url);
        Browser.get(url);
        Browser.switchTo().newWindow(WindowType.WINDOW);
        Browser.get("https://www.selenium.dev");
        Browser.quit();
      

    }

    public void navigateTo(String url) {
        Browser.navigate().to(url);
    }
}
