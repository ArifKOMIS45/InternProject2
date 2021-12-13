package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testNGfiles.Elements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Parent {

    public static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    public static void startUrl(String url) {
        WebDriver driver = Driver.getDriver();
        driver.navigate().to(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    public static void selectAndClick(List<WebElement> elements, int option) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
        elements.get(option - 1).click();

    }
public static void moveMouseToelement(WebElement element,int xOffset,int yOffset){
    Actions action=new Actions(Driver.getDriver());
        action.moveToElement(element,xOffset,yOffset).build().perform();

}
    public static void clickElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
       // wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

    }







    public static void sendToElement(String key,WebElement element){
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        element.sendKeys(key);
    }

    public static void designTable(int size,int legType) {
        Driver.getDriver().switchTo().frame(0);

        Elements e = new Elements();
        if (size == 2) {
            clickElement(e.getDimension());
            clickElement(e.getBigTable());
        }
        clickElement(e.getLegIcon());


   switch (legType){
    case 1:clickElement(e.getLegs().get(0));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@id='bottom-swiper']/div[@class='swiper-wrapper']/div"), 1));
        List<WebElement> legs = Driver.getDriver().findElements(By.xpath("//div[@id='bottom-swiper']/div[@class='swiper-wrapper']/div"));
        List<WebElement> legs2= legs.stream().limit((legs.size() / 3)-1).collect(Collectors.toList());

        for (int i = 0; i <legs2.size() ; i++) {
           WebElement selected=legs2.get(new Random().nextInt(legs2.size()-1 ));
            try {
                if (selected.isEnabled()) {clickElement(selected);}
            }catch (Exception ex)
            {
                clickElement(e.getLeftIcon());
            }
        }
        break;

        case 2:clickElement(e.getLegs().get(1));

            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@id='bottom-swiper']/div[@class='swiper-wrapper']/div"), 1));
            List<WebElement> legs3 = Driver.getDriver().findElements(By.xpath("//div[@id='bottom-swiper']/div[@class='swiper-wrapper']/div"));
            List<WebElement> legs4= legs3.stream().limit((legs3.size() / 3)-1).collect(Collectors.toList());
            for (int i = 0; i <legs4.size() ; i++) {
                WebElement selected=legs4.get(new Random().nextInt(legs4.size()-1 ));
                try {
                    if (selected.isEnabled()) {clickElement(selected);}
                }catch (Exception ex)
                {
                    clickElement(e.getLeftIcon());
                }
            }
            break;




       case 3:clickElement(e.getLegs().get(2));

           wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@id='bottom-swiper']/div[@class='swiper-wrapper']/div"), 1));
           List<WebElement> legs5 = Driver.getDriver().findElements(By.xpath("//div[@id='bottom-swiper']/div[@class='swiper-wrapper']/div"));
           clickElement(legs5.get(new Random().nextInt(legs5.size()-1 )));break;

       case 4:clickElement(e.getLegs().get(3));

           wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@id='bottom-swiper']/div[@class='swiper-wrapper']/div"), 1));
           List<WebElement> legs7 = Driver.getDriver().findElements(By.xpath("//div[@id='bottom-swiper']/div[@class='swiper-wrapper']/div"));
           List<WebElement> legs8= legs7.stream().limit((legs7.size() / 3)-1).collect(Collectors.toList());
           for (int i = 0; i <legs8.size() ; i++) {
               WebElement selected=legs8.get(new Random().nextInt(legs8.size()-1 ));
               try {
                   if (selected.isEnabled()) {clickElement(selected);}
               }catch (Exception ex)
               {
                   clickElement(e.getLeftIcon());
               }
           }break;

}

        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//div[@id='top-swiper']/div[@class='swiper-wrapper']/div"));
        List<WebElement> elements2= elements.stream().limit((elements.size() / 3)-1).collect(Collectors.toList());
        WebElement selected=elements2.get(new Random().nextInt(elements2.size()));

        for (int i = 0; i <elements2.size() ; i++) {
           try {
               if (selected.isEnabled()) {clickElement(selected);}
           }catch (Exception ex)
           {
               clickElement(e.getLeftIcon());
           }

        }








    }


}
