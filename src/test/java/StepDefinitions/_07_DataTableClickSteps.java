package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.HeaderContent;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _07_DataTableClickSteps extends Parent {
    HeaderContent hc = new HeaderContent();
    FormContent fc = new FormContent();
    @When("Enter item name {string}")
    public void enterItemName(String itemName) {
        sendKeysFunction(hc.searchBox, itemName);
    }

    @And("Click to element with Data Table")
    public void clickToElementWithDataTable(DataTable buttons) {
        List<String> buttonList = buttons.asList(String.class);
        for (int i = 0; i < buttonList.size(); i++){
            WebElement element = fc.getWebElement(buttonList.get(i));
            clickFunction(element);
        }
    }
}
