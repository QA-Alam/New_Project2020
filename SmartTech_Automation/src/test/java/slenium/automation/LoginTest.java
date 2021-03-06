package slenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	// What is a Webdriver
	// Ans:- - it is a interface

	// 1. we need Selenium dependencies
	// 2. Chrome extensions
	// 3. WebDriver variable
	// static WebDriver driver;
	// static String driver;
	public void loginTesting() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// Initialize browser.
		WebDriver driver = new ChromeDriver(); // Up casting
		// driver.navigate().to("https://www.zoopla.co.uk/");
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
		
		driver.findElement(By.linkText("Sign in")).click();

		driver.findElement(By.id("signin_email")).sendKeys("alammohammed79@gmail.com");

		//driver.findElement(By.cssSelector("#signin_password")).sendKeys("SAYEDawan2008@");

		driver.findElement(By.cssSelector("#signin_password")).sendKeys("SAYEDawan2008@");		
		
		driver.findElement(By.id("signin_submit")).click();
			
		//String title = "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents";
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.partialLinkText("Commercial")).click();
		

		// driver.quit(); // Server & browser both are closed
		// driver.close(); // Only Browser closed
		// If i want use IE browser then
		// i have to use driver.close method

	}

	public static void main(String[] args) {
		LoginTest obj = new LoginTest();
		obj.loginTesting();
	}

}

//driver.findElement(By.linkText("Sign in")).click();
//driver.findElement(By.partialLinkText("Discover")).click();