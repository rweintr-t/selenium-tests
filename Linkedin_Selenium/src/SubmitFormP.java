import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class SubmitFormP {
	// organize using page object pattern

	public static void main(String[] args) throws InterruptedException {
		// specify web driver location		
		System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");
		// Instantiate web driver
		WebDriver driver = new ChromeDriver();
		
		// Get web page to test
		driver.get("https://formy-project.herokuapp.com/form");
		
		// Fill out and submit form
		FormPage fp = new FormPage();
		fp.submitMe(driver);

		// Wait for alert to display and get its text
		ConfirmationPage cp = new ConfirmationPage();
		cp.waitForAlert(driver);
		String alertText = cp.getAlertText(driver);
		
//		assertEquals("The form was successfully submitted!",alert.getText());
		assertTrue("The form was successfully submitted!".equals(alertText));

		// Exit
		driver.quit();
		
	}
	
	
	
}
