import org.openqa.selenium.WebDriver;

/**
 * Created by User on 27.06.2017.
 */
public class PageResources {
    private HomePage homePage;
    private CareerPage careerPage;


    public PageResources(WebDriver driver) {
        homePage = new HomePage(driver);
        careerPage = new CareerPage(driver);
    }

    public HomePage getHomePage() {return homePage;}
    public CareerPage getCareerPage () {return careerPage;}
}
