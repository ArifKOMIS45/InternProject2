package testNGfiles;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;
import utils.Parent;

import java.util.ArrayList;

public class Snapdeal extends Parent {

    @Test
    public static void SnapdealItemZoom() {
        Parent.startUrl("https://www.snapdeal.com/");
        Elements e = new Elements();
        String oldTab = Driver.getDriver().getWindowHandle();
        clickElement(e.getSearchBox());
        sendToElement("Casio Watch Men", e.getSearchBox());
        clickElement(e.getSearchButton());
        clickElement(e.getSearchedItem());

        ArrayList<String> newTab = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        newTab.remove(oldTab);
        Driver.getDriver().switchTo().window(newTab.get(0));

        moveMouseToelement(e.getItemInNewTab(), 90, 90);
        moveMouseToelement(e.getItemInNewTab(), 90, 60);
        moveMouseToelement(e.getItemInNewTab(), 90, 30);

        Assert.assertTrue(e.getZoomedImage().isDisplayed());
        Driver.quit();

    }


}
