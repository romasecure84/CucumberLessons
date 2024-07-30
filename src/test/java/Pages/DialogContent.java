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

    @FindBy(css = "div#content > h2:nth-of-type(1)")
    public WebElement myAccount;

    @FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
    public WebElement ipod4AddToCartButton;

    @FindBy(xpath = "(//a[text()='Address Book'])[1]")
    public WebElement addressBookLink;

    @FindBy(linkText = "New Address")
    public WebElement newAddressButton;

    @FindBy(css = ".alert-dismissible")
    public WebElement successMessage;
}
