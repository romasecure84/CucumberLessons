package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.HeaderContent;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _03_AddItemNameWithParameter extends Parent {
    DialogContent dc = new DialogContent();
    HeaderContent hc = new HeaderContent();
    FormContent fc = new FormContent();

    @When("Enter itemName {string}")
    public void enterItemName(String itemName) {
        sendKeysFunction(hc.searchBox, itemName);
        clickFunction(hc.searchButton);
    }

}
