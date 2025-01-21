package com.listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	//priority=-1 - -1 has the highest priority
	  @Test (priority=-1)
	  public void log() {
		  System.out.println("login method");
		  Assert.assertEquals(false,true);
	  }
	  
	  
	  @Test (priority=0)
	  public void search()
	  {
		  System.out.println("search method");
		  Assert.assertEquals(false,true);
		  
	  }
	  @Test (priority=1)
	  public void addtocart()
	  {
		  System.out.println("add to cart method");
	  }
	  
	  //enabled=false - ignore the test case
	  @Test (priority=2)
	  public void checkout()
	  {
		  System.out.println("checkout method");
	  }

}
