import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium {

    public static void main(String[] args) {
        // Chrome
        //System.setProperty("webdriver.chrome.driver", "/Users/llally/Documents/Java/chromedriver");
        //WebDriver driver = new ChromeDriver();
        //driver.get("http://wwww.reddit.com");

        //FireFox

        System.setProperty("webdriver.gecko.driver", "/Users/llally/Documents/Java/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.misspnw.com/");
        System.out.println(driver.getTitle());

        /*
        WebElement home = driver.findElement(By.id("menu-item-20"));
        home.click();

        //home = driver.findElement(By.name(""));
        //home = driver.findElement(By.xpath());
        System.out.println(home.getText());
        */

        //Find the 5 Things to do in San Juan post
        WebElement thingsToDoInSanJuan = driver.findElement(By.id("post-997"));
        //Click it
        thingsToDoInSanJuan.click();



    }
}