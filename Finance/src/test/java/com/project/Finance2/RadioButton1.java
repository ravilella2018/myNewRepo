package com.project.Finance2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.project.Finance.BasePage;

public class RadioButton1 extends BasePage
{

	@BeforeMethod(groups= {"Regression","Smoke"})
	@Parameters("browser")
	  public void beforeMethod(String btype) throws Exception 
	  {
		launch(btype, loadData("radiourl"));
	  }
	
	
	@Test(groups= {"Regression","Smoke"})
	public void radioButton1()
	{
		WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> rbutton=radio.findElements(By.name("group1"));
		for(int i=0;i<rbutton.size();i++)
		{
			System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
		}
	}
 

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }
	
}
