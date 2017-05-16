package com.ebank.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleObj extends BaseTest
{
@Test(dataProvider="Rdata")	
public void Role(String RN,String RD,String RT)
{
	LB.role(RN,RD,RT);
}
@DataProvider

public Object[][] Rdata()
{
	Object[][] Obj=new Object[4][3];
	
	Obj[0][0]="axisteller04";
	Obj[0][1]="teller";
	Obj[0][2]="E";
	
	Obj[1][0]="axisteller05";
	Obj[1][1]="teller";
	Obj[1][2]="E";
	
	Obj[2][0]="axisteller06";
	Obj[2][1]="teller";
	Obj[2][2]="E";
			
	Obj[3][0]="axisteller07";
	Obj[3][1]="teller";
	Obj[3][2]="E";
	
	return Obj;
}
}
