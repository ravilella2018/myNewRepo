package com.project.Ecommerce1;

import org.testng.annotations.Test;

import com.project.Ecommerce.BasePage;
import com.project.Ecommerce.PageUI;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TC_005 extends BasePage
{
	PageUI page;
  
  @BeforeMethod
  public void startProcess() throws Exception 
  {
	  launch(loadData("chromebrowser"),loadData("automationurl"));
  }
  
  
  @Test
  public void login() 
  {
	  page=new PageUI(driver);
	  page.customerLogin();
	  Assert.assertEquals(page.verifyErrorMsg(), "Authentication failed.");
	  
  }

  @AfterMethod
  public void endProcess() 
  {
	  
  }

}
