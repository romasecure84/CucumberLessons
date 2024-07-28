package StepDefinitions;

import Pages.DialogContent;
import Pages.HeaderContent;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _02_AddItemSteps extends Parent {
    DialogContent dc = new DialogContent();
    HeaderContent hc = new HeaderContent();
    @And("Enter item name to search box and click search button")
    public void enterItemNameToSearchBoxAndClickSearchButton() {
        sendKeysFunction(hc.searchBox, "ipod");
        clickFunction(hc.searchButton);
    }

    @When("Add to cart check")
    public void addToCartCheck() {
        clickFunction(dc.ipod4AddToCartButton);
    }

    @Then("Should be added new item in Shopping Cart")
    public void shouldBeAddedNewItemInShoppingCart() {
        verifyContainsTextFunction(hc.shoppingCart, "100");
        Assert.assertTrue(stringToDoubleConverter(hc.shoppingCart)>0);
        System.out.println(hc.shoppingCart.getText());
        System.out.println(stringToDoubleConverter(hc.shoppingCart));
    }
}
