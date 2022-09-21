package com.automation.Steps;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomanCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WomanCategoryStep {
    @When("^I click on Woman Tab$")
    public void iClickOnWomanTab() {
        new HomePage().clickOnWomenTab();

    }

    @And("^Verify \"([^\"]*)\" Tab$")
    public void verifyTab(String womanT) {

        Assert.assertEquals(womanT,new WomanCategoryPage().VerifyWomanText());

    }

    @And("^I click on product \"([^\"]*)\"$")
    public void iClickOnProduct(String product)
    {
        new ProductPage().selectedProductOne(product);

    }

    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qun)
    {
        new ProductPage().enterQuntity(qun);

    }

    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String Psize)
    {
        new ProductPage().selectSizeProduct(Psize);

    }

    @And("^I select colour \"([^\"]*)\"$")
    public void iSelectColour(String Pcolor)
    {
        new ProductPage().selectColorProduct(Pcolor);

    }

    @And("^I click on Add to Cart Button$")
    public void iClickOnAddToCartButton() {

        new ProductPage().clickAddtocartButton();

    }

    @Then("^I close popup display$")
    public void iClosePopupDisplay() {
        new ProductPage().clickToClosePopupDishplay();

    }
}
