package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    public static WebDriver driver;

    public InventoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basketItem1;

    public void clickBasket1(){
        basketItem1.click();
    }

    @FindBy (xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement basketItem2;

    public void clickBasket2(){
        basketItem2.click();
    }

    public void filterProductBy(String filter){
        Select b = new Select (driver.findElement(By.xpath("//select[@class='product_sort_container']")));
        b.selectByVisibleText(filter);
    }

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement cartIcon;

    public void clickCartIcon(){
        cartIcon.click();
    }
    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeBasket2;
    public void clickRemoveBasket2(){
        removeBasket2.click();
    }

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkout;
    public void clickCheckout(){
        checkout.click();
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    public void setFirstName(String First){
        firstName.sendKeys(First);
    }

    @FindBy (xpath = "//input[@id='last-name']")
    private WebElement lastName;

    public void setlastName(String Last){
        lastName.sendKeys(Last);
    }

    @FindBy (xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    public void postalCode (String Code){
        postalCode.sendKeys(Code);
    }

    @FindBy (xpath = "//input[@id='continue']")
    private WebElement Continue;

    public void clickContinue(){
        Continue.click();
    }

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement Finish;
    public void clickFinish(){
        Finish.click();
    }



}