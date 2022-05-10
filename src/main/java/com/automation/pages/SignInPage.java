package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage extends Utility {

    public SignInPage(){
        PageFactory.initElements(driver,this);
    }

    //email =
    @FindBy (xpath = "//input[@id='email']")
    WebElement email;
    //password =
    @FindBy (xpath = "//input[@id='passwd']")
    WebElement password;
    //signin  =
    @FindBy (xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signin;
    //authentication =
    @FindBy (xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authentication;
    // new account = //input[@id='email_create']
    @FindBy (xpath = "//input[@id='email_create']")
    WebElement emailnewaccount;
    // createaccount =
    @FindBy (xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createaccount;
    // createaccountbutton =
    @FindBy (xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createaccountbutton;
    @FindBy (xpath = "//div[@class='alert alert-danger']//li")
    WebElement ErrorMessage;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signIntext;

    public void setEmail(String text) {
        Reporter.log("Enter email"+text+ " to email field "+email.toString() + "<br>");
        sendTextToElement(email,text);
    }
    public void setPassword(String text) {
        Reporter.log("Enter password"+text+ " to email field "+password.toString() + "<br>");
        sendTextToElement(password,text);
    }
    public void setSignin() {
        Reporter.log("Clicking on signIn button"+ signin.toString()+ "<br>");
        clickOnElement(signin);
    }
    public void setEmailNewAccount(String text) {

        sendTextToElement(emailnewaccount,text);}
    public String acuthentaication() {
        Reporter.log("getting authentication text from "+authentication.toString()+"<br>");
      return   getTextFromElement(authentication);
    }
    public void setCreateaccountbutton() {
        Reporter.log("Clicking on create account"+ createaccount.toString()+ "<br>");
        clickOnElement(createaccount);}
    public String createaccount() {
        Reporter.log("getting creat account text from "+createaccount.toString()+"<br>");
        return getTextFromElement(createaccount);
    }
    public String verifySignInText() {
        Reporter.log("getting signIn text from "+signIntext.toString()+"<br>");
        return getTextFromElement(signIntext);}


    public void sinInToApplication(String username, String password) {
        Reporter.log("Enter Username and password to"+username+ "" + password+ " to username and password "+signin.toString() + "<br>");
        setEmail(username);
        setPassword(password);
        setSignin();
    }
    public String getErrorMessage() {
        Reporter.log("getting error message text from "+ErrorMessage.toString()+"<br>");
        return getTextFromElement(ErrorMessage);
    }

}
