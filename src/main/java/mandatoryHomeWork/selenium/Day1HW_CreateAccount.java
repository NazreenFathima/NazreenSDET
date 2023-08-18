package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1HW_CreateAccount {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * Test Steps:
1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Accounts tab 
5. Click on New button
6. Enter 'your name' as account name                                           
7. Click save
		 */
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		
		WebElement sales = driver.findElement(By.xpath("//p[normalize-space()='Sales']"));
		sales.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
		js.executeScript("arguments[0].click();", account);
		
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Nazreen");
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
		
	}

}
