import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// specify web driver location
		System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");
		// Instantiate web driver
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
		
		// Get web page to test
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		//Drag image to box
//		WebElement image = driver.findElement(By.id("image"));
		// Example of CSS selector long form id of box
		WebElement image = driver.findElement(By.cssSelector("div[id='image']"));
//		WebElement box = driver.findElement(By.id("box"));
		// Example of CSS selector short form id of box
		WebElement box = driver.findElement(By.cssSelector("#box"));
		Actions action = new Actions(driver);
		action.dragAndDrop(image, box).build().perform();
		
		Thread.sleep(2000);
		
		// Exit
		driver.quit();
		
	}

}
