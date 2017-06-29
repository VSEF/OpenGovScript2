import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by User on 28.06.2017.
 */
public class CareerPage {
    private WebDriver driver;
    public CareerPage(WebDriver driver) {this.driver = driver;}
    public WebElement viewOpenPositionTab() {driver.findElement(By.xpath(".//*[@class='btn__hd']")).click(); return null;}
    public WebElement byTeam() {driver.findElement(By.xpath(".//*[@class='js-jobBoard-team']")).click(); return  null;}
    public WebElement engineeringByTeam() {driver.findElement(By.xpath(".//*[@value='Engineering']")).click(); return null; }
    public WebElement byCity() {driver.findElement(By.xpath(".//*[@class='js-jobBoard-location']")).click(); return null;}
    public WebElement redwoodCityByCity() {driver.findElement(By.xpath(".//*[@value='Redwood City']")).click(); return  null;}

}
