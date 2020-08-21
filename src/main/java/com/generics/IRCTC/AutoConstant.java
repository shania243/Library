//it is an interface

package com.generics.IRCTC;

public interface AutoConstant 
{

	String chrome_key="webdriver.chrome.driver";
	String chrome_value="./drivers/chromedriver.exe";
	
	String gecko_key="webdriver.gecko.driver";
	String gecko_value="./drivers/geckodriver.exe";
	
	String ie_key="webdriver.ie.driver";
	//String ie_value="./drivers/iedriver.exe";              
	
	String edge_key="webdriver.edge.driver";
	//String edge_value="./drivers/msedgedriver.exe";
	
	String url="https://www.irctc.co.in/nget/profile/user-registration";
	
	String excel_path="./testData/IRCTC Registration.xlsx";
	
	String sheet_name="UserDetails";
	
}
