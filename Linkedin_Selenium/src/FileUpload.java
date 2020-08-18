import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// specify web driver location
		//System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");
		// Instantiate web driver
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		// Get web page to test
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		// enter file to upload in text box
		WebElement fileUpload = driver.findElement(By.cssSelector("#file-upload-field"));
		fileUpload.sendKeys("file-to-upload.png");
		
		// Wait 5 seconds so can see search results
		Thread.sleep(5000);
		
		// Send success message to console
		System.out.println("success end of script");
		
		// Exit
		driver.quit();
		
	}

}
