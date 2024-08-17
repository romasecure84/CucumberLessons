package StepDefinitions;

import Pages.HeaderContent;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _10_AddNewItemWithSOSteps extends Parent {
    HeaderContent hc = new HeaderContent();
    @When("Add new item with SO")
    public void addNewItemWithSO(DataTable dt) {
        List<List<String>> searchInputList = dt.asLists(String.class);

        WebElement element = hc.getWebElement(searchInputList.get(0).get(0));
        sendKeysFunction(element, searchInputList.get(0).get(1));
        
    }

    @And("Click to HeaderContent element with Data Table")
    public void clickToHeaderContentElementWithDataTable(DataTable dt) {
        List<String> buttonList = dt.asList(String.class);

        for (String s : buttonList) {
            WebElement element = hc.getWebElement(s);
            clickFunction(element);
        }


    }
}
