package com.ebank.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchClickPOM {
	@FindBy (xpath=".//*[@id='Table_01']//tbody//tr[2]//td//table//tbody//tr[2]//td//a//img")
	WebElement BT;
	
	public void Bb()
	{
		BT.click();
	
				
		}

}
