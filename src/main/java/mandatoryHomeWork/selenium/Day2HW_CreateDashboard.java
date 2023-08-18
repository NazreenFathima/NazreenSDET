package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day2HW_CreateDashboard {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * Day_2 Assignment
=============
"Test Steps to Create New Dashboard:
1. Login to https://login.salesforce.com
Username :hari.radhakrishnan@qeagle.com
Password :Leaf$1234
2. Click on the toggle menu button from the left corner
3. Click View All and click Dashboards from App Launcher
4. Click on the New Dashboard option
5. Enter Name as 'Salesforce Automation by Your Name ' and Click on Create.
6.Click on Save.
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
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement dashboard = driver.findElement(By.xpath("//p[contains(text(),'Dashboards')]"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", dashboard);
		dashboard.click();
		
		
		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
		WebElement dashboardFrame = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(dashboardFrame);
		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("Salesforce Automation by test");
		driver.findElement(By.xpath("//button[@id='submitBtn']")).click();
		WebElement Frame = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(Frame);
		//driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
		
		
		//<iframe name="sfxdash-1692346727816-380299" title="dashboard" src="https://qeagle-dev-ed.lightning.force.com/desktopDashboards/dashboardApp.app?dashboardId=newDashboard_1692346727815&amp;displayMode=edit&amp;networkId=000000000000000&amp;userId=0055g00000B238KAAR" tabindex="0" xpath="1"></iframe>
		//<iframe name="sfxdash-1692346804735-648225" title="dashboard" src="https://qeagle-dev-ed.lightning.force.com/desktopDashboards/dashboardApp.app?dashboardId=01Z5g000000uIZTEA2&amp;displayMode=edit&amp;networkId=000000000000000&amp;userId=0055g00000B238KAAR" tabindex="0" xpath="1"></iframe>
		//<iframe name="sfxdash-1692346804735-648225" title="dashboard" src="https://qeagle-dev-ed.lightning.force.com/desktopDashboards/dashboardApp.app?dashboardId=01Z5g000000uIZTEA2&amp;displayMode=edit&amp;networkId=000000000000000&amp;userId=0055g00000B238KAAR" tabindex="0" xpath="1"></iframe>
         
		
		//Learning : iframe switiching...
		//Exceptions : ElementNotFound and StaleElementException
	}

}
