package com.testng;

import org.testng.annotations.Test;

public class ThreadPoolTest {
	
	@Test (priority=-1, invocationCount=3, threadPoolSize=3)
	  public void log() {
		System.out.println("Thread ID : "+Thread.currentThread().getId());
		  System.out.println("login method");
	  }
	  
	   @Test 
	  public void search()
	  {
		  System.out.println("search method");
	  }
	  @Test 
	  public void addtocart()
	  {
		  System.out.println("add to cart method");
	  }
	  
	 @Test
	  public void checkout()
	  {
		  System.out.println("checkout");
		  
	  }
  
}
