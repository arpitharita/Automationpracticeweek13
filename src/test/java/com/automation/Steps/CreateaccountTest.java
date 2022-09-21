package com.automation.Steps;

import com.automation.pages.CreateAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CreateaccountTest {
    @And("^I Enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)
    {
        new CreateAccountPage().EnterEmailId(email);
    }

    @And("^I click on create an account button$")
    public void iClickOnCreateAnAccountButton() {
        new CreateAccountPage().ClickOnCreateAcc();

    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String Fname)
    {
        new CreateAccountPage().EnterFirstName(Fname);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String Lname)
    {
        new CreateAccountPage().EnterLastName(Lname);

    }

    @And("^I enter register password \"([^\"]*)\"$")
    public void iEnterRegisterPassword(String Fpass)
    {
        new CreateAccountPage().Enterpassword(Fpass);

    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String add)
    {
        new CreateAccountPage().EnterAddress(add);

    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city)
    {
        new CreateAccountPage().EnterCity(city);

    }

    @And("^I enter postsl code \"([^\"]*)\"$")
    public void iEnterPostelCode(String Pcode)
    {
        new CreateAccountPage().EnterPostalCode(Pcode);

    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String Phonenum)
    {
        new CreateAccountPage().EnterMobileNumber(Phonenum);

    }

    @Then("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().ClickOnRegister();

    }

    @And("^I select state \"([^\"]*)\"$")
    public void iSelectState(String state)  {

        new CreateAccountPage().SelectState(state);
    }

    @And("^I select country \"([^\"]*)\"$")
    public void iSelectCountry(String country)
    {
       new CreateAccountPage().SelectCountry(country);
    }
}
