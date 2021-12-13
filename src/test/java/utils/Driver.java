package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;


public class Driver {

    private static WebDriver driver;

   // @BeforeClass
    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        return driver;

    }

  //  @AfterClass(alwaysRun = true)
    public static void quit() {
        if (driver!= null) {
            driver.quit();
        }

        driver = null;

    }


}
