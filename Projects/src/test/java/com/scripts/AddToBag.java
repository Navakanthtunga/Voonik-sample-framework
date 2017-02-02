package com.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToBag {
	 WebDriver driver;	
		JavascriptExecutor js = (JavascriptExecutor) driver;

	public void moveToIndWer(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele1 =driver.findElement(By.id("menu_item_0"));
	    String strJavaScript = "var element = arguments[0];"
	            + "var mouseEventObj = document.createEvent('MouseEvents');"
	            + "mouseEventObj.initEvent( 'mouseover', true, true );"
	            + "element.dispatchEvent(mouseEventObj);";
	    
	     js.executeScript(strJavaScript, ele1); 
	}
	public void clickSaree(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Sarees']"));
	     // To click on the element in sub-menu
	     js.executeScript("arguments[0].click();", ele2);
	}
	public void selProduct(){
		// To select the product
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele3 =driver.findElement(By.xpath("(//div[@ id='product_description_outer'])[1]"));
	    String strJavaScript2 = "var element = arguments[0];"
	            + "var mouseEventObj = document.createEvent('MouseEvents');"
	            + "mouseEventObj.initEvent( 'mouseover', true, true );"
	            + "element.dispatchEvent(mouseEventObj);";
	    
	     js.executeScript(strJavaScript2, ele3); 	
	}
	public void movetoProduct(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele4 =driver.findElement(By.id("5385816"));
		String strJavaScript3 = "var element = arguments[0];"
	            + "var mouseEventObj = document.createEvent('MouseEvents');"
	            + "mouseEventObj.initEvent( 'mouseover', true, true );"
	            + "element.dispatchEvent(mouseEventObj);";
	    
	     js.executeScript(strJavaScript3, ele4); 	
	}
	public void clickFreeSize(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement ele5=driver.findElement(By.xpath("//div[@ id='5385816']//label[@ id='sizes']"));	
		 js.executeScript("arguments[0].click();", ele5);	
	}
	public void clickAddtoBag(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement ele6=driver.findElement(By.xpath("//div[@ id='5385816']//a[@ id='buy_btn']"));
	     js.executeScript("arguments[0].click();", ele6);	
	}
	@Test
	public void sample2() throws Throwable  {
		
		 String path=System.getProperty("user.dir");
		/*System.setProperty("webdriver.gecko.driver", path+"\\resources\\geckodriver.exe");
		 driver =new FirefoxDriver();*/
	 System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
			driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 driver.get("https://www.voonik.com/");
		 moveToIndWer();
		 clickSaree(); 
		// selProduct();
		 
		// movetoProduct();
		/* clickFreeSize();
		 Thread.sleep(2000);
		 clickAddtoBag();*/
		 Thread.sleep(10000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  WebElement ele6=driver.findElement(By.xpath("//div[@ id='5088810']/../../div[@ id='product_image_listing']/div/following-sibling::a"));
		  // WebElement ele6=driver.findElement(By.xpath("//div[@ id='5088811']/../preceding-sibling::div/div/following-sibling::a"));
		// WebElement ele6=driver.findElement(By.xpath("//img[@class='img-responsive lazy-load comp_img']and//div[@ id='5088810']"));
		    //(//img[@class='img-responsive lazy-load comp_img'])[1]
		    js.executeScript("arguments[0].click();", ele6);	
		
}
	
}
