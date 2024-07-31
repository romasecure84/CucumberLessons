package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _06_DataTableMultiSteps {
    @And("Send this items with DataTable")
    public void sendThisItemsWithDataTable(DataTable dt) {
        List<List<String>> productModelList = dt.asLists(String.class);

        for (int i = 0; i < productModelList.size(); i++){
            System.out.println(productModelList.get(i).get(0) + " " + productModelList.get(i).get(1) + " " + productModelList.get(i).get(2));
        }
    }
}
