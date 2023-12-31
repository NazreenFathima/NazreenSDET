package mandatoryHomeWork.selenium.salesforce.raji;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC005_Salesforce_Worktype 
{
	@Test
    public void findDriverName() {
        // TODO Auto-generated method stub
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();



        driver.get("https://ionixx-dev-ed.develop.my.salesforce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("username")).sendKeys("rajalakshmisdet@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Raji@3693");
        driver.findElement(By.id("Login")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//div[@class=\"slds-icon-waffle\"]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
        driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).sendKeys("Work Types");
        driver.findElement(By.xpath("//p/mark[text() = 'Work Types']")).click();

        driver.findElement(By.xpath("//div[@title='New']")).click();
        driver.findElement(By.xpath("//input[@class=' input']")).sendKeys("Bootcamp");
        driver.findElement(By.xpath("(//span[contains(text(),'Save')])[3]")).click();

        Assert.assertEquals(true, driver.findElement(By.xpath("//li[contains(text(),'Complete this field.')]")).isDisplayed());

        driver.quit();
    }

}
