package com.ebank.master;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BranchObj extends TestAntns {
     @Test(dataProvider="Bdata")
	public void Brnch(String Bn,String Badd,String Bzc,String Ct,String St,String Cy) throws IOException
	{
		lb.Branch(Bn, Badd, Bzc, Ct, St, Cy);
		
	}
	
	@DataProvider
	public Object[][] Bdata(){
		Object[][] obj=new Object[1][6];
		obj[0][0]="Branch21";
		obj[0][1]="Badd456";
		obj[0][2]="12345";
		obj[0][3]="INDIA";
		obj[0][4]="GOA";
		obj[0][5]="GOA";
		return obj;
	}
	
}
