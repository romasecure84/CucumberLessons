package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderContent {
    public HeaderContent(){
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = ".form-control")
    public WebElement searchBox;

    @FindBy(css = ".btn.btn-default.btn-lg")
    public WebElement searchButton;

    @FindBy(css = "span#cart-total")
    public WebElement shoppingCart;
}
