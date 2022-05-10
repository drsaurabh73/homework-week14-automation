package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class SignPageTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    LogoutPage logoutPage;
    MyAccount accountPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        signInPage = new SignInPage();
         accountPage = new MyAccount();
        createAccountPage = new CreateAccountPage();
        logoutPage = new LogoutPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void userShouldNavigateToSignInPageSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnSignInTab();

        softAssert.assertEquals(signInPage.acuthentaication(), "AUTHENTICATION", "");
        softAssert.assertAll();
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class,groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password, String message) {
        homePage.clickOnSignInTab();
        signInPage.sinInToApplication(username, password);

        Assert.assertEquals(signInPage.getErrorMessage(), message, "");


    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homePage.clickOnSignInTab();
        signInPage.setEmail("sam123@gmail.com");
        signInPage.setPassword("123456");
        signInPage.setSignin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(logoutPage.verifyLogOutText(),"Sign out","");


    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnSignInTab();
        signInPage.setEmail("sam123@gmail.com");
        signInPage.setPassword("123456");
        signInPage.setSignin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(signInPage.verifySignInText(),"Sign in","");

    }


}
