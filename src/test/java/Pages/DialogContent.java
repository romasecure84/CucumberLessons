package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent {

    public DialogContent(){
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
    @FindBy(xpath = "(//a[contains (@href,'delete')])[2]")
    public WebElement deleteButton;

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

    @FindBy(css = "button[onclick*='cart.add']")
    public WebElement addToCartButton;

    public WebElement getWebElement(String element){
        switch (element) {
            case "email":
                return this.email;
            case "password":
                return this.password;
            case "loginButton":
                return this.loginButton;
            case "myAccount":
                return this.myAccount;
            case "ipod4AddToCartButton":
                return this.ipod4AddToCartButton;
            case "addressBookLink":
                return this.addressBookLink;
            case "newAddressButton":
                return this.newAddressButton;
            case "successMessage":
                return this.successMessage;
            case "addToCartButton":
                return this.addToCartButton;
            case "deleteButton":
                return this.deleteButton;
        }
        return null;
    }
}
