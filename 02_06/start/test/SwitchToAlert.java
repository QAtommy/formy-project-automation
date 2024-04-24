import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToAlert {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:/Geckodriver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        Alert alert =  driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }
}
