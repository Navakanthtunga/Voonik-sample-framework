package com.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test1 {
	 static String path=System.getProperty("user.dir");

@Test
public void sample1()  throws Throwable{
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
 	driver=new ChromeDriver();
	
	/*System.setProperty("webdriver.gecko.driver", path+"\\resources\\geckodriver.exe");
	 driver =new FirefoxDriver();*/
 	driver.get("https://www.fatcow.com/");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement ele1=driver.findElement(By.xpath("//a[text()='Spread the Word']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele1).moveToElement(driver.findElement(By.xpath("//a[text()='Referral']"))).click().build().perform();
	//WebElement ele2=driver.findElement(By.xpath("//a[text()='Referral']"));
	
}
}
