package com.testng;

import org.testng.annotations.Test;

public class GroupClass {
	 @Test (priority=-1, groups="sanity")
	  public void log() {
		  System.out.println("login method");
	  }
	  
	  //invocationCount=3 - it will run test for 3 times
	  @Test (priority=0, groups="Regression")
	  public void search()
	  {
		  System.out.println("search method");
	  }
	  @Test (priority=1, groups= {"sanity","Regression"})
	  public void addtocart()
	  {
		  System.out.println("add to cart method");
	  }
	  
	  //enabled=false - ignore the test case
	  @Test (priority=2, groups="Regression")
	  public void checkout()
	  {
		  System.out.println("checkout method");
	  }
}
