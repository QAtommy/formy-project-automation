import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TestSample  {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
        // System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chrome-win64/chrome.exe");
        System.setProperty("webdriver.gecko.driver", "C:/Geckodriver/geckodriver.exe");

        // ChromeOptions options = new ChromeOptions();
        //options.addArguments("start-maximized");

        // Create new instance of ChromeDriver
        // ChromeDriver driver = new ChromeDriver(options);
        // WebDriver driver = new ChromeDriver();
       WebDriver driver = new FirefoxDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form
        element.submit();

        //Close the browser
        driver.quit();
    }
}


