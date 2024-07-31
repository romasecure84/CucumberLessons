package StepDefinitions;

import Pages.DialogContent;
import Pages.HeaderContent;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_DataTableSteps extends Parent {
    HeaderContent hc = new HeaderContent();
    DialogContent dc = new DialogContent();

    @When("Enter item name as DataTable")
    public void enterItemNameAsDataTable(DataTable dataTable) {
        List<String> itemList = dataTable.asList(String.class);

        for (String s : itemList) {
            sendKeysFunction(hc.searchBox, s);
            clickFunction(hc.searchButton);
            clickFunction(dc.addToCartButton);
            hc.searchBox.clear();
        }
    }

}