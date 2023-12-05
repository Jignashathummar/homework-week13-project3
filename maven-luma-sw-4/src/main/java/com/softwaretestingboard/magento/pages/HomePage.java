package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By mouseHoverWomen = By.xpath("//span[normalize-space()='Women']");
    By mouseHoverTops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");

    By mouseHoverMen = By.xpath("//span[normalize-space()='Men']");
    By mouseHoverBottoms = By.xpath("//a[@id='ui-id-18']");

    By clickOnPants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    By mouseHoverOnGear = By.xpath("//span[normalize-space()='Gear']");

    By clickOnBags = By.xpath("//span[normalize-space()='Bags']");
    public void mouseHoverOnWomen() {
        mouseHoverToElement(mouseHoverWomen);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(mouseHoverTops);
    }
    public void mouseHoverOnMen(){
        mouseHoverToElement(mouseHoverMen);
    }
    public void mouseHoverOnBottoms(){
        mouseHoverToElement(mouseHoverBottoms);
    }

    public void clickOnPants(){
        clickOnElement(clickOnPants);
    }

    public void mouseHoverOnGear(){
        mouseHoverToElement(mouseHoverOnGear);
    }
    public void clickOnBags(){
        clickOnElement(clickOnBags);
    }
}
