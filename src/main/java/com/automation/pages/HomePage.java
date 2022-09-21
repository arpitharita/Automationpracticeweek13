package com.automation.pages;

import com.automation.utilites.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='block_top_menu']/ul[1]/li[1]/a")
    WebElement women;

    @CacheLookup
    @FindBy(xpath = "//div[@id='block_top_menu']/ul[1]/li[2]/a")
    WebElement dresses;

    @CacheLookup
    @FindBy(xpath = "//div[@id='block_top_menu']/ul[1]/li[3]/a")
    WebElement tshirts;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header_user_info']/a")
    WebElement signIn;

    @CacheLookup
    @FindBy(xpath = "//img[@class='logo img-responsive']")
    WebElement logo;



    public void clickOnWomenTab(){
        clickOnElement(women);

    }

    public void clickOnDresses(){
        clickOnElement(dresses);
    }

    public void clickOntShirts(){
        clickOnElement(tshirts);
    }
    public void clickOnSignInLink(){
        clickOnElement(signIn);
    }

}
