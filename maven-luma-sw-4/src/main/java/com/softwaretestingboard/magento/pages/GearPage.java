package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By clickOnOverNightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    By verifyOvernightDuffle = By.xpath("//span[@class='base']");
    By verifyOvernightDuffle1 = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By changeQuantity = By.xpath("//input[@id='qty']");
    By clickOnAddToCart = By.xpath("//button[@id='product-addtocart-button']");
    By getMsgAddedToShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By clickOnShoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By getQuantity = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$45.00']");

    By getProductPrice = By.xpath("(//span[@class='cart-price']//span)[2]");
    By clickOnUpdateShoppingCartBtn = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    public void ClickOnOverNightDuffle() {
        clickOnElement(clickOnOverNightDuffle);
    }

    public String VerifyOvernightDuffle() {
        return getTextFromElement(verifyOvernightDuffle);
    }

    public String getTitleOvernightDuffle() {
        return getTextFromElement(verifyOvernightDuffle1);
    }

    public void changeQuantity() {
        sendTextToElement(changeQuantity, "3");
    }

    public void clearQuantity() {
        clearElement(changeQuantity);
    }

    public void clickOnAddToCart() {
        clickOnElement(clickOnAddToCart);
    }

    public String getMsgAddedToShoppingCart() {
        return getTextFromElement(getMsgAddedToShoppingCart);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(clickOnShoppingCartLink);
    }

    public String getQuantity3() {
        return getTextRelativeLocatorToRightOf(getQuantity, "input").getAttribute("value");
    }

    public void setQuantity5() {
        getTextRelativeLocatorToRightOf(getQuantity, "input").clear();
        getTextRelativeLocatorToRightOf(getQuantity, "input").sendKeys("5");

    }

    public String getProductPrice() {
        return getTextFromElement(getProductPrice);
    }
    public void clickOnUpdateShoppingCartBtn(){
        clickOnElement(clickOnUpdateShoppingCartBtn);
    }
}
