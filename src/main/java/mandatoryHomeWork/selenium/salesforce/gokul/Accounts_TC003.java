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

public class Accounts_TC003 
{
	/*
	 * Test Steps:
1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Accounts tab 
5. Search the account 'Your Name'
6. Click on  the Dropdown icon and Select Delete
7. Verify Whether account is Deleted using account Name
	 */
	
	@Test()
	public void deleteAccountTest()
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
		driver.findElement(By.xpath("//a[normalize-space()='GokulAccount']/ancestor::tr/td[6]")).click();
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@aria-label='Success']")).isDisplayed());
		driver.quit();
	}
}
