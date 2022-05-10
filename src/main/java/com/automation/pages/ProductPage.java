package com.automation.pages;


import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProductPage extends Utility {

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    // product
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]")
    WebElement product;
    public void setProduct(){
        clickOnElement(product);
    }

    // clear qty
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement clearQuantity;

    public void setClearQuantity() {
        clearTextToElement(clearQuantity);// clear quantity
    }
    // qty =
//    @FindBy(xpath = "//input[@id='quantity_wanted']")
//    WebElement changeQuantity;

    public void setChangeQuantity(String text) {
        sendTextToElement(clearQuantity, text);
    }
    // size drop =
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement sizedrop;

    public void setSizedrop(String text) {
        selectByVisibleTextFromDropDown(sizedrop, text);
    }

    //white =
    @FindBy(xpath = "//a[@name='White']")
    WebElement white;
    //Orange
    @FindBy(xpath = "//a[@title='Orange']")
    WebElement orange;

    //Green
    @FindBy(xpath = "//a[@title='Green']")
    WebElement green;

    //blue
    @FindBy(xpath = "//a[@title='Blue']")
    WebElement blue;


   // public void setColour() {
//        clickOnElement(colour);
//    }
    // add to cart
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addtocart;
    public void clickOnCart() {
        clickOnElement(addtocart);
    }

    // verify product successfully added to your shopping cart
    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")
    WebElement actualMessage1;

    public String verifyProductSuccessfullyAddedToYourShoppingCart() {
        return getTextFromElement(actualMessage1);
    }

    // click on close
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
    WebElement close;

    public void clickOnClose() {
        clickOnElement(close);
    }

public void selectProduct(String text) {
    if(text == "White") {
        Reporter.log("Clicking on colour " + white.toString());
        clickOnElement(white);
    }

    if(text == "Orange") {
        Reporter.log("Clicking on Printed Dress " + orange.toString());
        clickOnElement(orange);
    }
    if(text == "Green") {
        Reporter.log("Clicking on Printed Chiffon Dress " + green.toString());
        clickOnElement(green);
    }
    if(text == "Blue") {
        Reporter.log("Clicking on Printed Summer Dress with Price tag $28.98 " + blue.toString());
        clickOnElement(blue);
    }
}
}




