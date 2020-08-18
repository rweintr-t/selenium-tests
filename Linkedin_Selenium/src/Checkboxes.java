import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// specify web driver location
		//System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");
		// Instantiate web driver
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		// Get web page to test
		driver.get("https://formy-project.herokuapp.com/checkbox");
		
		// Check box 1 - tag of input & id of checkbox-1
		WebElement checkbox1 = driver.findElement(By.cssSelector("input#checkbox-1"));
		checkbox1.click();
		
		// Check box 2 - tag of input & value of checkbox-2
		WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
		checkbox2.click();
		
		// Check box 3 - xpath
		WebElement checkbox3 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/input"));
		checkbox3.click();
		
		Thread.sleep(3000);
		
		// Exit
		driver.quit();
		
	}

}
