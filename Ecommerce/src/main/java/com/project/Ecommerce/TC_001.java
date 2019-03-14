package com.project.Ecommerce;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TC_001 extends BasePage
{
	

	public static void main(String[] args) throws Exception 
	{
		launch(loadData("chromebrowser"), loadData("amazonurl"));
		
		//String actlink = driver.findElement(By.linkText("Customer Service")).getText();
		String actlink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String explink="Customer Servic";
		
		System.out.println("Actual Link  :" + actlink);
		System.out.println("Expected Link  :" + explink);
		
		
		//Assert.assertEquals(actlink, explink);
		SoftAssert ass=new SoftAssert();
		//ass.assertEquals(actlink, explink, "1.Customer Service link is not equal..");
		//ass.assertEquals(actlink, explink, "2.Customer Service link is not equal..");
		//ass.assertEquals(actlink, explink, "3.Customer Service link is not equal..");
		ass.assertEquals(true, true, "mismatch");
		ass.assertTrue(actlink.equals(explink), "Customer Service link is not equal..");
		ass.fail("msg1");
		System.out.println("stop it...");
		ass.assertAll();
		
		
		
		//if(actlink.equals(explink))
		//if(actlink.equalsIgnoreCase(explink))
		//if(actlink.contains(explink))
		/*if(actlink.contentEquals(explink))
			System.out.println("Both links are equal...");
		else
			System.out.println("Both links are not equal...");*/
	}

}
