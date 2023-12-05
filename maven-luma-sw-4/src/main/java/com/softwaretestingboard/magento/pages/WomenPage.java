package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

import java.util.List;

public class WomenPage extends Utility {

    By mouseHoverClickOnJacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By getListOfJacket = By.xpath("//strong[@class='product name product-item-name']//a");

    By sortProductName = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");

    By sortPrice = By.xpath("//span[@class='price-container price-final_price tax weee']//span[@class='price']");
   // By sortByPrice = By.xpath("//select[@id='sorter'])[1]");
    public void clickOnJackets() {
        mouseHoverToElementAndClick(mouseHoverClickOnJacket);
    }

    public List<String> beforeSortingList() {
        return getList(getListOfJacket);
    }

    public void sortByFilterFromDropDown(String text) {
        selectByVisibleTextFromDropDown(sortProductName, text);
    }

    public List<String> afterSortingValue() {
        return getList(getListOfJacket);
    }

    public List<Double> sortByFilterPrice() {
        return getPriceList(sortPrice, "$", "");
    }

}
