package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseLib {
	public static WebDriver driver;
	
	@BeforeMethod
	public void browSetup(){
		try{
		if(GenericLib.getconfigdata(GenericLib.configFilePath, "BROWSER").equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",GenericLib.path+"\\resources\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}else if(GenericLib.getconfigdata(GenericLib.configFilePath, "BROWSER").equalsIgnoreCase("Firefox"))
		{
		System.setProperty("webdriver.gecko.driver",GenericLib.path+"\\resources\\geckodriver.exe");
		System.out.println("Firefox Browser is set");
			driver = new FirefoxDriver();
		}
		else{
			System.setProperty("webdriver.ie.driver", GenericLib.path+"\\resources\\IEDriverServer.exe");
			System.out.println("InternetExplorer Browser is set");
			driver = new InternetExplorerDriver();
			}	 
		}
	 catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readUrl(){
		try {
			driver.get(GenericLib.getconfigdata(GenericLib.configFilePath, "TestUrl"));
		} catch (Throwable e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	/*@AfterMethod
	public void browQuit(){
		driver.close();
		}*/
	}