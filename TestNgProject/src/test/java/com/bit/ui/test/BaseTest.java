package com.bit.ui.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	
	
//  @Test(dataProvider = "dp")
//  public void f(Integer n, String s) {
//  }
	
	//learn sequence and where to use
  @BeforeMethod
  public void beforeMethod() {
	  
	  
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("afterMethod");
  }


//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("beforeTest");
	  System.out.println("beforeflhalsfkTest");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("afterSuite");
  }

}
