package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	WebDriver driver;

	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(id="email") WebElement eid;
	
	@FindBy(name="pass") WebElement password;
	
	@FindBy(id="loginbutton") WebElement loginButton;
	
	public void loginToFB(String email,String pass )
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
		
		}
		
		
		
		eid.sendKeys(email);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	
	
}

