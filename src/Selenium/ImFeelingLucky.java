import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ImFeelingLucky {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();


    @BeforeAll
        public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/llally/Documents/Java/WebDrivers/chromedriver");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
        public void testUntitled() throws Exception{
        driver.get(baseUrl + "/");
        driver.findElement(By.id("gbqfbb")).click();
    }

    @After
        public void tearDown() throws Exception{
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals((verificationErrorString))){
            TestCase.fail(verificationErrorString);


        }

    }

}
