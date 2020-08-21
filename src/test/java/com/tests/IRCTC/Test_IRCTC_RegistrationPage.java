package com.tests.IRCTC;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.IRCTC.BaseTest;
import com.pages.IRCTC.Irctc_RegistrationPage;

public class Test_IRCTC_RegistrationPage extends BaseTest
{

	@Test
	public void SgnUp() throws IOException
	{
		Irctc_RegistrationPage irctc= new Irctc_RegistrationPage(driver);
		irctc.Irctc_Registration(driver);	
	}
}
