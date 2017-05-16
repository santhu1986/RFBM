package com.ebank.master;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest 
{
	Lib LB=new Lib();

  @BeforeTest
  public void beforeTest() throws IOException 
  {
  LB.AdminLogin();
  }

  @AfterTest
  public void afterTest() throws IOException 
  {
  LB.Logout();
  }

  @BeforeSuite
  public void beforeSuite() 
  {
  LB.openapp();
  }

  @AfterSuite
  public void afterSuite() 
  {
  LB.close();
  }

}
