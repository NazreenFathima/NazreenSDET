package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day3HW_CreateCampaign {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		/*
		 * Day_3 Assignment:
"Test Steps for Create Campaign:
1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Campaigns tab 
5. Click on New button
6. Enter Campaign name as 'Bootcamp'
7. Choose Start date as Tomorrow
8. End date as Tomorrow+1
9. click Save and Verify the newly created Campaign"
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
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		//driver.findElement(By.xpath("//a[@title='Campaigns']")).click();
		
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement campaign = driver.findElement(By.xpath("//a[@title='Campaigns']"));
		jsExecutor.executeScript("arguments[0].click();", campaign);
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//input[@type='text' and @maxlength='80']")).sendKeys("Bootcamp by Naz");
		
	
		driver.findElement(By.xpath("//div[@class='form-element']//a")).click();
		driver.findElement(By.xpath("(//td[@aria-selected='true']//following-sibling::td)[1]")).click();
		// End date as Tomorrow+1
		driver.findElement(By.xpath("(//div[@class='form-element'])[2]")).click();
		driver.findElement(By.xpath("(//td[@aria-selected='true']//following-sibling::td)[2]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		
		Thread.sleep(10000);
		boolean newCampaign = driver.getPageSource().contains("Bootcamp by Naz");
		if(newCampaign==true)
		{
			System.out.println("New Camppaign is created");
		}
		else
			System.out.println("New Camppaign is not created");
		driver.quit();
		
		
	}

}
