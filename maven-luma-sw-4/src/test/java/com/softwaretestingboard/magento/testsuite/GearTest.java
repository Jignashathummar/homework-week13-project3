package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        // Mouse Hover on Gear Menu
        homePage.mouseHoverOnGear();
        // Click on Bags
        homePage.clickOnBags();
        // Click on Product Name ‘Overnight Duffle’
        gearPage.ClickOnOverNightDuffle();
        // Verify the text ‘Overnight Duffle’
        String expectedOvernightDuffle = "Overnight Duffle";
        String actualOvernightDuffle = gearPage.VerifyOvernightDuffle();
        Assert.assertEquals(expectedOvernightDuffle, actualOvernightDuffle);
        // Change Qty 3
        gearPage.clearQuantity();
        gearPage.changeQuantity();
        // Click on ‘Add to Cart’ Button.
        gearPage.clickOnAddToCart();
        Thread.sleep(1000);
        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String expectedMsgAddedToShoppingCart = "You added Overnight Duffle to your shopping cart.";
        String actualMsgAddedToShoppingCart = gearPage.getMsgAddedToShoppingCart();
        Assert.assertEquals(expectedMsgAddedToShoppingCart, actualMsgAddedToShoppingCart);
        // Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCartLink();
        // Verify the product name ‘Overnight Duffle’
        String expectedOvernightDuffle1 = "Overnight Duffle";
        String actualOvernightDuffle1 = gearPage.getTitleOvernightDuffle();
        Assert.assertEquals(expectedOvernightDuffle1, actualOvernightDuffle1);
        //Verify the Qty is ‘3’
        String expectedQuantity3 = "3";
        String actualQuantity3 = gearPage.getQuantity3();
        Assert.assertEquals(expectedQuantity3, actualQuantity3);
        // Verify the product price ‘$135.00’
        String expectedProductPrice = "$135.00";
        String actualProductPrice = gearPage.getProductPrice();
        Assert.assertEquals(expectedProductPrice, actualProductPrice);
        // Change Qty to ‘5’
        gearPage.setQuantity5();
        // Click on ‘Update Shopping Cart’ button
        gearPage.clickOnUpdateShoppingCartBtn();
        Thread.sleep(2000);
        // Verify the product price ‘$225.00’
        String expectedUpdatedProductPrice = "$225.00";
        String actualUpdatedProductPrice = gearPage.getProductPrice();
        Assert.assertEquals(expectedUpdatedProductPrice, actualUpdatedProductPrice);
    }

}
