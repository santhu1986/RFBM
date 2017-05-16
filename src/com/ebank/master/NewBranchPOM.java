package com.ebank.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewBranchPOM {
   @FindBy (xpath=".//*[@id='BtnNewBR']")
   WebElement NB;
   
   public void NewB(){
	   NB.click();
   }
}
