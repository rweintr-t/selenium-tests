//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExplicitWait {
    public static void main(String[] args) {
    	
    	//System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        //autocomplete.sendKeys("36144 Watch Hill Road, Frankford, DE");
        autocomplete.sendKeys("14677 Trap Pond Court, Ocean View, DE");

        // allow time for display autocomplete result before clicking it
        // using explicit wait of up to 10 secs for autocomplete item to be displayed
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement autocompleteResult = wait.until(ExpectedConditions
        		.visibilityOfElementLocated(By.className("pac-item")));
        autocompleteResult.click();

        System.out.println("success end of test");

        driver.quit();
    }
}