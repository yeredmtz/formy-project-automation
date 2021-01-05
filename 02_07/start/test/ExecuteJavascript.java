import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/yeredmartinez/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();
        Thread.sleep(1000);
        WebElement closeButton = driver.findElement(By.id("close-button"));
        closeButton.click();
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click();", closeButton);
//        Thread.sleep(1000);
        driver.quit();
    }
}
