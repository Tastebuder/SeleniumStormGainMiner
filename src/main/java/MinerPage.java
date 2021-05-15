import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MinerPage {

    private final WebDriver driver;
//  locators
    private By activateButton = By.xpath("//div[text()='Activate']/parent::div/parent::button");
    private By countdown = By.xpath("//span[contains(text(),'Time remaining')]");


    public MinerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickActivate() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(activateButton));
        driver.findElement(activateButton).click();
    }

    public boolean isCountdownRunning() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(countdown));
        return driver.findElement(countdown).isDisplayed();
    }
}
