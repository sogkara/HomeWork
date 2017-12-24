
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by sargis on 12/21/17.
 */
public class DynamicLoadTest {
    private FirefoxDriver driver;
    private  DynamicLoadPage dynamicLoadPage;
    @BeforeMethod
    public void setUp() {


        driver = new FirefoxDriver();
        dynamicLoadPage = new DynamicLoadPage(driver);

    }

   @Test
    public void dynamicLoad() {

          dynamicLoadPage.click("#start button");
    }

    @Test
    public boolean isDisplay(){

        return dynamicLoadPage.isDisplayed("#loading");
    }
    public void isFinished(String cssSelector){


         dynamicLoadPage.loading("#finish");

     }

   // @AfterMethod
   //  public void tearDown() {
    //    driver.close();
    //}

}
