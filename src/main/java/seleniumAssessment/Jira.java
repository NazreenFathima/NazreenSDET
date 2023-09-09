package seleniumAssessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Jira 
{
	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://api-training.atlassian.net/");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("hari.radhakrishnan@testleaf.com");
		driver.findElement(By.xpath("//span[text()=\"Continue\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("India@123");
		driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();

		driver.findElement(By.xpath("//p[text()=\"SDET-5\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Create\"]")).click();

		driver.findElement(By.xpath("//input[@name=\"summary\"]")).sendKeys("New Story for Automation - Nafa");
		driver.findElement(By.xpath("(//span[text()=\"Create\"])[2]")).click();

		driver.findElement(By.xpath("//span[text()=\"Backlog\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("New Story for Automation - Nafa");
		
		String name =driver.findElement(By.xpath("//mark[@class=\"_bfhkwtfv _syaz1fxt\"]")).getText();
		Assert.assertEquals(name, "New Story for Automation - Nafa");
		
		driver.quit();
		


	}
}
