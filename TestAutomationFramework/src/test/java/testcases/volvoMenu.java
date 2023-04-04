package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseTest;

public class volvoMenu extends BaseTest {
	
@Test	
public static void MenuTest() throws InterruptedException
{
	
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.xpath(loc.getProperty("popup"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(loc.getProperty("mobileheader"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(loc.getProperty("mobilefilter"))).click();
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath(loc.getProperty("electronics")));
	Actions action = new Actions(driver);
	action.moveToElement(ele).perform();
	Thread.sleep(3000);
}
}
