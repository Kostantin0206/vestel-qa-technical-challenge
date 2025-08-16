
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class SaucedemoPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    // Locators
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By addToCartButton = By.xpath("//button[text()='Add to cart']");
    private final By cartIcon = By.className("shopping_cart_link");
    private final By checkoutButton = By.id("checkout");
    private final By firstNameField = By.id("first-name");
    private final By lastNameField = By.id("last-name");
    private final By postalCodeField = By.id("postal-code");
    private final By continueButton = By.id("continue");
    private final By finishButton = By.id("finish");
    private final By menuButton = By.id("react-burger-menu-btn");
    private final By logoutLink = By.id("logout_sidebar_link");

    public SaucedemoPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Core Methods
    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void addFirstItemToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void checkout(String firstName, String lastName, String postalCode) {
        driver.findElement(cartIcon).click();
        driver.findElement(checkoutButton).click();
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(postalCodeField).sendKeys(postalCode);
        driver.findElement(continueButton).click();
        driver.findElement(finishButton).click();
    }

    public void logout() {
        driver.findElement(menuButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
    }

    public boolean isOnLoginPage() {
        return driver.findElement(loginButton).isDisplayed();
    }
}