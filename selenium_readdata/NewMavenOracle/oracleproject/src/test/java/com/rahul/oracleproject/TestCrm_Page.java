package com.rahul.oracleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestCrm_Page {
	
		FreeCrmLogin TestPage;
		public static WebDriver driver;
		
		@BeforeTest
		public void IntiliZeBrowser()
		{
			driver=new FirefoxDriver();
			driver.navigate().to("https://www.freecrm.com");
			TestPage=PageFactory.initElements(driver,FreeCrmLogin.class);
			
		}
		@Test
		public void test()
		{
			TestPage.Login("rahulece77","Megha77@@");
			
		}
		
}


