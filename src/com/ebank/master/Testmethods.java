package com.ebank.master;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class Testmethods extends TestAntns {
    
	@Test(priority=0)
	public void Employee() throws FileNotFoundException{
		 Lib Lb=new Lib();
		 Lb.Employee("Empname", "Pswd23", "Role", "branch");
		 
	}
    @Test(priority=2)
    public void Branch() throws IOException{
    	Lib lb = new Lib();
    	lb.Branch("Branchnamew5","branch adrees 123","12345","INDIA","GOA","GOA");
    }
     @Test(priority=1)
    public void Role()
    {
    	Lib lb = new Lib();
    	lb.role("role name 34","Cashieer","E");
    	
    }

}
