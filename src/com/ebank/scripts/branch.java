package com.ebank.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class branch {
	 WebDriver driver = new FirefoxDriver();
     driver.get("http://192.168.1.200/ranford2/home.aspx");
     driver.manage().window().maximize();
     driver.findElement(By.id("txtuId")).sendKeys("Admin");
     driver.findElement(By.id("txtPword")).sendKeys("Admin");
     driver.findElement(By.id("login")).click();
     driver.findElement(By.xpath(".//*[@id='Table_01']//tbody//tr[2]//td//table//tbody//tr[2]//td//a//img")).click();
     driver.findElement(By.id("BtnNewBR")).click();
     driver.findElement(By.id("txtbName")).sendKeys("xyz123");
     driver.findElement(By.id("txtAdd1")).sendKeys("asdf123");
    // driver.switchTo().alert().accept();
     driver.findElement(By.id("txtZip")).sendKeys("12346");
     Select Country=new Select(driver.findElement(By.id("lst_counrtyU")));
     Country.selectByVisibleText("INDIA");
     Sleeper.sleepTightInSeconds(4);
     Select state=new Select(driver.findElement(By.xpath(".//*[@id='lst_stateI']")));
     state.selectByVisibleText("GOA");
     //driver.findElement(By.id("lst_stateI")).click();
     //driver.findElement(By.id("lst_stateI")).sendKeys("GOA");
    // driver.findElement(By.xpath(".//*[@id='lst_cityI'")).click();
    // driver.findElement(By.xpath(".//*[@id='lst_cityI'")).sendKeys("Nellore");
     Sleeper.sleepTightInSeconds(4);
     Select city=new Select(driver.findElement(By.xpath(".//*[@id='lst_cityI']")));
     city.selectByVisibleText("GOA");
 driver.findElement(By.id("btn_insert")).click();
     
     String message=driver.switchTo().alert().getText();
    if( message.equals("Branch name already Exist") )
    {
    driver.switchTo().alert().accept();
    
    System.out.println(message);
}
    else{
    	 driver.findElement(By.id("btn_insert")).click();
    	}
    

}
