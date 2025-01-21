package com.testng;

import org.testng.annotations.Test;

public class PriorityClass {
	
	//priority=-1 - -1 has the highest priority
  @Test (priority=-1)
  public void log() {
	  System.out.println("login method");
  }
  
  //invocationCount=3 - it will run test for 3 times
  @Test (priority=0, invocationCount=3)
  public void search()
  {
	  System.out.println("search method");
  }
  @Test (priority=1)
  public void addtocart()
  {
	  System.out.println("add to cart method");
  }
  
  //enabled=false - ignore the test case
  @Test (priority=2, enabled=false)
  public void checkout()
  {
	  System.out.println("checkout method");
  }
}
