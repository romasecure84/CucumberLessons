package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _08_AddDeleteAddressSteps extends Parent {
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();
    @When("Enter username and password with Data Table")
    public void enterUsernameAndPasswordWithDataTable(DataTable dt) {
        List<List<String>> loginInfo = dt.asLists(String.class);

        for (int i = 0; i < loginInfo.size(); i++){
            WebElement element = dc.getWebElement(loginInfo.get(i).get(0));
            sendKeysFunction(element,loginInfo.get(i).get(1));
        }
    }

    @And("Enter text to webElement in address line")
    public void enterTextToWebElementInAddressLine(DataTable dt) {
        List<List<String>> addressInfo = dt.asLists(String.class);

        for (int i = 0; i < addressInfo.size(); i++){
            WebElement element = fc.getWebElement(addressInfo.get(i).get(0));
            sendKeysFunction(element,addressInfo.get(i).get(1));
        }
    }

    @And("Select country and zone")
    public void selectCountryAndZone(DataTable dt) {
         List<List<String>> zoneInfo = dt.asLists(String.class);

         for (int i = 0; i <  zoneInfo.size(); i++){
             WebElement element = fc.getWebElement(zoneInfo.get(i).get(0));
             Select select = new Select(element);
             select.selectByVisibleText(zoneInfo.get(i).get(1));

         }
    }

    @Then("Should be deleted new address")
    public void shouldBeDeletedNewAddress() {
        verifyContainsTextFunction(dc.successMessage, "deleted");
    }

    @And("Click to DialogContent element with Data Table")
    public void clickToDialogContentElementWithDataTable(DataTable buttons) {
        List<String> buttonList = buttons.asList(String.class);
        for (int i = 0; i < buttonList.size(); i++){
            WebElement element = dc.getWebElement(buttonList.get(i));
            clickFunction(element);
        }
    }
}
