package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WomenCategoryPage extends Utility {

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    //women text =
    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement women;

    public String verifyWomenText() {
        Reporter.log("getting verify women text from "+women.toString()+"<br>");
        return getTextFromElement(women);
    }

    // tops =
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement tops;

    public void setTops() {
        Reporter.log("Clicking on tops"+ tops.toString()+ "<br>");
        clickOnElement(tops);
    }

    // dresses =
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement dresses;

    public void setDresses() {
        Reporter.log("Clicking on Dresses"+ dresses.toString()+ "<br>");
        clickOnElement(dresses);
    }

    //sortby =
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortby;

    public void clickonSortBy() {
        Reporter.log("Clicking on sory by"+ sortby.toString()+ "<br>");
        clickOnElement(sortby);
    }

    // listproduct =
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[3]/div[1]/ul[1]/li[3]/a[1]/i[1]")
    WebElement listproduct;

    public void clickOnListProduct() {
        Reporter.log("Clicking on List of products"+ listproduct.toString()+ "<br>");
        clickOnElement(listproduct);
    }

    // blouse
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]")
    WebElement blouse;
    // Printed Dress
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedDress;
    // Printed Chiffon Dress
    @FindBy(xpath = "//a[contains(text(),'Printed Chiffon Dress')]")
    WebElement printedChiffonDress;
    // Printed Summer Dress with Price $28.98
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedSummerDress;


    public void selectProduct(String text){

        if(text == "Blouse") {
            Reporter.log("Clicking on Blouse " + blouse.toString());
            Reporter.log("getting signout text from "+blouse.toString()+"<br>");
            clickOnElement(blouse);
        }

        if(text == "Printed Dress") {
            Reporter.log("Clicking on Printed Dress " + printedDress.toString());

            clickOnElement(printedDress);
        }
        if(text == "Printed Chiffon Dress") {
            Reporter.log("Clicking on Printed Chiffon Dress " + printedChiffonDress.toString());

            clickOnElement(printedChiffonDress);
        }
        if(text == "Printed Summer Dress with Price $28.98") {
            Reporter.log("Clicking on Printed Summer Dress with Price tag $28.98 " + printedSummerDress.toString());
            clickOnElement(printedSummerDress);
        }
    }

    }







