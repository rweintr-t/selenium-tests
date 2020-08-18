//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
    	
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
        	Thread.sleep(1000);

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