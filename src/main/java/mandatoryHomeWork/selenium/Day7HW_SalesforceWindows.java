package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day7HW_SalesforceWindows {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * Day_7

Assignment:

1. Launch Salesforce application https://login.salesforce.com/
2. Login with username as "hari.radhakrishnan@qeagle.com" 
    and password as "Leaf$1234"
3. Click on Learn More link in Mobile Publisher
4. Click on Confirm button
5. Get child window Title  
6. close the child window 
7. Get parent window Title 
8. close the parent window
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
		
		driver.findElement(By.xpath("//span[normalize-space()='Learn More']")).click();
		Set<String> window= driver.getWindowHandles();
		ArrayList<String> winList =  new ArrayList<>(window);
		driver.switchTo().window(winList.get(1));
		driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(winList.get(0));
		System.out.println(driver.getTitle());
		driver.close();

	}

}

