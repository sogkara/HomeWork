

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by sargis on 12/18/17
 */
public class GoogleSearchTest {
    private GoogleSearchPage googleSearchPage;
    private FirefoxDriver driver;

    @BeforeMethod
    public void setUp() {


        driver = new FirefoxDriver();
        googleSearchPage = new GoogleSearchPage(driver);

    }
    @Test
    public void searchTest() {

     googleSearchPage.search("Armenia");
      assertTrue(googleSearchPage.isDisplay());
      assertTrue(googleSearchPage.getFirstResult(300).getText().contains("Wikipedia"));

    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }


}
