package com.rahul.oracleproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FreeCrmLogin {
	
	@FindBy(how=How.NAME,using="username")
	WebElement Username;
	
	@FindBy(how=How.NAME,using="password")
	WebElement Password;
	
	@FindBy(how=How.XPATH,using="//*[@type='submit']")
	WebElement Login;
	
	
	public void Login(String Usn,String Pwd)
	{
		Username.sendKeys(Usn);
		Password.sendKeys(Pwd);	
	    Login.submit();
		
		
		
		
	}
	

}
