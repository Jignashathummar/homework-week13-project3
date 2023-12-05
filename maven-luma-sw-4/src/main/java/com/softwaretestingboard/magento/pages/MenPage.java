package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    By mouseHoverCronusYogaPants = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By clickOnSize32 = By.xpath("(//div[@class='swatch-option text'])[1]");

    By clickOnBlackColor = By.xpath("(//div[@class='swatch-option color'])[1]");

    By clickOnaddTOCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");

    By getMsgAddToShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    By clickOnShoppinCartMsg = By.xpath("//a[normalize-space()='shopping cart']");
    By shoppingCartTextTitle = By.xpath("//span[@class='base']");
    By cronusYogaPantLabel = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

    By verifyPantSize = By.xpath("//dd[contains(text(),'32')]");

    By verifyColor = By.xpath("//dd[contains(text(),'Black')]");
    public void mouseHoverCronusYogaPants(){
        mouseHoverToElement(mouseHoverCronusYogaPants);
    }

    public void clickOnSize32(){
        mouseHoverToElementAndClick(clickOnSize32);
    }

    public void clickOnBlackColor(){
        mouseHoverToElementAndClick(clickOnBlackColor);
    }

    public void clickOnAddToCart(){
        clickOnElement(clickOnaddTOCart);
    }

    public String getMsgAddToShoppingCart(){
        return getTextFromElement(getMsgAddToShoppingCart);
    }

    public void clickOnShoppingCartMsg(){
        clickOnElement(clickOnShoppinCartMsg);
    }
    public String shoppingCartTextTitle(){
      return  getTextFromElement(shoppingCartTextTitle);
    }
    public String cronusYogaPantLabel(){
        return getTextFromElement(cronusYogaPantLabel);
    }
    public String verifyPantSize(){
       return getTextFromElement(verifyPantSize);
    }
    public String verifyColor(){
        return getTextFromElement(verifyColor);
    }
}
