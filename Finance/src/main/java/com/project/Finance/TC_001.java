package com.project.Finance;

import org.openqa.selenium.By;

public class TC_001 extends BasePage
{

	public static void main(String[] args) throws Exception 
	{
		launch(loadData("chromebrowser"), loadData("amazonurl"));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");

	}

}
