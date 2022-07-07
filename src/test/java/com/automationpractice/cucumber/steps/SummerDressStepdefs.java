package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.SummerDressesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SummerDressStepdefs {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
    }

    @When("^I mouse hoover on dresses link$")
    public void iMouseHooverOnDressesLink() {
        new SummerDressesPage().mouseHooverOnDressesLink();
    }

    @And("^I click on summer dresses$")
    public void iClickOnSummerDresses() {
        new SummerDressesPage().clickOnSummerDresses();
    }

    @And("^I scroll down to pic$")
    public void iClickOnPic() {
        new SummerDressesPage().scrollPageDown();
        new SummerDressesPage().mouseHooverOnProduct();
    }

    @And("^I mouse hoover on pic and click on Add to cart$")
    public void iMouseHooverAndClickOnAddToCart() {
        new SummerDressesPage().clickOnAddToCart();
    }


    @And("^I click on Proceed to checkout link$")
    public void iClickOnProceedToCheckoutLink() {
        new SummerDressesPage().clickOnProceedToCheckoutLink1();
    }

    @And("^I click on Proceed to checkout again$")
    public void iClickOnProceedToCheckoutAgain() {
        new SummerDressesPage().clickOnProceedToCheckoutLink2();
    }

    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email) {
        new SummerDressesPage().enterEmailAddress(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String passw) {
        new SummerDressesPage().enterPassWord(passw);

    }

    @And("^I Click on sign in button$")
    public void iClickOnSignInButton() {
        new SummerDressesPage().clickOnSign();
    }

    @And("^I click on Proceed to checkout link (\\d+)rd time$")
    public void iClickOnProceedToCheckoutLinkRdTime(int arg0) {
        new SummerDressesPage().clickOnProceedToCheckoutLink3();
    }

    @And("^I click on checkbox of agree terms & condition$")
    public void iClickOnCheckboxOfAgreeTermsCondition() {
        new SummerDressesPage().clickOnTermOfServicesButton();
    }

    @And("^I click on Proceed to checkout again (\\d+)th time$")
    public void iClickOnProceedToCheckoutAgainThTime(int arg0) {
        new SummerDressesPage().clickOnProceedToCheckoutLink4();
    }

    @And("^I click on pay by bank wire link$")
    public void iClickOnPayByBankWireLink() {
        new SummerDressesPage().payByBankWireLink();
    }

    @And("^I click on confirm my order$")
    public void iClickOnConfirmMyOrder() {
        new SummerDressesPage().clickOnIConfirmMyOrderLink();
    }

    @Then("^I can see \"([^\"]*)\" message$")
    public void iCanSeeMessage(String message) {
        Assert.assertEquals(message, new SummerDressesPage().verifyOrderConfirmation());
    }
}
