package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummerDressesPage extends Utility {
    private static final Logger log = LogManager.getLogger(SummerDressesPage.class.getName());

    public SummerDressesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressesLink;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
    WebElement summerDressesLink;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement mouseHoover;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
    WebElement addToCart;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
    WebElement proceedToCheckoutLink1;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
    WebElement proceedToCheckoutLink2;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passWordField;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement signIn;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement proceedToCheckoutLink3;

    @FindBy(xpath = "//input[@id='cgv']")
    WebElement termsOfServices;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement proceedToCheckoutLink4;

    @FindBy(partialLinkText = "Pay by bank wi")
    WebElement payByBankWire;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement iConfirmMyOrder;

    @FindBy(xpath = "//h1[contains(text(),'Order confirmation')]")
    WebElement orderConfirmation;

    public void mouseHooverOnDressesLink() {
        pmMouseHoverNoClick(dressesLink);
        log.info("Mouse hoover on dresses link : " + dressesLink);
    }

    public void clickOnSummerDresses() {
        pmMouseHoverAndClick(summerDressesLink);
        log.info("Click on summer dresses : " + summerDressesLink);
    }

    public void scrollPageDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 800);");
    }

    public void mouseHooverOnProduct() {
        pmMouseHoverNoClick(mouseHoover);
        log.info("Mouse hoover on product : " + mouseHoover);
    }

    public void clickOnAddToCart() {
        pmClickOnElement(addToCart);
        log.info("Click on  add to cart : " + addToCart);
    }

    public void clickOnProceedToCheckoutLink1() {
        pmClickOnElement(proceedToCheckoutLink1);
        log.info("Click on proceed to checkout link1 : " + proceedToCheckoutLink1);
    }

    public void clickOnProceedToCheckoutLink2() {
        pmClickOnElement(proceedToCheckoutLink2);
        log.info("Click on proceed to checkOut link2 : " + proceedToCheckoutLink2);
    }

    public void enterEmailAddress(String email) {
        pmSendTextToElement(emailField, email);
        log.info("Enter email address : " + emailField);
    }

    public void enterPassWord(String password) {
        pmSendTextToElement(passWordField, password);
        log.info("Enter password : " + passWordField);
    }

    public void clickOnSign() {
        pmClickOnElement(signIn);
        log.info("Click on sign : " + signIn);
    }

    public void clickOnProceedToCheckoutLink3() {
        pmClickOnElement(proceedToCheckoutLink3);
        log.info("Click on proceed to checkout link3 : " + proceedToCheckoutLink3);
    }

    public void clickOnTermOfServicesButton() {
        pmClickOnElement(termsOfServices);
        log.info("Click on term of services button : " + termsOfServices);
    }

    public void clickOnProceedToCheckoutLink4() {
        pmClickOnElement(proceedToCheckoutLink4);
        log.info("Click on proceed checkout link4 : " + proceedToCheckoutLink4 );
    }

    public void payByBankWireLink() {
        pmClickOnElement(payByBankWire);
        log.info("Pay by bank wire link : " + payByBankWire);
    }

    public void clickOnIConfirmMyOrderLink() {
        pmClickOnElement(iConfirmMyOrder);
        log.info("Click On i confirm my order link : " + iConfirmMyOrder );
    }

    public String verifyOrderConfirmation() {
        log.info("Verify order confirmation : " + orderConfirmation);
        return pmGetTextFromElement(orderConfirmation);

    }


}
