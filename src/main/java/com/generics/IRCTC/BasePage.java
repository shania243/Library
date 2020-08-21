package com.generics.IRCTC;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	//deselect is used for single select & multiselect both.
	
	public void selectbyvisibletext(WebElement webelement, String text)
	{
		Select sel=new Select(webelement);
		sel.selectByVisibleText(text);	
	}
	
	public void selectbyvalue(WebElement webelement, String value)
	{
		Select sel=new Select(webelement);
		sel.selectByValue(value);	
	}
	
	public void selectbyindex(WebElement webelement, int index)
	{
		Select sel=new Select(webelement);
		sel.selectByIndex(index);	
	}
	
	//deselect is used for multiselect.

	public void deselectbyvisibletext(WebElement webelement, String text)
	{
		Select sel=new Select(webelement);
		sel.deselectByVisibleText(text);	
	}
	
	public void deselectbyvalue(WebElement webelement, String value)
	{
		Select sel=new Select(webelement);
		sel.deselectByValue(value);	
	}
	
	public void deselectbyindex(WebElement webelement, int index)
	{
		Select sel=new Select(webelement);
		sel.deselectByIndex(index);	
	}
	
	public void deselectall(WebElement webelement)
	{
		Select sel=new Select(webelement);
		sel.deselectAll();	
	}
	
	public void ismultiple(WebElement webelement)         //check if single select or multiselect
	{
		Select sel=new Select(webelement);
		sel.isMultiple();	
	}
	
	public void getoptions(WebElement webelement)         //options present in dropdown list
	{
		Select sel=new Select(webelement);
		List<WebElement> alloptions=sel.getOptions();
		System.out.println(alloptions);
	}
	
	//actions class
	public void leftclick(WebDriver driver,WebElement webelement)       
	{
		Actions act=new Actions(driver);
		act.click(webelement).perform();
	}
	
	public void doubleclick(WebDriver driver,WebElement webelement)         
	{
		Actions act=new Actions(driver);
		act.doubleClick(webelement).perform();
	}
	
	public void rightclick(WebDriver driver,WebElement webelement)         
	{
		Actions act=new Actions(driver);
		act.contextClick(webelement).perform();
	}
	
	public void movetoelement(WebDriver driver,WebElement webelement)         //mouse hovering
	{
		Actions act=new Actions(driver);
		act.moveToElement(webelement).perform();
	}
	
	public void clickandhold(WebDriver driver,WebElement webelement) throws InterruptedException    //click n hold for 5sec & then release 
	{
		Actions act=new Actions(driver);
		act.clickAndHold(webelement).perform();
		Thread.sleep(5000);
		act.release(webelement).perform();
	}
	
	public void draganddrop(WebDriver driver,WebElement webelement)         //drag & drop
	{
		Actions act=new Actions(driver);
		
	}
	
	public void javascriptclick(WebDriver driver,WebElement webelement)         
	{
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()",webelement);
	}
	
}
