package com.ebank.master;

import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeObj extends TestAntns{
	@Test(dataProvider="Edata")
	public void Empe(String Empname,String Paswrd,String Rolty,String Branch) throws FileNotFoundException
	{
		lb.Employee(Empname, Paswrd, Rolty, Branch);
	}

	
	@DataProvider
	public Object[][] Edata()
	{
		Object[][] obj=new Object[2][4];
		obj[0][0]="Empnam23";
		obj[0][1]="Paswd24";
		obj[0][2]="Cashier";
		obj[0][3]="Branch11";
		
		obj[1][0]="Empnam25";
		obj[1][1]="Paswd26";
		obj[1][2]="Cashier";
		obj[1][3]="Branch11";
		
	     return obj;
		
}
}
