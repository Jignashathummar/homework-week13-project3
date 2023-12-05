package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {
    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        Thread.sleep(3000);
        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomen();
        Thread.sleep(1000);
        // Mouse Hover on Tops
        homePage.mouseHoverOnTops();
        Thread.sleep(1000);
        //Click on Jackets
        womenPage.clickOnJackets();
        Thread.sleep(1000);
        List<String> jacketsNameListBefore = womenPage.beforeSortingList();
        // Select Sort By filter “Product Name”
        Thread.sleep(2000);
        womenPage.sortByFilterFromDropDown("Product Name");
        Thread.sleep(2000);
        // After Sorting value
        List<String> jacketsNameListAfter = womenPage.afterSortingValue();
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);

    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        Thread.sleep(3000);
        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomen();
        Thread.sleep(1000);
        // Mouse Hover on Tops
        homePage.mouseHoverOnTops();
        Thread.sleep(1000);
        //Click on Jackets
        womenPage.clickOnJackets();
        //* Select Sort By filter “Price”
        Thread.sleep(1000);
        List<Double> beforePriceList = womenPage.sortByFilterPrice();
        // Select Sort By filter “Price”
        Thread.sleep(1000);
        womenPage.sortByFilterFromDropDown("Price");
        Thread.sleep(2000);
        //* Verify the products price display in Low to High
        List<Double> afterPriceList = womenPage.sortByFilterPrice();
        // Sort the jacketPriceListBefore to Ascending Order
        Thread.sleep(1000);
        Collections.sort(beforePriceList);
        // Verify the products price display in Low to High
        Assert.assertEquals(beforePriceList, afterPriceList);
    }

}
