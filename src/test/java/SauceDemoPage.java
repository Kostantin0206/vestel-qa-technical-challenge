package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SauceDemoPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    // Locators
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By cartIcon = By.className("shopping_cart_link");
    private final By checkoutButton = By.id("checkout");
    private final By firstNameField = By.id("first-name");
    private final By lastNameField = By.id("last-name");
    private final By postalCodeField = By.id("postal-code");
    private final By continueButton = By.id("continue");
    private final By finishButton = By.id("finish");
    private final By menuButton = By.id("react-burger-menu-btn");
    private final By logoutLink = By.id("logout_sidebar_link");

    // Verification Locators
    private final By cartItemName = By.xpath("//*[@id='item_4_title_link']/div");
    private final By cartItemDesc = By.xpath("//div[contains(text(),'carry.allTheThings()')]");
    private final By paymentInfo = By.xpath("//div[text()='Payment Information:']/following-sibling::div");
    private final By shippingInfo = By.xpath("//div[text()='Shipping Information:']/following-sibling::div");
    private final By itemTotal = By.className("summary_subtotal_label");
    private final By tax = By.className("summary_tax_label");
    private final By total = By.className("summary_total_label");
    private By thankYouHeader = By.xpath("//*[@id='checkout_complete_container']/h2");
    private By dispatchMessage = By.xpath("//*[@id='checkout_complete_container']/div");




    public SauceDemoPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Core Actions
    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }

    public void checkout(String firstName, String lastName, String postalCode) {
        driver.findElement(checkoutButton).click();
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(postalCodeField).sendKeys(postalCode);
        driver.findElement(continueButton).click();
    }

    public void completePurchase() {
        driver.findElement(finishButton).click();
    }

    public void logout() {
        driver.findElement(menuButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
    }

    // Verification Methods
    public String getCartItemName() {
        return driver.findElement(cartItemName).getText();
    }

    public String getCartItemDescription() {
        return driver.findElement(cartItemDesc).getText();
    }

    public String getPaymentInfo() {
        return driver.findElement(paymentInfo).getText();
    }

    public String getShippingInfo() {
        return driver.findElement(shippingInfo).getText();
    }

    public String getItemTotal() {
        return driver.findElement(itemTotal).getText();
    }

    public String getTax() {
        return driver.findElement(tax).getText();
    }

    public String getTotal() {
        return driver.findElement(total).getText();
    }

    public boolean isOnLoginPage() {
        return driver.findElement(loginButton).isDisplayed();
    }
    public String getThankYouHeader() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(thankYouHeader)).getText();
    }

    public String getDispatchMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(dispatchMessage)).getText();
    }
}
