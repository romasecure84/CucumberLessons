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

    @FindBy(xpath = "(//a[contains(@href, 'checkout/cart')])[2]")
    public WebElement viewCart;

    @FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
    public WebElement ipod4;

    public WebElement getWebElement(String element){
        switch (element){
            case "searchBox": return this.searchBox;
            case "searchButton" : return this.searchButton;
            case "shoppingCart" : return this.shoppingCart;
            case "viewCart" : return this.viewCart;
            case "ipod4" : return this.ipod4;
        }
        return null;
    }
}
