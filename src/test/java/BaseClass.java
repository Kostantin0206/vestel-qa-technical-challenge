package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseClass {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Selenium 4.19.1 will auto-manage ChromeDriver via Selenium Manager
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Maximize window
        options.addArguments("--remote-allow-origins=*"); // Allow all origins

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Global wait
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Safely close browser
        }
    }
}