package com.automation.pages;

import com.automation.utilites.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Blouse')]")
    WebElement ClickProductBlouse;

    @CacheLookup
    @FindBy(xpath = "//a[@id='color_8']")
    WebElement colorWhite;

    @CacheLookup
    @FindBy(xpath = "//*[contains(text(),'Printed Dress')]")
    WebElement ClickProductPrintedDress;

    @CacheLookup
    @FindBy(xpath = "//a[@id='color_13']")
    WebElement colorOrange;

    @CacheLookup
    @FindBy(xpath = "//*[contains(text(),'Printed Chiffon Dress')]")
    WebElement ClickProductChiffonDress;

    @CacheLookup
    @FindBy(xpath = "//a[@id='color_15']")
    WebElement colorGreen;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='right-block']//a[contains(text(),'Printed Summer Dress')]")
    WebElement ClickProductSummerDress;

    @CacheLookup
    @FindBy(xpath = "//a[@id='color_14']")
    WebElement colorBlue;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement inputboxQun;

    @CacheLookup
    @FindBy(xpath = "//select[@id='group_1']/option[1]")
    WebElement small;

    @CacheLookup
    @FindBy(xpath = "//select[@id='group_1']/option[2]")
    WebElement medium;

    @CacheLookup
    @FindBy(xpath = "//select[@id='group_1']/option[3]")
    WebElement large;

    @CacheLookup
    @FindBy(css = "button[name='Submit'] span")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement close;

    public void selectedProductOne(String PName) {
        if (PName.equalsIgnoreCase("Blouse")) {
            clickOnElement(ClickProductBlouse);
        } else if (PName.equalsIgnoreCase("Printed Dress")) {
            clickOnElement(ClickProductPrintedDress);

        } else if (PName.equalsIgnoreCase("Printed Chiffon Dress")) {
            clickOnElement(ClickProductChiffonDress);

        } else if (PName.equalsIgnoreCase("Printed Summer Dress with Price $28.98")) {
            clickOnElement(ClickProductSummerDress);

        }
    }
    public void selectColorProduct(String Pcolor) {
        if (Pcolor.equalsIgnoreCase("White")) {
            clickOnElement(colorWhite);

        } else if (Pcolor.equalsIgnoreCase("Orange")) {
            clickOnElement(colorOrange);

        } else if (Pcolor.equalsIgnoreCase("Green")) {
            clickOnElement(colorGreen);

        } else if (Pcolor.equalsIgnoreCase("Blue")) {
            clickOnElement(colorBlue);

        }
    }
    public void enterQuntity(String value){
        clearValue(inputboxQun);
        sendTextToElement(inputboxQun,value);
    }
    public void selectSizeProduct(String size){
        if (size.equalsIgnoreCase("s")){
            clickOnElement(small);
        }
        else if (size.equalsIgnoreCase("m")){
            clickOnElement(medium);
        }
        else if (size.equalsIgnoreCase("l")){
            clickOnElement(large);
        }
    }
    public void clickAddtocartButton(){
        clickOnElement(addToCartButton);
    }
    public void clickToClosePopupDishplay(){
        clickOnElement(close);
    }
}


