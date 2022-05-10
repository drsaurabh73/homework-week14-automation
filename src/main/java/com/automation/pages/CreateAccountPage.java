package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreateAccountPage extends Utility {

    public CreateAccountPage() {

        PageFactory.initElements(driver,this);
    }

    // radioButton =

    @FindBy (xpath = "//input[@id='id_gender1']")
    WebElement radioButton;
    public void clickOnRadioButton() {
        Reporter.log("Clicking on Radio Button" + radioButton.toString() + "<br>");
        clickOnElement(radioButton);
    }
    // firstname =
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstname;
    public void setFirstname(String text) {
        Reporter.log("getting firstname text from "+firstname.toString()+"<br>");
        sendTextToElement(firstname,text);
    }
    // lastname =
    @FindBy (xpath = "//input[@id='customer_lastname']")
    WebElement lastname;
    public void setLastname(String text) {
        Reporter.log("getting lastname text from "+lastname.toString()+"<br>");
        sendTextToElement(lastname,text);
    }
    // email  =
    @FindBy (xpath = "//input[@id='email']")
    WebElement email;
    public void setEmail(String text) {
        Reporter.log("enter email " + text + " to email field " + "<br>");
        sendTextToElement(email,text);
    }
    // password  =
    @FindBy (xpath = "//input[@id='passwd']")
    WebElement password;
    public void setPassword(String text) {
        sendTextToElement(password,text);
    }
    // dateofBirth =
    @FindBy (xpath = "//select[@id='days']")
    WebElement dateofBirth;
    public void setDateofBirth(String text) {
        Reporter.log("Selecting day" + text + "from dropdown" + dateofBirth.toString() + "<br>");
        selectByValueFromDropDown(dateofBirth,text);
    }
    // monthOfBirth =
    @FindBy (xpath = "//select[@id='months']" )
    WebElement monthofBirth;
    public void setMonthofBirth(String text) {
        Reporter.log("Selecting month" + text + "from Dropdown" + monthofBirth.toString() +"<br>");
        selectByValueFromDropDown(monthofBirth,text);
    }

    // yearofBirth =
    @FindBy(xpath = "//select[@id='years']")
    WebElement yearofBirth;
    public void setYearofBirth(String text) {
        Reporter.log("Selecting month" + text + "from Dropdown" + yearofBirth.toString() +"<br>");
        selectByValueFromDropDown(yearofBirth,text);
    }
    // newletter =
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletter;
    public void setNewsletter() {
        Reporter.log("Clicking on newsletterbox"+ newsletter.toString()+ "<br>");
        clickOnElement(newsletter);
    }
    // specialoffer =
    @FindBy(xpath = "//input[@id='optin']")
    WebElement specialoffer;
    public void setSpecialoffer() {
        Reporter.log("Clicking on specialoffer"+ specialoffer.toString()+ "<br>");
        clickOnElement(specialoffer);
    }
    // nameaddress =
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement nameaddress;
    public void setNameaddress(String text) {
        Reporter.log("Enter name to deliver"+text+ " to email field "+nameaddress.toString() + "<br>");
        sendTextToElement(nameaddress,text);
    }
    //lastaddress =
    @FindBy (xpath = "//input[@id='lastname']")
    WebElement lastaddress;
    public void setLastaddress(String text) {
        Reporter.log("Enter last name to deliver"+text+ " to email field "+lastaddress.toString() + "<br>");
        sendTextToElement(lastaddress,text);
    }
    // company =
    @FindBy(xpath = "//input[@id='company']")
    WebElement company;
    public void setCompany(String text) {
        Reporter.log("Enter name to company"+text+ " to email field "+company.toString() + "<br>");
        sendTextToElement(company, text);
    }
    // streetname =
    @FindBy(xpath = "//input[@id='address1']")
    WebElement streetname;
    public void setStreetname(String text) {
        Reporter.log("Enter street name to deliver"+text+ " to email field "+streetname.toString() + "<br>");
        sendTextToElement(streetname,text);
    }
    // addressline2 =
    @FindBy (xpath = "//input[@id='address2']")
    WebElement addressline2;
    public void setAddressline2(String text) {
        Reporter.log("Enter address line2 to deliver"+text+ " to email field "+addressline2.toString() + "<br>");
        sendTextToElement(addressline2,text);
    }
    // city =
    @FindBy (xpath = "//input[@id='city']")
    WebElement city;
    public void setCity(String text){
        Reporter.log("Enter city name to deliver"+text+ " to email field "+city.toString() + "<br>");
        sendTextToElement(city,text);
    }

    // state  =
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;
    public void setState(String text) {
        Reporter.log("Enter state name to deliver"+text+ " to email field "+state.toString() + "<br>");
        selectByVisibleTextFromDropDown(state,text);
    }
       // postcode =
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement postcode;
    public void setPostcode(String text) {
        Reporter.log("Enter post code to deliver"+text+ " to email field "+postcode.toString() + "<br>");
        sendTextToElement(postcode,text);
    }
    // country =
    @FindBy (xpath = "//select[@id='id_country']")
    WebElement country;
    public void setCountry(String text) {
        Reporter.log("Selecting country"+text+" from dropdown "+country.toString() + "<br>");
        selectByVisibleTextFromDropDown(country,text);
    }
    // additionalinfo =
    @FindBy (xpath = "//textarea[@id='other']")
    WebElement additionalinfo;
    public void setAdditionalinformation(String text){
        Reporter.log("sending Additional information"+text+" from dropdown "+additionalinfo.toString() + "<br>");
        sendTextToElement(additionalinfo,text);
    }
    // homephone =
    @FindBy (xpath = "//input[@id='phone']")
    WebElement homephone;
    public void setHomephone(String text) {
        Reporter.log("Enter homephone number"+text+ " to email field "+homephone.toString() + "<br>");

        sendTextToElement(homephone,text);
    }
    // mobilenumber =
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilenumber;
    public void setMobilenumber(String text) {
        Reporter.log("Enter mobile number"+text+ " to email field "+mobilenumber.toString() + "<br>");

        sendTextToElement(mobilenumber,text);
    }
    // assignref =
    @FindBy(xpath = "//input[@id='alias']")
    WebElement assinref;
    public void setAssignAnAddressForFuture(String text) {
        Reporter.log("Enter assign ref"+text+ " to email field "+assinref.toString() + "<br>");

        sendTextToElement(assinref,text);
    }
    // register =
    @FindBy (xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement register;
    public void setRegister() {

        Reporter.log("Clicking on register"+ register.toString()+ "<br>");
        clickOnElement(register);
    }
}
