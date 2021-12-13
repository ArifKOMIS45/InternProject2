package testNGfiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class Elements {
    private @FindBy(id = "onetrust-accept-btn-handler")
    WebElement landingPageCookies;
    private @FindBy(css = ".svelte-cq7eil")
    WebElement showMoreContries;
    private @FindBy(xpath = "//span[.='Go to']")
    WebElement goTo;
    private @FindBy(css = ".accept-cookies")
    WebElement acceptCookies;
    private @FindBy(id = "cookieClose")
    WebElement acceptCookies2;
    private @FindBy(xpath = "//h2[.='Design your own desk']")
    WebElement designDesk;
    private @FindBy(css = ".menu-icons-tops")
    WebElement dimension;
    private @FindBy(css = ".menu-icons-bottoms")
    WebElement legIcon;
    private @FindBy(css = ".menu-icons-legs")
    WebElement legs;
    private @FindBy(css = ".menu-icons-trestles")
    WebElement trestles;
    private @FindBy(css = ".menu-icons-units")
    WebElement units;
    private @FindBy(css = ".menu-icons-unit-legs")
    WebElement unitlegs;
    private @FindBy(xpath = "//div[@class='menu-selector active'] /ul/li")
    List<WebElement> legsButton;
    private @FindBy(css = ".menu-icons-tops-large")
    WebElement bigTable;
    private @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement cookiesAccept;
    private @FindBy(xpath = "//input[@id='inputValEnter']")
    WebElement searchBox;
    private @FindBy(css = ".searchformButton")
    WebElement searchButton;

    public WebElement getCompleteDesign() {
        return completeDesign;
    }

    private @FindBy(xpath = "//div[.='Next']")
    WebElement completeDesign;

    public WebElement getZoomedImage() {
        return zoomedImage;
    }

    private @FindBy(css = ".cloudzoom-zoom")
    WebElement zoomedImage;

    public WebElement getItemInNewTab() {
        return itemInNewTab;
    }

    private @FindBy(xpath = "//ul[@id='bx-slider-left-image-panel']/li[1]")
    WebElement itemInNewTab;

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearchedItem() {
        return searchedItem;
    }

    private @FindBy(xpath = "//div[@id='products']/section[1]/div/div[2]")
    WebElement searchedItem;

    public WebElement getLeftIcon() {
        return leftIcon;
    }

    private @FindBy(xpath = "//div[@id='top-selector']/div[@class='swiper-button prev ng-scope']/i")
    WebElement leftIcon;

    public List<WebElement> getLegsButton() {
        return legsButton;
    }

    public WebElement getCookiesAccept() {
        return cookiesAccept;
    }

    private @FindBy(css = ".menu>ul>li")
    List<WebElement> Countries;


    public Elements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getTrestles() {
        return trestles;
    }

    public WebElement getUnits() {
        return units;
    }

    public WebElement getUnitlegs() {
        return unitlegs;
    }

    public WebElement getLegIcon() {
        return legIcon;
    }

    public List<WebElement> getLegs() {
        return legsButton;
    }

    public WebElement getDimension() {
        return dimension;
    }

    public WebElement getBigTable() {
        return bigTable;
    }

    public WebElement getDesignDesk() {
        return designDesk;
    }

    public WebElement getAcceptCookies2() {
        return acceptCookies2;
    }

    public WebElement getShowMoreContries() {
        return showMoreContries;
    }

    public WebElement getGoTo() {
        return goTo;
    }

    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public WebElement getLandingPageCookies() {
        return landingPageCookies;
    }

    public List<WebElement> getCountries() {
        return Countries;
    }
}
