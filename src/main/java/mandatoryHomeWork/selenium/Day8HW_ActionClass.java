package mandatoryHomeWork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day8HW_ActionClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
	/*
	 * Selenium WebDriver

Day_8

Assignment Based on Action Class
=======================

https://jqueryui.com/draggable
https://jqueryui.com/droppable
https://jqueryui.com/selectable
	 */
	
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jqueryui.com/draggable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		Actions op = new Actions(driver);
		
		Thread.sleep(3000);
		
		op.dragAndDropBy(drag,100,100).perform();
		
		driver.get("https://jqueryui.com/droppable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement trgt = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		op.dragAndDrop(src, trgt).perform();
		
		driver.get("https://jqueryui.com/selectable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		WebElement Ele1 = driver.findElement(By.xpath("//li[contains(text(),'Item 1')]"));
		WebElement Ele2 = driver.findElement(By.xpath("//li[contains(text(),'Item 3')]"));
		WebElement Ele3 = driver.findElement(By.xpath("//li[contains(text(),'Item 4')]"));
		
		op.keyDown(Keys.CONTROL).click(Ele1).click(Ele2).click(Ele3).keyUp(Keys.CONTROL).perform();
	}
	
	
}
