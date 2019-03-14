package com.project.Ecommerce;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LinksTesting1 extends BasePage
{
	
	@BeforeMethod(groups= {"regression","smoke"})
	@Parameters("browser")
	public void setup(String bytpe) throws Exception
	{
		launch(bytpe, loadData("googleurl"));
		
	}
	
	
	@Test(groups= {"regression","smoke"})
	public void linktesting1()
	
	 {
		String expval="Google Images";
		
		driver.findElement(By.linkText("Images")).click();	
		Reporter.log("Clicked on Image Link");
		String actval=driver.getTitle();
		
		Assert.assertEquals(actval, expval);
		
	 }
	
	@AfterMethod(groups= {"regression","smoke"})
	public void tearDown()
	{
		driver.quit();
	}

}
