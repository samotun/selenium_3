package com.altruist.test;

import com.altruist.pages.GoogleFinancePages;
import com.altruist.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.altruist.utilities.Driver.getDriver;

public class GoogleFinanceTest {

    @Test
    public void displayGoogleThicker() throws InterruptedException {

        getDriver().get("https://www.google.com/finance");
        GoogleFinancePages googleFinancePages = new GoogleFinancePages();
        Assert.assertTrue(getDriver().getTitle().contains("Google Finance"), "the page is not loaded as expected");
        Actions action = new Actions(getDriver());
        action.sendKeys(googleFinancePages.searchBox, "GOOGL").sendKeys(Keys.RETURN).perform();
        System.out.println( "Previous price :" + googleFinancePages.getPreviousPrice.getText());
        System.out.println( "Market cap     :" + googleFinancePages.getMarketCap.getText());
        Thread.sleep(4000);
        System.out.println( "Employee size  :" + googleFinancePages.getEmployeeSize.getText());
       // Thread.sleep(2000);
        System.out.println( "P/E Ratio      :" + googleFinancePages.getRadioRate.getText());
        Driver.closeDriver();


    }
}
