package com.automation.pages;

import com.automation.utilites.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomanCategoryPage extends Utility {

    public static final Logger log = LogManager.getLogger(WomanCategoryPage.class.getName());

    public WomanCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[@class='title_block']")
    WebElement verifywomen;

    public String VerifyWomanText()
    {
        return getTextFromElement(verifywomen);

    }


}

