package com.ebank.master;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class EmployeeNg extends TestAntns {
	
	@Test
	public void Emp() throws FileNotFoundException{
		
		Lib Lb=new Lib();
		Lb.Employee("Empname56", "pwsd67", "Role89", "Branch11");
	}

}
