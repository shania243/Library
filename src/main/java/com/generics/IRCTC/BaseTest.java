package com.generics.IRCTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest implements AutoConstant{           //inheriting property from AutoConstant Interface.
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser()
	{
		//System.setProperty(chrome_key,chrome_value);
		WebDriverManager.chromedriver().setup();         //when chrome key and value is not used
		driver=new ChromeDriver();                       //open browser
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);                                 //enter url
	}
	
	@BeforeSuite
	public void startExecution()
	{
		Reporter.log("Execution is starting",true);
	}
	
	@AfterSuite
	public void endExecution()
	{
		Reporter.log("Execution is completed",true);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
		//driver.quit();
	}

}
