package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods {
	public MyLeadPage() {
		
	}
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();

		
	}

}
