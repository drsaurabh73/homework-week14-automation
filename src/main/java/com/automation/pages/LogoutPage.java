package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LogoutPage extends Utility {

    public LogoutPage() {
        PageFactory.initElements(driver,this);
    }

    //logout
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement logout;
    public String verifyLogOutText() {
        Reporter.log("getting logout text from "+logout.toString()+"<br>");
        return getTextFromElement(logout);
    }
}
