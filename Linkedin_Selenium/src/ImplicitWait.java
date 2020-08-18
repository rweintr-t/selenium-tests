//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class ImplicitWait {
    public static void main(String[] args) {
    	
    	//System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        
        //try {
        	driver.get("https://formy-project.herokuapp.com/autocomplete");

        	WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        	//autocomplete.sendKeys("36144 Watch Hill Road, Frankford, DE");
        	autocomplete.sendKeys("14677 Trap Pond Court, Ocean View, DE");

        	// allow time for display autocomplete result before clicking it
        	// using implicit wait of 2 secs 
        	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        	WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        	autocompleteResult.click();
        //}
        //catch (Exception e) { 
        //	System.out.println("Error " + e.getStackTrace());
        //}
        //finally {
        	System.out.println("success end of test");

        	driver.quit();
        //}
    }
}