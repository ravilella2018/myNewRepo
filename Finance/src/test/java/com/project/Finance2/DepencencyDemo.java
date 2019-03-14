package com.project.Finance2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepencencyDemo 
{
  @Test(priority=1)
  public void orange() 
  {
	  System.out.println("Orange");
  }
  
  @Test(priority=2,dependsOnMethods= {"orange"})
  public void white() 
  {
	  System.out.println("white");
  }
  
  
  @Test(priority=3,dependsOnMethods= {"white"})
  public void blue() 
  {
	  System.out.println("blue");
	  Assert.assertTrue(false);
  }
  
  @Test(priority=4,dependsOnMethods= {"blue"})
  public void green() 
  {
	System.out.println("green");  
  }
}
