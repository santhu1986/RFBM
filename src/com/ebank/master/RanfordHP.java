package com.ebank.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP 

{

	@FindBy (id="txtuId")
	WebElement Un;
	
	@FindBy (id="txtPword")
	WebElement Pwd;
	
	@FindBy (id="login")
	WebElement Lgn;
	
	public void login()
	{
		Un.sendKeys("Admin");
		Pwd.sendKeys("Admin");
		Lgn.click();
	}
	
}
