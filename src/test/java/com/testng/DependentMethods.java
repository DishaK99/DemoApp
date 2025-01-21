package com.testng;

import org.testng.annotations.Test;

public class DependentMethods {
	@Test (priority=-1)
	  public void log() {
		  System.out.println("login method");
	  }
	   @Test (priority=0, dependsOnMethods="addtocart")
	  public void search()
	  {
		  System.out.println("search method");
	  }
	  @Test (priority=1,dependsOnMethods= {"log","checkout"})
	  public void addtocart()
	  {
		  System.out.println("add to cart method");
	  }
	   @Test (priority=2)
	  public void checkout()
	  {
		  System.out.println("checkout method");
	  }
}
