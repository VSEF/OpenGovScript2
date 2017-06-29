import org.junit.Assert;
import junit.framework.AssertionFailedError;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 27.06.2017.
 */
public class homePageTest {
    WebDriver driver;

    @Test
    public void test() throws InterruptedException {
        driver = new ChromeDriver();
        PageResources page = new PageResources(driver);
        driver.get("https://opengov.com/");
        if (driver.getCurrentUrl().contentEquals("https://opengov.com/"));
        System.out.println("Welcome to the home page");
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        page.getHomePage().companyTab();
        Thread.sleep(2000);
        page.getHomePage().careerTab();
        if (driver.getCurrentUrl().contains("careers"));
        System.out.println("Welcome to the career page");

        driver.close();

    }
}