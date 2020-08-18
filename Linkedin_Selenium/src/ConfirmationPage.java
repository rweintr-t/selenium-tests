import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {
	
	public void waitForAlert(WebDriver driver) {
		// Explicit wait for alert to display and then assert
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
	}
	
	public String getAlertText(WebDriver driver) {
		return driver.findElement(By.className("alert")).getText();
	}
}
