import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class SubmitForm {
	// organize into methods

	public static void main(String[] args) throws InterruptedException {
		// specify web driver location		
		System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");
		// Instantiate web driver
		WebDriver driver = new ChromeDriver();
		
		// Get web page to test
		driver.get("https://formy-project.herokuapp.com/form");
		
		// Fill out and submit form
		submitMe(driver);

		// Wait for alert to display
		waitForAlert(driver);
		
//		assertEquals("The form was successfully submitted!",alert.getText());
		assertTrue("The form was successfully submitted!".equals(driver.findElement(By.className("alert")).getText()));

		// Exit
		driver.quit();
		
	}
	
	public static void submitMe (WebDriver driver) {
		// Locate the first name text and enter text in one line
		driver.findElement(By.id("first-name")).sendKeys("Isaac");;
		
		// Locate last name textbox using CSS selector (# is id locator)
		driver.findElement(By.cssSelector("#last-name")).sendKeys("Newton");
		
		// Enter job title using tag and attribute locator $ suffix
		driver.findElement(By.cssSelector("input[placeholder$='job title']")).sendKeys("Scientist");
		 
		// Enter highest level of education - click on radio button
		driver.findElement(By.cssSelector("input[value='radio-button-3']")).click();
		
		// Enter gender
		driver.findElement(By.id("checkbox-1")).click();
		
		// Select years of experience
		driver.findElement(By.cssSelector("option[value='3']")).click();
		
		// Enter date - add a return
		driver.findElement(By.id("datepicker")).sendKeys("09/01/1954");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		
		// Submit to web server- button locator uses multiple classes
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

	}
	public static void waitForAlert(WebDriver driver) {
		// Explicit wait for alert to display and then assert
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
	}
}
