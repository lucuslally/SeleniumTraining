import javafx.css.Size;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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


        //Create a new ArrayList named options and find values via getOptions
        //List<WebElement> options = dropdown.getOptions();

        //Create a new ArrayList named options and find values via tag

        List<WebElement> options = driver.findElements(By.tagName("option"));

        System.out.println("--------- Printing all the dropdown options ------------");
        for (int i=0; i<options.size(); i++){
            System.out.println(options.get(i).getAttribute("lang"));
        }

        WebElement otherProjects = driver.findElement(By.className("footer"));
        List<WebElement> links = otherProjects.findElements(By.tagName("a"));

        System.out.println("--------- Printing all the dropdown links ------------");
        for (int i=0; i<links.size(); i++){
            System.out.println(links.get(i).getText());
        }
        System.out.println("Total links are : "+links.size());





        //driver.quit();
    }


}
