import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

/**
 * Created by User on 27.06.2017.
 */
public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {this.driver = driver;}

    public WebElement companyTab() {
       driver.findElement(new By.ByLinkText("Company")).click();//(".//span[@class='navPrimary__hd']"));
       return null;
    }

    public WebElement careerTab() {
        driver.findElement(new By.ByLinkText("Careers")).click();////span[@class = 'navList__hd']"));
        return null;
    }



}
