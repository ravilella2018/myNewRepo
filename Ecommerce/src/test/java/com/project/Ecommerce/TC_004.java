package com.project.Ecommerce;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_004 extends BasePage
{
  
  @BeforeMethod(groups= {"regression","sanity"})
  @Parameters("browser")
  public void startProcess(String bytpe) throws Exception
  {
	  launch(bytpe, loadData("amazonurl"));
  }
  
  
  @Test(groups= {"regression","sanity"})
  public void amazon() 
  {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
	  driver.findElement(By.xpath("//input[@value='Go']")).click();
  }
  

  @AfterMethod(groups= {"regression","sanity"})
  public void endProcess() 
  {
	  driver.quit();
  }

}
