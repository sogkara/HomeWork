
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by sargis on 12/21/17.
 */
public class DynamicLoadTest {
    private ChromeDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anyutsk3\\Desktop\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        DynamicLoadPage dynamicLoadPage = new DynamicLoadPage(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void dynamicLoad() {

    }

}
