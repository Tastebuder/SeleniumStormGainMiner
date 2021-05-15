import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private final WebDriver driver;
//    locators
    private By signIn = By.linkText("Sign in");
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By signInButton = By.xpath("//input[@value='Sign in']");
    private By miner = By.linkText("Miner");

        public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignIn() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
        driver.findElement(signIn).click();
    }

    public void setEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(emailInput));
        driver.findElement(emailInput).sendKeys(email);
    }

    public void setPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordInput));
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void confirmCredentials() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(signInButton));
        driver.findElement(signInButton).click();
    }

    public MinerPage clickMiner() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(miner));
        driver.findElement(miner).click();
        return new MinerPage(driver);
    }

}
