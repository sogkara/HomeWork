
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

   // @AfterMethod
   //  public void tearDown() {
    //    driver.close();
    //}

}
