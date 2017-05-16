package com.ebank.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class role extends branch {
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

}
