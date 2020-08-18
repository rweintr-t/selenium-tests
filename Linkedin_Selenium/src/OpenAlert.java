import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class OpenAlert {
    public static void main(String[] args) throws InterruptedException {
//    	System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");
//        WebDriver driver = new FirefoxDriver(); 	
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        
        Thread.sleep(1000);
        
        // click button to open alert
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
       
        Thread.sleep(1000);
        
        //Accept the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        Thread.sleep(1000);
        
        System.out.println("Success- end of test");
        
        driver.quit();
    }
}
