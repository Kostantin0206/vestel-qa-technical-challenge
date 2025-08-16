import org.testng.Assert;
import org.testng.annotations.Test;

public class SaucedemoTests extends utils.BaseClass {
    @Test
    public void testCompleteFlow() {
        SaucedemoPage page = new SaucedemoPage(driver);

        // 1. Login
        page.login("standard_user", "secret_sauce");

        // 2. Add item to cart
        page.addFirstItemToCart();

        // 3. Checkout
        page.checkout("Kostantin", "Andonov", "1000");


        // 4. Logout
        page.logout();

        // 5. Verify logout
        Assert.assertTrue(page.isOnLoginPage(), "Logout failed - not on login page");
    }
}