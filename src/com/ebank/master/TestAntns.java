package com.ebank.master;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestAntns {
	Lib lb=new Lib();
  //@Test
  //public void f() throws FileNotFoundException {
	 // lb.Employee("Empname32", "pwd45", "Cashier", "branch");
  //}
  @BeforeTest
  public void beforeTest() throws IOException {
	  lb.AdminLogin();
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  lb.Logout();
  }

  @BeforeSuite
  public void beforeSuite() {
	  lb.openapp();
  }

  @AfterSuite
  public void afterSuite() {
	  lb.close();
  }

}
