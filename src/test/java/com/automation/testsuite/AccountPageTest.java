package com.automation.testsuite;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountPageTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        //  accountPage = new AccountPage();
        createAccountPage = new CreateAccountPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {

        homePage.clickOnSignInTab();
        signInPage.setEmailNewAccount("sampatil123_45@gmail.com");
        signInPage.setCreateaccountbutton();
        Thread.sleep(1000);
        createAccountPage.clickOnRadioButton();
        createAccountPage.setFirstname("sam");
        createAccountPage.setLastname("patil");
        createAccountPage.setPassword("123456@");
        createAccountPage.setDateofBirth("10");
       createAccountPage.setMonthofBirth("9");
        createAccountPage.setYearofBirth("2000");
        createAccountPage.setNewsletter();
        createAccountPage.setSpecialoffer();
        createAccountPage.setNameaddress("sam");
        createAccountPage.setLastaddress("patil");
        createAccountPage.setCompany("Mota");
        createAccountPage.setStreetname("West field Avenue");
        createAccountPage.setAddressline2("North London");
        createAccountPage.setCountry("United States");
        createAccountPage.setState("Texas");
        createAccountPage.setCity("London");

        createAccountPage.setPostcode("22235");

        createAccountPage.setAdditionalinformation("Deiliver next door if no one home");
        createAccountPage.setHomephone("020888899977");
        createAccountPage.setMobilenumber("075888999555");
        createAccountPage.setAssignAnAddressForFuture("Leicester");
        createAccountPage.setRegister();


    }

}
