package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.HeaderContent;
import Pages.Parent;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class _04_AddNewItemParametersSteps extends Parent {
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();
    HeaderContent hc = new HeaderContent();
    @Given("Click addressBook button")
    public void clickAddressBookButton() {
        clickFunction(dc.addressBookLink);
        clickFunction(dc.newAddressButton);
    }

    @And("Enter firstName {string} and lastName {string}")
    public void enterFirstNameAndLastName(String firstName, String lastName) {

        sendKeysFunction(fc.firstNameShield, firstName);
        sendKeysFunction(fc.lastNameShield, lastName);

    }

    @And("Full form and click continue button")
    public void fullFormAndClickContinueButton() throws InterruptedException {
        Faker faker = new Faker();

        sendKeysFunction(fc.companyNameShield, faker.company().name());
        sendKeysFunction(fc.addressShield, faker.address().fullAddress());
        sendKeysFunction(fc.cityShield, "Texas");
        sendKeysFunction(fc.postCodeShield, faker.address().zipCode());
        Select select = new Select(fc.selectCountry);
        select.selectByVisibleText("United States");
        Select select1 = new Select(fc.selectState);
        Thread.sleep(2000);
        select1.selectByIndex(10);
        clickFunction(fc.continueButton);
    }

    @Then("Should be added address")
    public void shouldBeAddedAddress() {
        verifyContainsTextFunction(dc.successMessage, "added");
    }
}
