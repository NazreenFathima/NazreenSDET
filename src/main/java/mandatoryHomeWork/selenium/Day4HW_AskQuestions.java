package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Day4HW_AskQuestions {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		/*
		 * Day_4 
 Assignment 

Credentials:
hari.radhakrishnan@qeagle.com
Leaf$1234



		ChromeOptions options = new ChromeOptions();	options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);



1. Launch https://login.salesforce.com/ 
2. Login to Salesforce with your username and password
3. Click on the App Launcher (dots)
4. Click View All
5. Type Content on the Search box
6. Click the Content Link
7. Click on Chatter Tab
8. Verify the Chatter title on the page
9. Click the Question tab
10. Type Question 
11. Type Details 
12. Click Ask
13. Confirm the question appears
14. Close the browser
		 */
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf$1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		
		driver.findElement(By.xpath("//input[@part='input']")).sendKeys("Content");
		
		driver.findElement(By.xpath("//div[@class='slds-app-launcher__tile-body slds-truncate']")).click();
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
		jsExecutor.executeScript("arguments[0].click();", chatter);
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(10000);
		if (title.contains("Chatter"))
		{
			System.out.println("Landed in Chatter page correctly");
		}
		else
		{
			System.out.println("Landed in incorrect page");
		}
		
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys("What is question??");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Typing the description??");
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		
		boolean question = driver.getPageSource().contains("What is question??");
		if(question==true)
		{
			System.out.println("Typed questions is available");
		}
		else
			System.out.println("Typed questions is not available");
		
		driver.quit();
	}
		

}
