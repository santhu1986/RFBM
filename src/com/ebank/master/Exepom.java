package com.ebank.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exepom 
{
	@Test
public void login()
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://192.168.1.200/ranford2/home.aspx");
	
	RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
	RHP.login();
	
	//AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
	//AHP.Br();
  //AHP.Lout();
  
  BranchClickPOM BC=PageFactory.initElements(driver, BranchClickPOM.class);
  BC.Bb();
  NewBranchPOM NBr=PageFactory.initElements(driver, NewBranchPOM.class);
  NBr.NewB();
}
}
