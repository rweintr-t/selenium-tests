import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");

//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://formy-project.herokuapp.com/modal");
        
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();
        
        Thread.sleep(3000);
        
        //get close button of modal
        WebElement closeButton = driver.findElement(By.id("close-button"));
        
        // execute javascript to click the close button of modal
        // create javascript executor object by type casting
        JavascriptExecutor js = (JavascriptExecutor)driver;
        // execute anonymous script passing the close button as arg
        js.executeScript("arguments[0].click();", closeButton);

        Thread.sleep(3000);
        driver.quit();
    }
}
