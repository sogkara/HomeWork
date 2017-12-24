
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by sargis on 12/18/17
 */
public class GoogleSearchPage extends BasePage{
    private By searchInput = By.cssSelector("input#lst-ib");
    private By searchButton = By.cssSelector("input[name='btnK']");


    public GoogleSearchPage(WebDriver webDriver) {
        super(webDriver);
        visit("http://google.com");
    }

    public void clickSearchButton() {
        click(searchButton);
    }

    public void typeSearchText(String text) {
        type(searchInput, text);
    }

    public void search(String text) {
        typeSearchText(text);
        clickSearchButton();
    }

    public WebElement getFirstResult(int time) {
        List<WebElement> elements = findElements(By.cssSelector((".rc .r")));
        return elements.get(0);
    }
    public  boolean isDisplay(){
       return isDisplayed(getFirstResult(300));

    }

}
