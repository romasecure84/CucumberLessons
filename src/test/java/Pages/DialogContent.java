package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent {

    public DialogContent(){
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "input#input-email")
    public WebElement email;

    @FindBy(id = "input-password")
    public WebElement password;

    @FindBy(css = "[action] .btn-primary")
    public WebElement loginButton;

    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    public WebElement myAccount;
}