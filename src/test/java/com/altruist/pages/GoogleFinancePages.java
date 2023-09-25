package com.altruist.pages;

import com.altruist.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleFinancePages {

    public GoogleFinancePages(){

        WebDriver driver = null;
        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "(//input[@role='combobox'])[2]")
    public WebElement searchBox;

    @FindBy(xpath = "//div[contains(text(),'Previous close')]/parent::span/following-sibling::div")
    public WebElement getPreviousPrice;


    @FindBy(xpath = "//div[contains(text(),'Market cap')]/parent::span/following-sibling::div")
    public WebElement getMarketCap;

   // @FindBy( xpath = "(//*[@class='P6K39c'])[14]")
    @FindBy(css = "div[class='v5gaBd Yickn'] div:nth-child(6) div:nth-child(2)")
    public WebElement getEmployeeSize;

    @FindBy(xpath = "//div[normalize-space()='28.52']")
    public WebElement getRadioRate;







}
