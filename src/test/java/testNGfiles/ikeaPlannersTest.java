package testNGfiles;

import org.testng.annotations.Test;
import utils.Driver;
import utils.Parent;

public class ikeaPlannersTest extends Parent {

    @Test
    public static void designTable() {
        Parent.startUrl("https://www.ikea.com/us/en/planners/");
        Elements e = new Elements();
        clickElement(e.getCookiesAccept());
        clickElement(e.getDesignDesk());

        /*please select your table size:  1-Small,2-Big
        Please select your table legs
        1-regular legs
        2-trestles
        3-unit
        4-unit with legs      */
        designTable(2,2);

        clickElement(e.getCompleteDesign());
        Driver.quit();
    }
}