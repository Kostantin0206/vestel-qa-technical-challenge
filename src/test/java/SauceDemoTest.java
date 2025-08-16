package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SauceDemoPage;
import utils.BaseClass;

public class SauceDemoTest extends BaseClass {
    @Test
    public void testCompletePurchaseFlow() throws InterruptedException {
        SauceDemoPage page = new SauceDemoPage(driver);

        // 1. Login
        page.login("standard_user", "secret_sauce");
        Thread.sleep(5000);

        // 2. Add item to cart
        page.addToCart();
        Thread.sleep(5000);

        // 3. Verify cart content
        page.goToCart();
        Assert.assertEquals(page.getCartItemName(), "Sauce Labs Backpack");
        Assert.assertTrue(page.getCartItemDescription().contains("carry.allTheThings()"));
        Thread.sleep(5000);

        // 4. Checkout
        page.checkout("Kostantin", "Andonov", "1000");
        Thread.sleep(5000);

        // 5. Verify checkout content
        Assert.assertEquals(page.getPaymentInfo(), "SauceCard #31337");
        Assert.assertEquals(page.getShippingInfo(), "Free Pony Express Delivery!");
        Assert.assertEquals(page.getItemTotal(), "Item total: $29.99");
        Assert.assertEquals(page.getTax(), "Tax: $2.40");
        Assert.assertEquals(page.getTotal(), "Total: $32.39");
        Thread.sleep(5000);

        // 6. Complete purchase and verify final messages
        page.completePurchase();
        Assert.assertEquals(page.getThankYouHeader(), "Thank you for your order!");
        Assert.assertEquals(page.getDispatchMessage(),
                "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
        Thread.sleep(5000);

        // 7. Logout
        page.logout();
        Assert.assertTrue(page.isOnLoginPage(), "Logout verification failed");
        Thread.sleep(5000);
    }
}
