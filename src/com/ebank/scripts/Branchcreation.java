package com.ebank.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Branchcreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        //driver.findElement(By.id("txtbName")).sendKeys("123abxy");
        System.out.println(message);
  }
        else{
        	 driver.findElement(By.id("btn_insert")).click();
        	}
        
        //driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='Table_01']//tbody//tr//td[1]//a//img")).click();
        driver.navigate().refresh();
        Sleeper.sleepTightInSeconds(4);
        driver.findElement(By.xpath(".//*[@id='Table_01']//tbody//tr[2]//td//table//tbody//tr[4]/td//a//img")).click();
       Sleeper.sleepTightInSeconds(4);
        driver.findElement(By.id("btnRoles")).click();
        driver.findElement(By.id("txtRname")).sendKeys("Cashier");
        driver.findElement(By.id("txtRDesc")).sendKeys("Counting Currency ");
        Select Rtype= new Select(driver.findElement(By.id("lstRtypeN")));
        Rtype.selectByVisibleText("E");
        driver.findElement(By.id("btninsert")).click();
         String msg=driver.switchTo().alert().getText();
         System.out.println(msg);
         driver.switchTo().alert().accept();
        //if(Assert.assertEquals(msg, actual))
         Sleeper.sleepTightInSeconds(4);
         driver.findElement(By.xpath(".//*[@id='Table_01']//tbody//tr//td[1]//a//img")).click();
         Sleeper.sleepTightInSeconds(4);
         driver.findElement(By.xpath(".//*[@id='Table_01']//tbody//tr[2]//td//table//tbody//tr[8]//td//a//img")).click();
        driver.findElement(By.id("BtnNew")).click();
        driver.findElement(By.id("txtUname")).sendKeys("qwerty");
        driver.findElement(By.id("txtLpwd")).sendKeys("adc890");
        driver.findElement(By.id("lst_Roles")).click();
        driver.findElement(By.id("lst_Roles")).sendKeys("Cashier");
        driver.findElement(By.id("lst_Branch")).click();
        driver.findElement(By.id("lst_Branch")).sendKeys("xyz123");
        driver.findElement(By.id("BtnSubmit")).click();
        String msg1= driver.switchTo().alert().getText();
        System.out.println(msg1);
        driver.switchTo().alert().accept();
        Sleeper.sleepTightInSeconds(4);
        driver.findElement(By.xpath(".//*[@id='Table_01']//tbody//tr//td[1]//a//img")).click();
        driver.navigate().refresh();
        Sleeper.sleepTightInSeconds(4);
        driver.findElement(By.xpath(".//*[@id='Table_01']//tbody//tr[2]//td//table//tbody//tr[2]//td//a//img")).click();
        Sleeper.sleepTightInSeconds(4);
        driver.findElement(By.id("lst_countryS")).sendKeys("INDIA");
        Sleeper.sleepTightInSeconds(4);
        driver.findElement(By.id("lst_stateS")).click();
        driver.findElement(By.id("lst_stateS")).sendKeys("GOA");
        Sleeper.sleepTightInSeconds(4);
        driver.findElement(By.id("lst_cityS")).click();
        driver.findElement(By.id("lst_cityS")).sendKeys("GOA");
        Sleeper.sleepTightInSeconds(4);
        driver.findElement(By.id("btn_search")).click();
        Sleeper.sleepTightInSeconds(4);
        
        driver.findElement(By.xpath(".//*[@id='DG_bankdetails']//tbody//tr[5]//td[1]"));
        Sleeper.sleepTightInSeconds(4);
        driver.findElement(By.xpath(".//*[@id='Table_01']//tbody//tr//td[3]//a//img")).click();
	    
        
        
        
	}

}
