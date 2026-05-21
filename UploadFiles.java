import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFiles {
    WebDriver driver;
    By fileUpload = By.id("regularFileInput");
    By fileupload2 = By.id("fileInput");


    @Test
    public void uploadFiles() {
        driver = new ChromeDriver();
        driver.navigate().to("https://aa-practice-test-automation.vercel.app/Pages/uploadFile.html");
        driver.manage().window().maximize();
        driver.findElement(fileUpload).
                sendKeys("C:\\Users\\hends\\OneDrive\\Desktop\\download.png");
        //driver.findElement(fileupload2).click();
        driver.findElement(fileupload2).sendKeys("C:\\Users\\hends\\OneDrive\\Desktop\\1.docx");

    }

}
