package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver,this);
    }


    @FindBy (xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement WomenLink;
    @FindBy (xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement Dresses;
    @FindBy(xpath  = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement TShirt;
    @FindBy (xpath = "//a[contains(text(),'Sign in')]")
    WebElement SignIn;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement logo;



    public void clickOnWomenTab () {

        Reporter.log("Clicking on Womenlink"+ WomenLink.toString()+ "<br>");
        clickOnElement(WomenLink);
    }
    public void clickOnDressesTab() {

        Reporter.log("Clicking on Dresses"+ TShirt.toString()+ "<br>");
        clickOnElement(Dresses);
    }
    public void clickOnTShirtTab() {

        Reporter.log("Clicking on T shirt"+ TShirt.toString()+ "<br>");
        clickOnElement(TShirt);
    }
    public void clickOnSignInTab() {

        Reporter.log("Clicking on signIn button"+ SignIn.toString()+ "<br>");
        clickOnElement(SignIn);
    }
    public void clickOnLogo () {

        Reporter.log("Clicking on logo"+ logo.toString()+ "<br>");
        clickOnElement(logo);
    }

}
