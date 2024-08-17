package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _09_ScenarioOutlineSteps extends Parent {
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();
    @And("User sending username and password")
    public void userSendingUsernameAndPassword(DataTable dt) {
        List<List<String>> userAccountList = dt.asLists(String.class);

        WebElement element1 = dc.getWebElement(userAccountList.getFirst().get(0));
        sendKeysFunction(element1, userAccountList.getFirst().get(1));
        WebElement element2 = dc.getWebElement(userAccountList.get(1).get(0));
        sendKeysFunction(element2, userAccountList.get(1).get(1));
    }
}
