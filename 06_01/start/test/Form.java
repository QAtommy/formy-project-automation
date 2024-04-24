import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:/Geckodriver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.quit();
    }
}
