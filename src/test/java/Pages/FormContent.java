package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent {
    public FormContent(){
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "input-firstname")
    public WebElement firstNameShield;

    @FindBy(id = "input-lastname")
    public WebElement lastNameShield;

    @FindBy(id = "input-company")
    public WebElement companyNameShield;

    @FindBy(id = "input-address-1")
    public WebElement addressShield;

    @FindBy(id = "input-city")
    public WebElement cityShield;

    @FindBy(id = "input-postcode")
    public WebElement postCodeShield;

    @FindBy(id = "input-country")
    public WebElement selectCountry;

    @FindBy(css = "select#input-zone")
    public WebElement selectState;

    @FindBy(css = "input[value='Continue']")
    public WebElement continueButton;
}
