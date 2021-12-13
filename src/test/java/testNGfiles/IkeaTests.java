package testNGfiles;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.Driver;
import utils.Parent;

public class IkeaTests extends Parent {


    @Test
    public static void countryPage() {
        Parent.startUrl("https://www.ikea.com");
        Elements e = new Elements();
        clickElement(e.getLandingPageCookies());
        clickElement(e.getShowMoreContries());

        /* Please select your page
        1-ikea.com.tr (Türkçe)
        2-ikea.com.tr (English)
        3-ikea.bg
        4-ikea.gr (Ελληνικά (Greek))
        5-ikea.gr (English)                 ↓↓↓↓  */
        selectAndClick(e.getCountries(), 5);

        clickElement(e.getGoTo());
        try {
            if (e.getAcceptCookies().isDisplayed()) {clickElement(e.getAcceptCookies()); }
        }catch (Exception exception){
            clickElement(e.getAcceptCookies2());

        }
        finally {
            Driver.quit();
        }



    }


}
