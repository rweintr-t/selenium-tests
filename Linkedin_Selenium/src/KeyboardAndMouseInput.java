//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

    	//System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");

        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");
        
        WebElement name = driver.findElement(By.id("name"));

        // click on text field first to make it active
        name.click();
        name.sendKeys("Rob Weintraub");
        
        Thread.sleep(5000);
        
        WebElement button = driver.findElement(By.id("button"));
        button.click();
        
        Thread.sleep(5000);
        
        System.out.println("success end of run");
        driver.quit();
    }
}