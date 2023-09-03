package mandatoryHomeWork.selenium.salesforce.gokul;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Accounts_TC001 
{
	/*
	 * Test Steps:
1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Accounts tab 
5. Click on New button
6. Enter 'your name' as account name
7. Select Ownership as Public                                               
8. Click save and verify Account name 
	 */
	
	@Test()
	public void createAccountTest() 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.navigate().to("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("gokuls2381@gmail.com",Keys.TAB,"Roulette@123",Keys.TAB,Keys.ENTER);

		WebElement launcher = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(launcher));
		launcher.click();

		WebElement viewAll = driver.findElement(By.xpath("//button[normalize-space()='View All']"));
		viewAll.click();

		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
		driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();
		WebElement accountTab = driver.findElement(By.xpath("//span[normalize-space()='Accounts']"));
	//	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.executeScript("arguments[0].click();", accountTab);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("GokulAccount");
		WebElement access = driver.findElement(By.xpath("//button[@aria-label='Ownership, --None--']"));
		driver.executeScript("arguments[0].click();", access);

		WebElement publicOption = driver.findElement(By.xpath("//span[@title='Public']"));
		wait.until(ExpectedConditions.elementToBeClickable(publicOption));
		publicOption.click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Assert.assertEquals(true, driver.findElement(By.xpath("//lightning-formatted-text[@class='custom-truncate']")).isDisplayed());
		driver.quit();
	}

}
