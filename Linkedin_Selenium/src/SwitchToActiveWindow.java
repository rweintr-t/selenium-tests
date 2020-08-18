import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");
        WebDriver driver = new FirefoxDriver(); 	
//        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        
        Thread.sleep(1000);
        
        // open new tab
        WebElement addTab = driver.findElement(By.id("new-tab-button"));
        addTab.click();
       
        Thread.sleep(1000);
        
        //switch to new tab- first get current window handle
        String currWindow = driver.getWindowHandle();
        
        // iterate thru open windows
        for (String handle : driver.getWindowHandles()) {
        	driver.switchTo().window(handle);
        }
     
        Thread.sleep(1000);
        
        // go back to original window
        driver.switchTo().window(currWindow);
        
        Thread.sleep(1000);
        
        System.out.println("Success- end of test");
        
        driver.quit();
    }
}
