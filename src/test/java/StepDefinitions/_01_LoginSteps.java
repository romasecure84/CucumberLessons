package StepDefinitions;

import io.cucumber.java.en.*;

public class _01_LoginSteps {
    @Given("Navigate to Opencart")
    public void navigateToOpencart() {
        System.out.println("Opened Opencart");
    }

    @When("Enter the username and password and click login button")
    public void enterTheUsernameAndPasswordAndClickLoginButton() {
        System.out.println("Login");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        System.out.println("Login successfully");
    }
}
