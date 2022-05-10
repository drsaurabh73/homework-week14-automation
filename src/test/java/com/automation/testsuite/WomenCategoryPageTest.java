package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;
    MyAccount myAccount;
    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;


    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        signInPage = new SignInPage();
       myAccount = new MyAccount();
        createAccountPage = new CreateAccountPage();
       womenCategoryPage = new WomenCategoryPage();
       productPage = new ProductPage();
    }
        @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully() {
            SoftAssert softAssert = new SoftAssert();
            homePage.clickOnWomenTab();
            System.out.println(womenCategoryPage.verifyWomenText());

            softAssert.assertEquals(womenCategoryPage.verifyWomenText(), "WOMEN", "");

            softAssert.assertAll();


        }
        @Test(dataProvider = "shoppingchoice", dataProviderClass = TestData.class,groups = {"smoke","regression"})
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product,String qty,String size,String colour) throws InterruptedException {
        homePage.clickOnWomenTab();

        womenCategoryPage.selectProduct(product);
        productPage.setClearQuantity();
        productPage.setChangeQuantity(qty);
        productPage.setSizedrop(size);
        Thread.sleep(1000);
       productPage.selectProduct(colour);
       Thread.sleep(1200);
        productPage.clickOnCart();
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(productPage.verifyProductSuccessfullyAddedToYourShoppingCart(),"Product successfully added to your shopping cart","");
            productPage.clickOnClose();




        }



}
