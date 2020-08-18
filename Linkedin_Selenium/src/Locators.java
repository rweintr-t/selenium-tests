import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// specify web driver location
		//System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/chrome-driver/chromedriver.exe");
		// Instantiate web driver
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		// Get web page to test
		driver.get("https://formy-project.herokuapp.com/form");
		
		// Locate the first name text box using class name form-control only
		// There are multiple elements with that class name so this should fail
		// Note: Results in locating first field on form with that tag-class
//		WebElement firstName = driver.findElement(By.className("form-control"));
		// Using CSSSelector with class of form-control should result in same locator failure
//		WebElement firstName = driver.findElement(By.cssSelector(".form-control"));
		// Combining class name with entry tag still will not work
		// because both have tag name of input so tag-class is not unique
//		WebElement firstName = driver.findElement(By.cssSelector("input[class='form-control']"));
		// Below is alternative way of specifying tag and class
//		WebElement firstName = driver.findElement(By.cssSelector("input.form-control"));
		// the following combines tag and id and should work
//		WebElement firstName = driver.findElement(By.id("first-name"));
		WebElement firstName = driver.findElement(By.cssSelector("input#first-name"));
		// Enter first name text
		firstName.sendKeys("Sharon");
		
		// enter last name
		// tag-class is not unique so will fail- append last name to first name field
//		WebElement lastName = driver.findElement(By.cssSelector("input.form-control"));
		// tag-attribute value is unique
//		WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='Enter last name']"));
		// class-attribute value is unique
		WebElement lastName = driver.findElement(By.cssSelector(".form-control[placeholder='Enter last name']"));
		lastName.sendKeys("Pope");
		
		//Job title - locate by text prefix ^
		// locate field whose id value begins with 'job'
		WebElement jobTitle = driver.findElement(By.cssSelector("[id^='job']"));
		jobTitle.sendKeys("Bartender");
		
		//Education radio button - locate by text suffix $
		// locate field whose id value ends with 'button-3' graduate ed
		WebElement highestEducation = driver.findElement(By.cssSelector("[id$='button-3']"));
		highestEducation.click();
		
		//gender check box - locate by id 
		// locate field whose id is 'checkbox-1' male
		WebElement gender = driver.findElement(By.cssSelector("#checkbox-2"));
		gender.click();
		
		//years of experience - drop down list
		//use locator nth child 
		WebElement experience = driver.findElement(By.cssSelector("#select-menu option:nth-child(4)"));
		experience.click();
		
		// Locate date using parent-child node locator
		// find node whose parent class is col-sm-4 and is an input element
		WebElement datePicker = driver.findElement(By.cssSelector("div.col-sm-4 input"));
		datePicker.sendKeys("09/01/2020");
		// press Enter after keying in date to hide calendar
		datePicker.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		// can specify using multiple classes
		WebElement button = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
		button.click();
		// Wait 2 seconds so can see search results
		Thread.sleep(4000);
				
		// Exit
		driver.quit();
		
	}

}
