package com.automation.pages;

import com.automation.utilites.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createclick;

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstnameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastnameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement postelcodeField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilenuberField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement Clickregisterbtn;

    public void EnterEmailId(String emailId)
    {
        sendTextToElement(email,emailId);

    }
    public void ClickOnCreateAcc()
    {
        clickOnElement(createclick);

    }
    public void EnterFirstName(String fname)
    {
        sendTextToElement(firstnameField,fname);

    }
    public void EnterLastName(String lname)
    {
        sendTextToElement(lastnameField,lname);

    }
    public void Enterpassword(String pass)
    {
        sendTextToElement(passwordField,pass);

    }
    public void EnterAddress(String addname)
    {
        sendTextToElement(addressField,addname);

    }
    public void EnterCity(String city)
    {
        sendTextToElement(cityField,city);

    }
    public void SelectState(String state)
    {
        selectByVisibleTextFromDropDown(stateField,state);

    }
    public void EnterPostalCode(String postalcode)
    {
        sendTextToElement(postelcodeField,postalcode);

    }
    public void SelectCountry(String country)
    {
        selectByVisibleTextFromDropDown(countryField,country);

    }
    public void EnterMobileNumber(String mnumber)
    {
        sendTextToElement(mobilenuberField,mnumber);

    }
    public void ClickOnRegister()
    {
        clickOnElement(Clickregisterbtn);

    }

}
