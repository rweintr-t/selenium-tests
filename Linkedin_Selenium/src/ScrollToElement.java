import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
//    	System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");

    	WebDriver driver = new FirefoxDriver();
//    	WebDriver driver = new ChromeDriver();
    	
        driver.get("https://formy-project.herokuapp.com/scroll");
        Thread.sleep(3000);
        
        WebElement name = driver.findElement(By.id("name"));
        
        // scroll to bottom of page
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        
        name.sendKeys("Rob Weintraub");
        
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("09/01/2020");
        
        Thread.sleep(3000);
        System.out.println("success - end of script");
        driver.quit();	
    }
}
