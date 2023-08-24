package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6HW_FrameAlertsW3School {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		/*
		 * 
		 * Day_6 
 Assignment 

1.Launch the url:
https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm 
2.Click Try It Button
3.Click OK/Cancel in the alert
4.Confirm the action is performed correctly by verifying the text !!
 
		 */
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]"));
		driver.switchTo().frame(frame1);
		
		//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//WebElement tryIt = 
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//jsExecutor.executeScript("arguments[0].click();", tryIt);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		boolean isDisplayed = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).isDisplayed();
		if (isDisplayed == true)
		{
			System.out.println("Alert is accepted correctly");
		}
		else
		{
			System.out.println("Redo!");
		}
		

	}

}
