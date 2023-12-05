package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    MenPage manPage = new MenPage();
    HomePage homePage = new HomePage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        Thread.sleep(3000);
        // Mouse Hover on Men Menu
        homePage.mouseHoverOnMen();
        Thread.sleep(1000);
        // Mouse Hover on Bottoms
        homePage.mouseHoverOnBottoms();
        // Click on Pants
        Thread.sleep(1000);
        homePage.clickOnPants();
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        Thread.sleep(1000);
        manPage.mouseHoverCronusYogaPants();
//        Thread.sleep(1000);
        manPage.clickOnSize32();
        // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
        manPage.clickOnBlackColor();
        // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
        manPage.clickOnAddToCart();
        // Verify the text You added Cronus Yoga Pant to your shopping cart.
        String expectedValueSuccessAddToShoppingCart = "You added Cronus Yoga Pant to your shopping cart.";
        String actualValueSuccessAddToShoppingCart = manPage.getMsgAddToShoppingCart();
        Assert.assertEquals(expectedValueSuccessAddToShoppingCart, actualValueSuccessAddToShoppingCart);
        // Click on ‘shopping cart’ Link into message
        manPage.clickOnShoppingCartMsg();
        // Verify the text ‘Shopping Cart.'
        String expectedShoppingCartTitle = "Shopping Cart";
        String actualShoppingcartTitle = manPage.shoppingCartTextTitle();
        Assert.assertEquals(expectedShoppingCartTitle, actualShoppingcartTitle);
        // Verify the product name ‘Cronus Yoga Pant’
        String expectedCronusYogaPantlabel = "Cronus Yoga Pant";
        String actualCronusYogaPantlabel = manPage.cronusYogaPantLabel();
        Assert.assertEquals(expectedCronusYogaPantlabel, actualCronusYogaPantlabel);
        // Verify the product size ‘32’
        String expectedSize = "32";
        String actualSize = manPage.verifyPantSize();
        Assert.assertEquals(expectedSize, actualSize);
        // Verify the product colour ‘Black’
        String expectedColorBlack = "Black";
        String actualColorBlack = manPage.verifyColor();
        Assert.assertEquals(expectedColorBlack, actualColorBlack);

    }
}
