import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
	public void submitMe (WebDriver driver) {
		
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

}
