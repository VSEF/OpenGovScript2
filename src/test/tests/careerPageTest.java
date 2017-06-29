import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 28.06.2017.
 */
public class careerPageTest {
    WebDriver driver;

    @Test
    public void test2() throws InterruptedException {
        driver = new ChromeDriver();
        PageResources page = new PageResources(driver);
        driver.get("https://opengov.com/careers");
        if (driver.getCurrentUrl().contentEquals("https://opengov.com/careers")) ;
        System.out.println("Welcome to the career page");
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        page.getCareerPage().viewOpenPositionTab();
        Thread.sleep(2000);
        page.getCareerPage().byTeam();
        page.getCareerPage().engineeringByTeam();
        page.getCareerPage().byCity();
        page.getCareerPage().redwoodCityByCity();
        System.out.println("List of open positions of Engineers in Redwood City has been created");

        driver.close();
    }
}
