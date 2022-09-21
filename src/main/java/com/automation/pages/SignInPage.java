package com.automation.pages;

import com.automation.utilites.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public void Signin(){
        PageFactory.initElements(driver,this);

    }

    @CacheLookup
    @FindBy(xpath = "//input[@ name='email_create']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createclick;

    @CacheLookup
    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement Signinbutton;

    @CacheLookup
    @FindBy(xpath = "//a[@class='logout']")
    WebElement signout;

    @CacheLookup
    @FindBy(xpath = "//a[@class='login']")
    WebElement Signlink;

    @CacheLookup
    @FindBy(xpath = "//h1[@Class='page-heading']")
    WebElement Authentication;

    public String VerifYSignIn()
    {
        return getTextFromElement(Authentication);

    }
    public void EnterEmail(String username)
    {
        sendTextToElement(emailField,username);

    }
    public void EnterPassword(String passwordId)
    {
        sendTextToElement(passwordField,passwordId);

    }
    public void ClickOnSignBtn()
    {
        clickOnElement(Signinbutton);

    }
    public String verifyText(){
        WebElement result = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li"));
        return getTextFromElement(result);
    }
    public String VerifySignOutLink()
    {
        return getTextFromElement(signout);
    }
    public void clickSignOut()
    {
        clickOnElement(signout);

    }
    public String VeriSignInLink()
    {
        return getTextFromElement(Signlink);

    }


}
