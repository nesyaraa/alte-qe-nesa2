package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.example.pageObject.InventoryPage;
import org.example.pageObject.LoginPage;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps() {
        super();
        this.webDriver = step_definitions.Hooks.webDriver;
    }

    @And("User select \"(.*)\" to Filter Product")
    public void filterProduct(String filter) {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.filterProductBy(filter);
    }

    @And("User pick item Sauce Labs Onesie and T-shirt Red")
    public void clickItemBasket1() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickBasket1();
        inventoryPage.clickBasket2();
        Thread.sleep(5000);
    }

    @And("User click cart button")
    public void clickcartIcon() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickCartIcon();
        Thread.sleep(5000);
    }

    @And("User remove item T-shirt Red on Cart Page")
    public void clickremoveicon() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickRemoveBasket2();
        Thread.sleep(5000);
    }

    @And("User click Check Out Button on Cart Page")
    public void klikCO() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickCheckout();
        Thread.sleep(5000);
    }

    @When("User input \"(.*)\" as userName, input \"(.*)\" as password and \"(.*)\" as postal code")
    public void inputInfromation(String First, String Last, String Code) {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.setFirstName(First);
        inventoryPage.setlastName(Last);
        inventoryPage.postalCode(Code);
    }
    @And("User click Continue Button")
    public void klikContinue() throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickContinue();
        Thread.sleep(5000);
    }

    @And("User click Finish Button")
    public void klikFinish() throws InterruptedException{
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickFinish();
    }
}

