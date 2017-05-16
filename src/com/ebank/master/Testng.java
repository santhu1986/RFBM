package com.ebank.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testng {
	public static WebDriver driver;
	public static String Expval,Actval;
	public static Properties Pr;
	public static FileInputStream fis;
	
@Test(priority=1)	
public void openapp()
{
   Expval ="Ranford Bank";	
   driver=new FirefoxDriver();
   driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
  driver.get("http://192.168.1.200/ranford2/home.aspx");
  Actval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
  if(Expval.equalsIgnoreCase(Actval))
  {
	  System.out.println("Ranford Bank page is displayed");
  }
  
}
@Test(priority=2)
public void AdminLogin() throws IOException
{
	Pr=new Properties();
	fis=new FileInputStream("E:\\Liveselproject\\ebank\\src\\com\\ebank\\properties\\Rep.properties");
	Pr.load(fis);
	Expval= "Welcome to Admin";
	driver.findElement(By.id(Pr.getProperty("Un"))).sendKeys("Admin");
    driver.findElement(By.id(Pr.getProperty("Pwd"))).sendKeys("Admin");
    driver.findElement(By.id(Pr.getProperty("Lgn"))).click();
     Actval =driver.findElement(By.xpath(Pr.getProperty("Wa"))).getText();
     System.out.println(Actval);
    if(Expval.equalsIgnoreCase(Actval))
    {
    	System.out.println("Admin page displayed");
    }
    
}
@Test(priority=3)
public void Branch() throws IOException
{
	Sleeper.sleepTightInSeconds(4);
	
	Pr=new Properties();
	fis=new FileInputStream("E:\\Liveselproject\\ebank\\src\\com\\ebank\\properties\\Rep.properties");
	Pr.load(fis);
	Expval="Sucessfully";
	driver.findElement(By.xpath(Pr.getProperty("ClkBr"))).click();
	Sleeper.sleepTightInSeconds(4);
    driver.findElement(By.xpath(Pr.getProperty("NwBr"))).click();
    driver.findElement(By.id(Pr.getProperty("BrNm"))).sendKeys("Srnagar03");
    driver.findElement(By.id(Pr.getProperty("BrAd"))).sendKeys("Bcdef");
    driver.findElement(By.id(Pr.getProperty("BrZc"))).sendKeys("12345");
    Sleeper.sleepTightInSeconds(4);
    Select Country=new Select(driver.findElement(By.id(Pr.getProperty("BrCntry"))));
    Country.selectByVisibleText("INDIA");
    Sleeper.sleepTightInSeconds(4);
    Select state=new Select(driver.findElement(By.id(Pr.getProperty("BrSte"))));
    state.selectByVisibleText("GOA");
    Sleeper.sleepTightInSeconds(4);
    Select city=new Select(driver.findElement(By.id(Pr.getProperty("BrCty"))));
    city.selectByVisibleText("GOA");
    Sleeper.sleepTightInSeconds(4);
driver.findElement(By.id(Pr.getProperty("BrSb"))).click();
Sleeper.sleepTightInSeconds(4);
     Actval=driver.switchTo().alert().getText();
     driver.switchTo().alert().accept();
     Sleeper.sleepTightInSeconds(4);
   driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
   if(Actval.contains(Expval))
   {
   
   System.out.println(Actval);
}
   else{
   	System.out.println("Branch name already exist");
   	}		
  // return Actval;
}

public String role(String Rn,String Rd,String Rt)
{
	
    driver.navigate().refresh();
    Sleeper.sleepTightInSeconds(4);
    driver.findElement(By.xpath(".//*[@id='Table_01']//tbody//tr[2]//td//table//tbody//tr[4]/td//a//img")).click();
   Sleeper.sleepTightInSeconds(4);
    driver.findElement(By.id("btnRoles")).click();
    driver.findElement(By.id("txtRname")).sendKeys(Rn);
    driver.findElement(By.id("txtRDesc")).sendKeys(Rd);
    Select Rtype= new Select(driver.findElement(By.id("lstRtypeN")));
    Rtype.selectByVisibleText(Rt);
    driver.findElement(By.id("btninsert")).click();
    Sleeper.sleepTightInSeconds(4);
     String msg=driver.switchTo().alert().getText();
     System.out.println(msg);
     driver.switchTo().alert().accept();
     Sleeper.sleepTightInSeconds(4);
     driver.findElement(By.xpath(".//*[@id='Table_01']//tbody//tr//td[1]//a//img")).click();
     return msg;
}

public String Employee(String Empname,String Pswd,String Role,String branch) throws FileNotFoundException
{
    Sleeper.sleepTightInSeconds(4);
    //driver.findElement(By.xpath(".//*[@id='Table_01']//tbody//tr//td[1]//a//img")).click();
     Sleeper.sleepTightInSeconds(4);
     Actval="Successfully";
    // Pr=new Properties();
     //fis=new FileInputStream("E:\\Liveselproject\\ebank\\src\\com\\ebank\\properties\\Rep.properties");
     driver.findElement(By.xpath(Pr.getProperty("Empbutton"))).click();
    driver.findElement(By.xpath(Pr.getProperty("Newemp"))).click();
    driver.findElement(By.xpath(Pr.getProperty("Empname"))).sendKeys(Empname);
    driver.findElement(By.xpath(Pr.getProperty("Emppwd"))).sendKeys(Pswd);
    driver.findElement(By.xpath(Pr.getProperty("Role"))).click();
    driver.findElement(By.xpath(Pr.getProperty("Role"))).sendKeys(Role);
    driver.findElement(By.xpath(Pr.getProperty("Branch"))).click();
    driver.findElement(By.xpath(Pr.getProperty("Branch"))).sendKeys(branch);
    driver.findElement(By.xpath(Pr.getProperty("Submit"))).click();
    Expval= driver.switchTo().alert().getText();
   // System.out.println(msg1);
    driver.switchTo().alert().accept();
    driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
    if(Expval.contains(Actval))
    {
    	System.out.println("Employee Details creted successfully");
    }
    
    else
    {
    	System.out.println("Sorry! Employee already Exist");
    }
	return Expval;
}
@Test(priority=4)
public void Logout() throws IOException
{
	//Sleeper.sleepTightInSeconds(4);
	
	 //driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.xpath(Pr.getProperty("Lgout"))).click();

}
@Test(priority=5)
public void close()
{
	Sleeper.sleepTightInSeconds(4);
	driver.close();
}
}
