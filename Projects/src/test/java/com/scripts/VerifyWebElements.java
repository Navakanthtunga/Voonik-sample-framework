package com.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class VerifyWebElements {
	@Test
	public void sample2() throws Throwable  {
		 WebDriver driver;	
		 String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"\\resources\\geckodriver.exe");
		 driver =new FirefoxDriver();
	/*	 System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
		driver=new ChromeDriver();*/
			driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 driver.get("https://www.voonik.com/");

	WebElement element = driver.findElement(By.xpath("//a[@id='menu_item_0']"));
   // To move mouse to menu
	JavascriptExecutor js = (JavascriptExecutor) driver;
    String strJavaScript = "var element = arguments[0];"
            + "var mouseEventObj = document.createEvent('MouseEvents');"
            + "mouseEventObj.initEvent( 'mouseover', true, true );"
            + "element.dispatchEvent(mouseEventObj);";
    
     js.executeScript(strJavaScript, element);
   // To identify element in sub menu  
     WebElement element1 = driver.findElement(By.xpath("//a[text()='Sarees']"));
     // To click on the element in sub-menu
     js.executeScript("arguments[0].click();", element1);
	Thread.sleep(8000);
	
	driver.quit();
	
	

}
}
