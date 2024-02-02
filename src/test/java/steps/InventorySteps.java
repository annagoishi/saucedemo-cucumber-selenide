package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import pages.InventoryPage;

import static com.codeborne.selenide.Condition.visible;

public class InventorySteps {
    InventoryPage inventoryPage = new InventoryPage();
    @Then("^I am on the page Inventory$")
    public void iAmOnThePageInventory() {
        inventoryPage.inventoryList.shouldBe(visible);
    }
}
