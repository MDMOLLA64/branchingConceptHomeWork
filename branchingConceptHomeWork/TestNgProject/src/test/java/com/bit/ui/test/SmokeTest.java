package com.bit.ui.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {
	
  @Test
  public void test1() {
	  int a=20;
	  a=a/0;
	  System.out.println("test1");
  }
  
	
  @Test
  public void test6() {
	  Reporter.log("reach to test6");
	
	  System.out.println("test6");
  }
}
