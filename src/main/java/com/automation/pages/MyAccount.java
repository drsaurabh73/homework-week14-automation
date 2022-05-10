package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class MyAccount extends Utility {

    public MyAccount() {
        PageFactory.initElements(driver,this);
    }


    // my account
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myaccount;
    public String verifyMyAccount() {
        Reporter.log("getting Myaccount text from "+myaccount.toString()+"<br>");
        return getTextFromElement(myaccount);
    }
}
