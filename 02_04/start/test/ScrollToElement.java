import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:/Geckodriver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Tommmmmy!");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2022");

        driver.quit();
    }
}
