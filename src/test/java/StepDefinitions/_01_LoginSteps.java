package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.BaseDriver;
import io.cucumber.java.en.*;
import org.testng.Assert;


public class _01_LoginSteps extends Parent {

    DialogContent dialogContent = new DialogContent();
    @Given("Navigate to Opencart")
    public void navigateToOpencart() {
        BaseDriver.getDriver().get("https://opencart.abstracta.us/index.php?route=account/login");
        BaseDriver.getDriver().manage().window().maximize();
    }

    @When("Enter the username and password and click login button")
    public void enterTheUsernameAndPasswordAndClickLoginButton() {
//        dialogContent.email.sendKeys("romasecure55555@gmail.com");
//        dialogContent.password.sendKeys("123456");
//        dialogContent.loginButton.click();
        sendKeysFunction(dialogContent.email, "romasecure55555@gmail.com");
        sendKeysFunction(dialogContent.password, "123456");
        clickFunction(dialogContent.loginButton);

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() throws InterruptedException {
//        Thread.sleep(2000);
//        Assert.assertTrue(dialogContent.myAccount.isDisplayed());
        verifyContainsTextFunction(dialogContent.myAccount, "My Account");
    }
}
