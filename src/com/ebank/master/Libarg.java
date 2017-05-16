package com.ebank.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Libarg {
	public static WebDriver driver;
	public static String Expval,Actval;
	
public void openapp(String url)
{
   Expval ="Ranford Bank";	
   driver=new FirefoxDriver();
  driver.get(url);
  Actval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
  if(Expval.equalsIgnoreCase(Actval))
  {
	  System.out.println("Ranford Bank page is displayed");
  }
  
}
public void AdminLogin(String Uname, String Pwd)
{
	Expval= "Welcome to Admin";
	driver.findElement(By.id("txtuId")).sendKeys(Uname);
    driver.findElement(By.id("txtPword")).sendKeys(Pwd);
    driver.findElement(By.id("login")).click();
     Actval =driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
    if(Expval.equalsIgnoreCase(Actval))
    {
    	System.out.println("Admin page displayed");
    }
    
}

}
