package com.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void sample3() throws Throwable  {
		 WebDriver driver;	
		 String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"\\resources\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	 driver.get("https://www.voonik.com/");

	 driver.findElement(By.xpath("//a[text()='Log In ']")).click();
	 driver.findElement(By.xpath("//div[@ id='signup_form']//input[@id='user_email']")).sendKeys("jkghk");

}
}