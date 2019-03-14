package com.project.Ecommerce;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency 
{
  
		
	@Test(priority=1)
	public void orange() 
	{
		System.out.println("orange");
	}
	
	@Test(priority=2, dependsOnMethods= {"orange"})
	public void blue() 
	{
		System.out.println("blue");
	}
	
	@Test(priority=3,dependsOnMethods= {"blue"})
	public void white() 
	{
		System.out.println("white");
		Assert.assertTrue(false);
	}
	
	@Test(priority=4,dependsOnMethods= {"white"})
	public void green() 
	{
		System.out.println("green");
	}
}
