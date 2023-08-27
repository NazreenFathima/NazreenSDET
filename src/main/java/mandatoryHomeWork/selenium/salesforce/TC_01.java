package mandatoryHomeWork.selenium.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_01 {

	public static void main(String[] args) throws InterruptedException
	{		
			// TODO Auto-generated method stub		
			/*		 
			 * 
			 * * "Test Steps:
			 * 1. Login to https://login.salesforce.com
			 * 2. Click on the toggle menu button from the left corner
			 * 3. Click View All and click Individuals from App Launcher
			 * 4. Click on the Dropdown icon in the Individuals tab
			 * 5. Click on New Individual
			 * 6. Enter the Last Name as 'Kumar'
			 * 7.Click save and verify Individuals Name"
			 */		
			ChromeOptions options = new ChromeOptions();		
			options.addArguments("--disable-notifications");				
			ChromeDriver driver = new ChromeDriver(options);		
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
			//1. Login to https://login.salesforce.com		
			driver.get("https://login.salesforce.com/");		
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("nazreen@testleaf.sandbox");		
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf@123");		
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			
			//2. Click on the toggle menu button from the left corner		
			driver.findElement(By.className("slds-icon-waffle")).click();
			
			//3. Click View All and click Individuals from App Launcher		
			driver.findElement(By.xpath("//button[@class='slds-button']")).click();			
			//driver.findElement(By.xpath("//p[text()='Individuals']")).click();				
			//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;		
			//WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));		
			//jsExecutor.executeScript("arguments[0].scrollIntoView(true);", individual);		
			//individual.click();		driver.findElement(By.xpath("//input[@part='input']")).sendKeys("individual");				
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;		
			WebElement individual = driver.findElement(By.xpath("//span[@class='slds-truncate label-display']"));	 
			jsExecutor.executeScript("arguments[0].click();", individual);			 
			Thread.sleep(1000);		
			//5. Click on New		
			driver.findElement(By.xpath("//div[text()='New']")).click();				
			//6. Enter the Last Name as 'Kumar'		
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");						
			driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
			String lastName = driver.findElement(By.xpath("//div[@class='slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp']")).getText();		
			if(lastName.equals("Kumar"))		
			{			
				System.out.println("Individuals Name verified");	
			}		
			else 		
			{			
				System.out.println("Individuals Name not verified");
			}		
		}

}

