import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestDropdowns {

    public static void main(String[] args){


        //Location chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/llally/Documents/Java/WebDrivers/chromedriver");

        //Create new ChromeDriver
        WebDriver driver = new ChromeDriver();

        //Navigate to Wikipedia
        driver.get("http://www.wikipedia.org/");

        //Create new WebElement object named searchLanguage
        WebElement searchLanguage = driver.findElement(By.id("searchLanguage"));

        //Create new Select object named dropdown and pass in searchLanguage
        Select dropdown = new Select(searchLanguage);

        //Select Dropdown and change the value
        dropdown.selectByValue("ca");
    }


}
